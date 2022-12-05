package com.uzo.fashionblog_week_nine.services.Impl;

import com.uzo.fashionblog_week_nine.dtos.UserLoginDto;
import com.uzo.fashionblog_week_nine.dtos.UserResponseDto;
import com.uzo.fashionblog_week_nine.dtos.UserSignupDto;
import com.uzo.fashionblog_week_nine.exception.InvalidRequestException;
import com.uzo.fashionblog_week_nine.model.User;
import com.uzo.fashionblog_week_nine.repositories.UserRepository;
import com.uzo.fashionblog_week_nine.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public UserResponseDto signUp(UserSignupDto userSignupDto) {
        User user = new User();
        UserResponseDto userResponseDto = new UserResponseDto();
        if (!userSignupDto.getPassword().equals(userSignupDto.getConfirmPassword())) {
            throw new InvalidRequestException("Password mismatch", "Please retype your password");
        }

        BeanUtils.copyProperties(userSignupDto, user);
        try {
            userRepository.save(user);
        } catch (RuntimeException e) {
            throw new InvalidRequestException(e.getMessage(), "Try again");
        }
        BeanUtils.copyProperties(user, userResponseDto);
        return userResponseDto;
    }

    @Override
    public UserResponseDto login(UserLoginDto userLoginDto) {
        User user = userRepository.findByEmailAndPassword(userLoginDto.getEmail(), userLoginDto.getPassword())
                .orElseThrow(() -> new InvalidRequestException("Invalid login details", "Try again, or signup"));
        UserResponseDto userResponseDto = new UserResponseDto();
        BeanUtils.copyProperties(user, userResponseDto);
        return userResponseDto;
    }

}


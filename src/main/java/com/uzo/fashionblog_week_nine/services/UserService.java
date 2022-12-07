package com.uzo.fashionblog_week_nine.services;

import com.uzo.fashionblog_week_nine.dtos.UserLoginDto;
import com.uzo.fashionblog_week_nine.dtos.UserResponseDto;
import com.uzo.fashionblog_week_nine.dtos.UserSignupDto;

public interface UserService {
    UserResponseDto signUp(UserSignupDto userSignupDto);
    UserResponseDto login(UserLoginDto userLoginDto);

    String deleteUser(Long id);
}

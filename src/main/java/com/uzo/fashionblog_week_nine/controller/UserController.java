package com.uzo.fashionblog_week_nine.controller;


import com.uzo.fashionblog_week_nine.dtos.UserLoginDto;
import com.uzo.fashionblog_week_nine.dtos.UserResponseDto;
import com.uzo.fashionblog_week_nine.dtos.UserSignupDto;
import com.uzo.fashionblog_week_nine.repositories.UserRepository;
import com.uzo.fashionblog_week_nine.services.UserService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
@AllArgsConstructor
//@Tag(name = "User Account API", description = "For User account creation and login")
public class UserController {

//    private final UserRepository userRepository;

    private final UserService userService;

    @PostMapping(value = "/register")
    public ResponseEntity<UserResponseDto> createAccount(@RequestBody UserSignupDto userSignupDto) {
        UserResponseDto userResponseDto = userService.signUp(userSignupDto);
        return new ResponseEntity<>(userResponseDto, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id){
        return userService.deleteUser(id);
    }

    @PostMapping(value = "/login")
    public ResponseEntity<UserResponseDto> loginToAccount(@RequestBody UserLoginDto userLoginDto) {
        UserResponseDto userResponseDto = userService.login(userLoginDto);
        return new ResponseEntity<>(userResponseDto, HttpStatus.ACCEPTED);
    }
}
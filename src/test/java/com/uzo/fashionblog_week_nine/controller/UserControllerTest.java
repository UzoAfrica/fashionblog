package com.uzo.fashionblog_week_nine.controller;

import com.uzo.fashionblog_week_nine.dtos.UserResponseDto;
import com.uzo.fashionblog_week_nine.dtos.UserSignupDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserControllerTest {
    @Autowired
    private UserController userController;

    @Test
    void createAccount() {

        UserSignupDto newUser = new UserSignupDto();
        newUser.setFirstName("Paul");
        newUser.setLastName("Peter");
        newUser.setUserName("Pauloo");
        newUser.setEmail("paul@gmail.com");
        newUser.setPassword("1234");
        newUser.setConfirmPassword("1234");

        ResponseEntity<UserResponseDto> responseEntity= userController.createAccount(newUser);

        assertEquals(responseEntity.getStatusCodeValue(), HttpStatus.CREATED);



    }
}
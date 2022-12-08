package com.uzo.fashionblog_week_nine.controller;


import com.uzo.fashionblog_week_nine.dtos.CommentDto;
import com.uzo.fashionblog_week_nine.dtos.PostDto;
import com.uzo.fashionblog_week_nine.dtos.UserResponseDto;
import com.uzo.fashionblog_week_nine.dtos.UserSignupDto;
import com.uzo.fashionblog_week_nine.services.CommentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor

public class CommentController {
    private final CommentService commentService;

    @PostMapping(value = "/comment")
    public String createComment(@RequestBody CommentDto commentDto){

        commentService.createComment(commentDto);
        return "Commented Successful";
    }
}

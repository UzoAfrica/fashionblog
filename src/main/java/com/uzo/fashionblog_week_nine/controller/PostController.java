package com.uzo.fashionblog_week_nine.controller;


import com.uzo.fashionblog_week_nine.dtos.PostDto;
import com.uzo.fashionblog_week_nine.services.PostService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class PostController {

    private final PostService postService;
    @PostMapping(value = "/post")
    public String createPost(@RequestBody PostDto postDto){

         postService.createPost(postDto);
         return "Successful";
    }

}

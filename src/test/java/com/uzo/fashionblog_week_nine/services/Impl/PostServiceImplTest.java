package com.uzo.fashionblog_week_nine.services.Impl;

import com.uzo.fashionblog_week_nine.controller.PostController;
import com.uzo.fashionblog_week_nine.dtos.PostDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class PostServiceImplTest {

    @Autowired
    private PostController postController;

    @Test
    void createPost() {
        PostDto newPost = new PostDto();
        newPost.setPostTittle("Divine Fashion");
        newPost.setDescription("Great wears available here");
        newPost.setCategories("shorts, suit");

        String msg = postController.createPost(newPost);
        assertEquals(msg ,"Successful");
    }
}
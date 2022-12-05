package com.uzo.fashionblog_week_nine.services.Impl;

import com.uzo.fashionblog_week_nine.dtos.PostDto;
import com.uzo.fashionblog_week_nine.model.Post;
import com.uzo.fashionblog_week_nine.repositories.PostRepository;
import com.uzo.fashionblog_week_nine.services.PostService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PostServiceImpl implements PostService {
 private final PostRepository postRepository;

    @Override
    public PostDto createPost(PostDto postDto) {

        Post post= new Post();
        BeanUtils.copyProperties(postDto, post);
        postRepository.save(post);
        return postDto;
    }


}

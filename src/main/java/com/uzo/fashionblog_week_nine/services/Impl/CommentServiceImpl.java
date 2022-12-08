package com.uzo.fashionblog_week_nine.services.Impl;

import com.uzo.fashionblog_week_nine.dtos.CommentDto;
import com.uzo.fashionblog_week_nine.dtos.PostDto;
import com.uzo.fashionblog_week_nine.dtos.UserResponseDto;
import com.uzo.fashionblog_week_nine.model.Comment;
import com.uzo.fashionblog_week_nine.model.Post;
import com.uzo.fashionblog_week_nine.model.User;
import com.uzo.fashionblog_week_nine.repositories.CommentRepository;
import com.uzo.fashionblog_week_nine.repositories.PostRepository;
import com.uzo.fashionblog_week_nine.repositories.UserRepository;
import com.uzo.fashionblog_week_nine.services.CommentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CommentServiceImpl implements CommentService {

    private final UserRepository userRepository;
    private final PostRepository postRepository;
    private final CommentRepository commentRepository;

//    @Override
//    public CommentDto createComment(CommentDto commentDto, Long userId, Long postId) {
//        Post post = postRepository.findById(postId).get();
//        User user = userRepository.findById(userId).get();
//
//        Comment comment = new Comment();
//        comment.setText(commentDto.getText());
//        comment.setUser(user);
//        comment.setPost(post);
//
//        commentRepository.save(comment);
//        return commentDto;
//    }

    @Override
    public CommentDto createComment(CommentDto commentDto) {

        Comment comment= new Comment();
        Post post = new Post();
        post.setPostId(commentDto.getPostId());
        User user = new User();
        user.setUserId(commentDto.getUserId());
        BeanUtils.copyProperties(commentDto, comment);
        comment.setPost(post);
        comment.setUser(user);
        commentRepository.save(comment);
        return commentDto;
    }
}


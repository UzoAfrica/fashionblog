package com.uzo.fashionblog_week_nine.services;

import com.uzo.fashionblog_week_nine.dtos.CommentDto;

public interface CommentService {
    CommentDto createComment (CommentDto commentDto, Long userId, Long postId);

}

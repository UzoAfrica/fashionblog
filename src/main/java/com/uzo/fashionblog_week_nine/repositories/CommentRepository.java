package com.uzo.fashionblog_week_nine.repositories;

import com.uzo.fashionblog_week_nine.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}

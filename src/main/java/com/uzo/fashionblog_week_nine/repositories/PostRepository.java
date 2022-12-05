package com.uzo.fashionblog_week_nine.repositories;

import com.uzo.fashionblog_week_nine.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}

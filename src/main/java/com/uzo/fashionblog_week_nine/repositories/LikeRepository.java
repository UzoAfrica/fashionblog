package com.uzo.fashionblog_week_nine.repositories;

import com.uzo.fashionblog_week_nine.model.Likes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<Likes, Long> {
}

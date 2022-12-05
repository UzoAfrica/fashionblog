package com.uzo.fashionblog_week_nine.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PostDto {

    private String postTittle;
    private String categories;
    private String description;

}

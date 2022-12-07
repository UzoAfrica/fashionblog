package com.uzo.fashionblog_week_nine.dtos;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommentDto {


    private Long Id;
    private String userName;
    private String text;
}

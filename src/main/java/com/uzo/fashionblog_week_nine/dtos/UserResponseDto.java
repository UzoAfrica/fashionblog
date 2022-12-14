package com.uzo.fashionblog_week_nine.dtos;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserResponseDto {
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String password;


}

package com.uzo.fashionblog_week_nine.dtos;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserSignupDto {
//    @NotEmpty
    private String firstName;

//    @NotEmpty
    private String lastName;

    private String userName;

//    @NotEmpty
    private String email;

//    @NotEmpty
    private String password;

//    @NotEmpty
    private String confirmPassword;
}

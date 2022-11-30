package com.uzo.fashionblog_week_nine.model;


import lombok.*;

import javax.persistence.*;

@Entity
@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "blog_name")
    private String blogName;
    @Column(name = "contact")
    private String contact;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
}

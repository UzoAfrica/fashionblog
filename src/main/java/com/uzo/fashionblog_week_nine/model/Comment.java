package com.uzo.fashionblog_week_nine.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Long Id;
    private String userName;
    private String commentDescription;

    @CreationTimestamp
    private LocalDateTime createdAt;


    @ManyToOne
    User user = new User();



}

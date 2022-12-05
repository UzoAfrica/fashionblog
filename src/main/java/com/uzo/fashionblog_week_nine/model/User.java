package com.uzo.fashionblog_week_nine.model;


import com.fasterxml.jackson.databind.deser.Deserializers;
import lombok.*;
import org.springframework.scheduling.config.Task;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 50)
    private String lastName;

    @Column(name = "user_name", nullable = false, length = 50)
    private String userName;

    @Column(name = "email", nullable = false, length = 50, unique = true)
    private String email;

    @Column(name = "password", nullable = false, length = 50)
    private String password;

//    @OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE, orphanRemoval = true)
//    private Set<Task> tasks;
}

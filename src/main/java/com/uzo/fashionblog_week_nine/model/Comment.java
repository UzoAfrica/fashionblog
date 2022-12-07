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
    @Column(columnDefinition = "TEXT")
    private String text;
    @CreationTimestamp
    private LocalDateTime createdAt;
    @ManyToOne
    @JoinColumn(name = "user",
               foreignKey = @ForeignKey(name= "user_comment_id_fk"))
    private User user;
    @ManyToOne
    @JoinColumn(name = "post",
                foreignKey = @ForeignKey(name = "post_comment_id_fk"))
    private Post post;

    @Override
    public String toString() {
        return "Comment{" +
                "Id=" + Id +
                ", text='" + text + '\'' +
                ", createdAt=" + createdAt +
                ", user=" + user +
                ", post=" + post +
                '}';
    }
}

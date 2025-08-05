package com.example.BlogPost.Modellor;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String content;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}

package com.example.BlogPost.Modellor;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String name;
    @OneToMany(mappedBy ="user", cascade = CascadeType.ALL)
    private List<Post> posts;

}

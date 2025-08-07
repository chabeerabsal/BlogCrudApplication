package com.example.BlogPost.Repo;

import com.example.BlogPost.Modellor.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepo extends JpaRepository<Post,Long> {

    List<Post> findByTitleContainingIgnoreCaseOrContentContainingIgnoreCase(String keyword, String keyword1);
}

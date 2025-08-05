package com.example.BlogPost.Repo;

import com.example.BlogPost.Modellor.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository<Post,Long> {

}

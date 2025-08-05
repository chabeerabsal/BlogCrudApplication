package com.example.BlogPost.Repo;

import com.example.BlogPost.Modellor.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}

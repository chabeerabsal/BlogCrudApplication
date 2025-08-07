package com.example.BlogPost.Service;

import aj.org.objectweb.asm.commons.Remapper;
import com.example.BlogPost.Modellor.Post;
import com.example.BlogPost.Modellor.User;
import com.example.BlogPost.Repo.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepo postRepository;

    public Optional<Post> getUserById(Long id) {
        return postRepository.findById(id);
    }

    public Post createPost(Post post) {
        return postRepository.save(post);
    }

    //public List<Post> getAllPosts() {
  //      return postRepository.findAll();
   // }

    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }

    public Page<Post> getAllPosts(int page, int size, String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return postRepository.findAll(pageable);
    }

    public List<Post> searchPosts(String keyword) {
        return postRepository.findByTitleContainingIgnoreCaseOrContentContainingIgnoreCase(keyword, keyword);
    }
}
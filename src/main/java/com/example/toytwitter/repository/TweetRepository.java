package com.example.toytwitter.repository;

import com.example.toytwitter.entity.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TweetRepository extends JpaRepository<Tweet, Integer> {
    List<Tweet> findByUserIdOrderByIdDesc(Integer userId);
}

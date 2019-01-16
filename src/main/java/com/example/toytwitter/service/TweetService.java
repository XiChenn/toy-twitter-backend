package com.example.toytwitter.service;

import com.example.toytwitter.entity.Tweet;
import com.example.toytwitter.repository.TweetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TweetService {

    @Autowired
    private TweetRepository tweetRepository;

    public List<Tweet> findByUserId(Integer id) {
        return tweetRepository.findByUserIdOrderByIdDesc(id);
    }

    public Tweet save(Tweet tweet) {
        return tweetRepository.save(tweet);
    }
}

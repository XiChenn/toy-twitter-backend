package com.example.toytwitter.controller;

import com.example.toytwitter.entity.Tweet;
import com.example.toytwitter.service.TweetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TweetController {

    @Autowired
    TweetService tweetService;

    @CrossOrigin(origins = "*")
    @GetMapping("/tweet/user/{userId}")
    public List<Tweet> getTweetByUserId(@PathVariable("userId") Integer userId) {
        List<Tweet> tweets = tweetService.findByUserId(userId);
        return tweets;
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/tweet/user/{userId}")
    public void createTweet(@PathVariable("userId") Integer userId, @RequestParam("content") String content) {
        Tweet tweet = new Tweet();
        tweet.setContent(content);
        tweet.setUserId(userId);
        tweetService.save(tweet);
    }
}

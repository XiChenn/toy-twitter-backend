package com.example.toytwitter.service;

import com.example.toytwitter.entity.Tweet;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TweetServiceTest {

    @Autowired
    TweetService tweetService;

    @Test
    public void findByUserId() {
        List<Tweet> tweets = tweetService.findByUserId(1);
        Assert.assertNotEquals(0, tweets.size());
    }

    @Test
    public void save() {
        Tweet tweet = new Tweet();
        tweet.setContent("I love SpringBoot");
        tweet.setUserId(1);
        Assert.assertNotNull(tweetService.save(tweet));
    }
}
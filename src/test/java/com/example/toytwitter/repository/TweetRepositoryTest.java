package com.example.toytwitter.repository;

import com.example.toytwitter.entity.Tweet;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TweetRepositoryTest {

    @Autowired
    private TweetRepository tweetRepository;

    @Test
    public void saveTest() {
        Tweet tweet = new Tweet();
        tweet.setUserId(1);
        tweet.setContent("Today is a nice day");

        Assert.assertNotNull(tweetRepository.save(tweet));
    }
}
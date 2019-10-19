package com.example.toytwitter.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class TweetControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getTweetByUserId() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/tweet/user/1"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void creatTweet() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/tweet/user/1")
                .param("content", "Testing controller using the mock"))
                .andExpect(MockMvcResultMatchers.status().isOk());

    }
}
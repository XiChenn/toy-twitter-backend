package com.example.toytwitter.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Tweet {

    @Id
    @GeneratedValue
    private Integer id;

    private Integer userId;

    private String content;
}

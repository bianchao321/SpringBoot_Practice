package com.bc.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("redis")
public class RedisConntroller {
    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping
    public String testRedis(){

        redisTemplate.opsForValue().set("nane", "bianchao");
        String name = (String) redisTemplate.opsForValue().get("nane");
        return name;
    }
}

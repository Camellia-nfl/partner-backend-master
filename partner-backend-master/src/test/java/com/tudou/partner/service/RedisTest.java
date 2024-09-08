package com.tudou.partner.service;

import com.tudou.partner.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import javax.annotation.Resource;

/**
 * Redis 测试
 *
 * @author <a href="https://github.com/Camellia-nfl/">程序员土豆</a>
 * @from 
 */
@SpringBootTest
public class RedisTest {

    @Resource
    private RedisTemplate redisTemplate;

    @Test
    void test() {
        ValueOperations valueOperations = redisTemplate.opsForValue();
        // 增
        valueOperations.set("tudouString", "dog");
        valueOperations.set("tudouInt", 1);
        valueOperations.set("tudouDouble", 2.0);
        User user = new User();
        user.setId(1L);
        user.setUsername("tudou");
        valueOperations.set("tudouUser", user);
        // 查
        Object tudou = valueOperations.get("tudouString");
        Assertions.assertTrue("dog".equals((String) tudou));
        tudou = valueOperations.get("tudouInt");
        Assertions.assertTrue(1 == (Integer) tudou);
        tudou = valueOperations.get("tudouDouble");
        Assertions.assertTrue(2.0 == (Double) tudou);
        System.out.println(valueOperations.get("tudouUser"));
        valueOperations.set("tudouString", "dog");
        redisTemplate.delete("tudouString");
    }
}

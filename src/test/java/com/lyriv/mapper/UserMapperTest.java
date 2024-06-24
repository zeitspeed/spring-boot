package com.lyriv.mapper;

import com.lyriv.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest

public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void testFindall() {
        List<User> users = userMapper.findAll();
        for (User user : users) {
            System.out.printf(String.valueOf(user));
        }
        System.out.println(userMapper.findById(2));
    }
}

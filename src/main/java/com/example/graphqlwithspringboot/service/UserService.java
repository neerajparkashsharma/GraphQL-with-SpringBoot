package com.example.graphqlwithspringboot.service;

import com.example.graphqlwithspringboot.model.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
    private final Map<Long, User> users = new HashMap<>();
    private long nextId = 1;

    public User createUser(User user) {
        user.setId(nextId++);
        users.put(user.getId(), user);
        return user;
    }

    public User getUserById(Long id) {
        return users.get(id);
    }
}

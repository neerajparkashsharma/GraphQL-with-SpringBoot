package com.example.graphqlwithspringboot.service;

import com.example.graphqlwithspringboot.model.User;
import org.springframework.stereotype.Service;

 import java.util.List;
import java.util.ArrayList;

@Service
public class UserService {
    private final List<User> users = new ArrayList<>();

    private static long nextId = 1;

    public User createUser(User user) {
        user.setId(nextId++);
        users.add(user);
        return user;
    }

    public User getUserById(Long id) {
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<User> getAllUsers() {
        return users;
    }
}

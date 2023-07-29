package com.example.graphqlwithspringboot.resolver;

import com.example.graphqlwithspringboot.model.User;
import com.example.graphqlwithspringboot.service.UserService;

public class UserResolver {
    private final UserService userService;

    public UserResolver(UserService userService) {
        this.userService = userService;
    }

    public User getUser(Long id) {
        return userService.getUserById(id);
    }

    public User createUser(String name, String email, String password, String username) {
        User newUser = new User();
        newUser.setName(name);
        newUser.setEmail(email);
        newUser.setPassword(password);
        newUser.setUsername(username);

        return userService.createUser(newUser);
    }
}

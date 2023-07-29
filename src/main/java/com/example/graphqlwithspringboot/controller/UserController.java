package com.example.graphqlwithspringboot.controller;

import com.example.graphqlwithspringboot.model.User;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {
        @QueryMapping
        public User userById(@Argument Long id) {
            return User.getById(id);
        }

        @SchemaMapping(typeName = "User")
        public User user(@Argument String name, String email, String password, String username) {
            User newUser = new User();
            newUser.setName(name);
            newUser.setEmail(email);
            newUser.setPassword(password);
            newUser.setUsername(username);
            return newUser;
        }
}

package com.example.graphqlwithspringboot.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long id;
    private String name;
    private String email;
    private String password;
    private String username;
    private static List<User> users = Arrays.asList(
            new User(1L,"user-1", "user1@gmail.com", "1222", "us-1"),
            new User(2L,"user-2", "user2@gmail.com", "12112", "us-2")
    );

    public static User getById(Long id) {
        return users.stream().filter(u -> u.getId().equals(id)).findFirst().orElse(null);
    }

    public Long getId() {
        return id;
    }

}

package com.duc.oauth2.service;

import com.duc.oauth2.entity.User;

import java.util.List;

public interface UserService {
    User createUser(User user);
    List<User> getUsers();
    User getUserById(Long userId);
    User updateUser(Long userId, User user);
}

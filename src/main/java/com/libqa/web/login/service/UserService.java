package com.libqa.web.login.service;

import com.libqa.entity.User;

public interface UserService {
    public User findUserByEmail(String email);
    public void saveUser(User user);
}
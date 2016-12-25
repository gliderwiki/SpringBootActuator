package com.libqa.web.service;

import com.libqa.web.entity.User;
import com.libqa.web.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author : yion
 * @Date : 2016. 12. 20.
 * @Description :
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User addUser(String name, String userId) {
        User user = new User(name, userId);
        return userRepository.save(user);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(long id) {
        return userRepository.findOne(id);
    }

}

package com.libqa.web.service;

import com.libqa.web.repository.User;
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

    public User findByIdx(long idx) {
        return userRepository.findByIdx(idx);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }
}

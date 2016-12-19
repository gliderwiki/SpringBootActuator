package com.libqa.web.repository;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : yion
 * @Date : 2016. 12. 20.
 * @Description :
 */
@Component
public class UserRepository {
    List<User> userList = new ArrayList();
    public UserRepository() {
        User user1 = new User(1, "namhee", "quick");
        User user2 = new User(2, "sonsiri", "dog");
        User user3 = new User(3, "gunhae", "dak");

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
    }

    public User findByIdx(long idx) {
        User user = null;
        for (User u : userList) {

            if (idx == u.getIdx()) {
                user = u;
            } else {
                user = null;
            }
        }

        return user;
    }

    public List<User> findAll() {
        return userList;
    }
}

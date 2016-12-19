package com.libqa.web.repository;

import javax.persistence.Entity;

/**
 * @Author : yion
 * @Date : 2016. 12. 19.
 * @Description :
 */
public class User {


    private long idx;
    private String name;
    private String userId;

    public User(long idx, String name, String userId) {
        this.idx = idx;
        this.name = name;
        this.userId = userId;
    }

    public long getIdx() {
        return idx;
    }

    public void setIdx(long idx) {
        this.idx = idx;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "User{" +
                "idx=" + idx +
                ", name='" + name + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}

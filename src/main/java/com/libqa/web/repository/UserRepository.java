package com.libqa.web.repository;

import com.libqa.web.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : yion
 * @Date : 2016. 12. 20.
 * @Description : User 리파지토리 인터페이스
 */
public interface UserRepository extends JpaRepository<User, Long> {

}

package com.libqa.web.member.repository;

import com.libqa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author : yion
 * @Date : 2016. 12. 20.
 * @Description : User 리파지토리 인터페이스
 */
public interface UserRepository extends JpaRepository<User, Long> {

}

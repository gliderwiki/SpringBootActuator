package com.libqa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * @Author : yion
 * @Date : 2016. 12. 19.
 * @Description : 회원 정보 엔티티
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Member {

    @Id
    @Column(name = "seq")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int seq;

    @Column(name = "name")
    private String name;

    @ManyToOne(optional = false)
    @JoinColumn(name = "team_seq")  // @ManyToOne의 fetch 기본전략은 EAGER이다.
    private Team team;

    public Member(Team team, String name) {
        this.team = team;
        this.name = name;
    }

}
package com.libqa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

/**
 * @Author : yion
 * @Date : 2016. 12. 27.
 * @Description :
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Team {

    @Id
    @Column(name = "seq")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int seq;

    @Column(name = "team_name")
    private String teamName;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "team", fetch = FetchType.LAZY) // @OneToMany의 fetch 기본전략은 LAZY이다.
    private Collection<Member> member;

    public Team(String teamName) {
        this.teamName = teamName;
    }

}

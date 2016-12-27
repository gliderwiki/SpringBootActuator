package com.libqa.web.member.service;

import com.libqa.entity.Member;
import com.libqa.entity.Team;

import java.util.List;

/**
 * @Author : yion
 * @Date : 2016. 12. 27.
 * @Description :
 */
public interface RepositoryService {

    Team addTeam(Team team);

    Team findTeamBySeq(int seq);

    Member addMember(Member member, int seq);

    List<Team> findTeamAll();

}

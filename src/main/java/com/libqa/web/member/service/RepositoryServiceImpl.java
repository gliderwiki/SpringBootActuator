package com.libqa.web.member.service;

import com.libqa.entity.Member;
import com.libqa.entity.Team;
import com.libqa.web.member.repository.MemberRepository;
import com.libqa.web.member.repository.TeamRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @Author : yion
 * @Date : 2016. 12. 27.
 * @Description :
 */
@Slf4j
@Service
public class RepositoryServiceImpl implements RepositoryService {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private TeamRepository teamRepository;

    public RepositoryServiceImpl() {
    }

    @Override
    public Team addTeam(Team team) {
        return teamRepository.save(team);
    }

    @Override
    public Team findTeamBySeq(int seq) {
        return teamRepository.findOne(seq);
    }

    @Override
    public Member addMember(Member member, int seq) {
        Team team = teamRepository.findOne(seq);
        Member saveEntity = new Member(team, member.getName());
        return memberRepository.save(saveEntity);
    }

    @Override
    public List<Team> findTeamAll() {
        return teamRepository.findAll();
    }

}

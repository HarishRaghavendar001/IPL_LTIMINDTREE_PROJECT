package com.wecp.progressive.service.impl;

import java.util.List;

import com.wecp.progressive.entity.Team;
import com.wecp.progressive.service.TeamService;

public class TeamServiceImplArraylist implements TeamService {

    @Override
    public List<Team> getAllTeams() {
        return List.of();
    }

    @Override
    public int addTeam(Team team) {
        return -1;
    }

    @Override
    public List<Team> getAllTeamsSortedByName() {
        return List.of();
    }
    @Override
    public void emptyArrayList(){
        TeamService.super.emptyArrayList();
    }
}


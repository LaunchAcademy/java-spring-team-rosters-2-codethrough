package com.launchacademy.teamrosterwithspring.services;

import com.launchacademy.teamrosterwithspring.models.Team;
import com.launchacademy.teamrosterwithspring.repositories.TeamRepository;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService{

  private final TeamRepository teamRepository;

  @Autowired
  public TeamService(
      TeamRepository teamRepository) {
    this.teamRepository = teamRepository;
  }

  public void save(Team team) {
    teamRepository.save(team);
  }

  public List<Team> findByTeamName(String teamName) {
    return teamRepository.findByTeamName(teamName);
  }
}

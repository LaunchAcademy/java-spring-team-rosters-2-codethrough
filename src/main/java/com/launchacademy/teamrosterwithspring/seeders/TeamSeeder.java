package com.launchacademy.teamrosterwithspring.seeders;

import com.launchacademy.teamrosterwithspring.models.Team;
import com.launchacademy.teamrosterwithspring.services.TeamService;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TeamSeeder implements CommandLineRunner {

  private TeamService teamService;

  @Autowired
  public TeamSeeder(TeamService teamService) {
    this.teamService = teamService;
  }

  @Override
  public void run(String... args) throws Exception {
    List<String> teamNamesList = Arrays.asList("Norway", "South Korea", "Sweden",
        "Switzerland", "United States", "Japan");

    for(String teamName : teamNamesList) {
      if (teamService.findByTeamName(teamName).size() == 0) {
        Team team = new Team();
        team.setTeamName(teamName);
        teamService.save(team);
      }
    }
  }
}

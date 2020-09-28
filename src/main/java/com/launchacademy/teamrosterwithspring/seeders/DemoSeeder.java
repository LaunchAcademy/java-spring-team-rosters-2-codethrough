package com.launchacademy.teamrosterwithspring.seeders;

import com.launchacademy.teamrosterwithspring.models.Player;
import com.launchacademy.teamrosterwithspring.models.Team;
import com.launchacademy.teamrosterwithspring.repositories.PlayerRepository;
import com.launchacademy.teamrosterwithspring.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoSeeder implements CommandLineRunner {
private TeamRepository teamRepository;
private PlayerRepository playerRepository;

  @Autowired
  public DemoSeeder(TeamRepository teamRepository, PlayerRepository playerRepository){
    this.teamRepository = teamRepository;
    this.playerRepository = playerRepository;
  }

  @Override
  public void run(String... args) throws Exception {
    Team team = new Team();
    Player player = new Player();

    team.setTeamName("The New Team");
    teamRepository.save(team);

    player.setName("Pat");
    player.setPosition("Forward");
    player.setTeam(team);
    playerRepository.save(player);


  }
}

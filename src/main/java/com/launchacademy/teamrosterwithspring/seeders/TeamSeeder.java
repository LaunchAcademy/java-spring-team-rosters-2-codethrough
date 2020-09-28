//package com.launchacademy.teamrosterwithspring.seeders;
//
//import com.google.inject.internal.util.Lists;
//import com.launchacademy.teamrosterwithspring.models.Team;
//import com.launchacademy.teamrosterwithspring.repositories.TeamRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class TeamSeeder implements CommandLineRunner {
//  private TeamRepository teamRepository;
//
//  @Autowired
//  public TeamSeeder(TeamRepository teamRepository){
//    this.teamRepository = teamRepository;
//  }
//
//  @Override
//  public void run(String... args) throws Exception {
//    if (Lists.newArrayList(teamRepository.findAll()).size() ==0 ) {
//      Team team = new Team();
//      team.setTeamName("The Jets");
//      teamRepository.save(team);
//    }
//  }
//}

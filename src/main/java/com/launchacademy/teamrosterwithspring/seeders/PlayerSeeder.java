package com.launchacademy.teamrosterwithspring.seeders;

import com.launchacademy.teamrosterwithspring.models.Player;
import com.launchacademy.teamrosterwithspring.repositories.PlayerRepository;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PlayerSeeder implements CommandLineRunner {

  private PlayerRepository playerRepository;

  @Autowired
  private PlayerSeeder(PlayerRepository playerRepository) {
    this.playerRepository = playerRepository;
  }

  @Override
  public void run(String... args) throws Exception {
    Map<String, String> playersSeedMap = new HashMap<>();

    playersSeedMap.put("Thomas Ulsrud", "Skip");
    playersSeedMap.put("Torger Nergård", "Third");
    playersSeedMap.put("Christoffer Svae", "Second");
    playersSeedMap.put("Håvard Vad Petersson", "Lead");
    playersSeedMap.put("Markus Høiberg", "Alternate");

    playersSeedMap.put("Kim Chang-min", "Skip");
    playersSeedMap.put("Seong Se-hyeon", "Third");
    playersSeedMap.put("Oh Eun-su", "Second");
    playersSeedMap.put("Lee Ki-bok", "Lead");
    playersSeedMap.put("Kim Min-chan", "Alternate");

    playersSeedMap.put("Niklas Edin", "Skip");
    playersSeedMap.put("Oscar Eriksson", "Third");
    playersSeedMap.put("Rasmus Wranå", "Second");
    playersSeedMap.put("Christoffer Sundgren", "Lead");
    playersSeedMap.put("Henrik Leek", "Alternate");

    playersSeedMap.put("Benoît Schwarz", "Fourth");
    playersSeedMap.put("Claudio Pätz", "Third");
    playersSeedMap.put("Peter de Cruz", "Skip");
    playersSeedMap.put("Valentin Tanner", "Lead");
    playersSeedMap.put("Dominik Märki", "Alternate");

    playersSeedMap.put("John Shuster", "Skip");
    playersSeedMap.put("Tyler George", "Third");
    playersSeedMap.put("Matt Hamilton", "Second");
    playersSeedMap.put("John Landsteiner", "Lead");
    playersSeedMap.put("Joe Polo", "Alternate");

    for (String key : playersSeedMap.keySet()){
      List<Player> playerList = playerRepository.findAllByName(key);
      if(playerList.isEmpty()){
        Player player = new Player();
        player.setName(key);
        player.setPosition(playersSeedMap.get(key));
        playerRepository.save(player);
      }
    }

  }


}
package com.launchacademy.teamrosterwithspring.seeders;

import com.launchacademy.teamrosterwithspring.models.Player;
import com.launchacademy.teamrosterwithspring.services.PlayerService;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PlayerSeeder implements CommandLineRunner {
  private PlayerService playerService;

  @Autowired
  public PlayerSeeder(PlayerService playerService) {
    this.playerService = playerService;
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

    for (String playerName : playersSeedMap.keySet()) {
      if (playerService.findByName(playerName).size() == 0) {
        //then create and add player
        Player player = new Player();
        player.setName(playerName);
        player.setPosition(playersSeedMap.get(playerName));
        playerService.save(player);
      }
    }
  }
}

package com.launchacademy.teamrosterwithspring.services;

import com.launchacademy.teamrosterwithspring.models.Player;
import com.launchacademy.teamrosterwithspring.repositories.PlayerRepository;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
  private PlayerRepository playerRepository;

  @Autowired
  public PlayerService(
      PlayerRepository playerRepository) {
    this.playerRepository = playerRepository;
  }

  public List<Player> findByName(String playerName) {
    return playerRepository.findByName(playerName);
  }

  public void save(Player player) {
    playerRepository.save(player);
  }
}

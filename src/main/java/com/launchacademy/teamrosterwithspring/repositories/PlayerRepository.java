package com.launchacademy.teamrosterwithspring.repositories;

import com.launchacademy.teamrosterwithspring.models.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface PlayerRepository extends CrudRepository<Player, Integer> {
}

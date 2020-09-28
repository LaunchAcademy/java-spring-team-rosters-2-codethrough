package com.launchacademy.teamrosterwithspring.repositories;

import com.launchacademy.teamrosterwithspring.models.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;


public interface TeamRepository extends CrudRepository<Team, Integer> {
}

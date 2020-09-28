package com.launchacademy.teamrosterwithspring.models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name="teams")
public class Team {
  @Id
  @SequenceGenerator(name="team_generator",
      sequenceName="teams_id_seq", allocationSize = 1)
  @GeneratedValue(strategy= GenerationType.SEQUENCE,
      generator="team_generator")
  @Column(name="id", nullable=false, unique=true)
  private Integer id;

  @Column(name="team_name")
  private String teamName;

  @OneToMany(mappedBy = "team")
  private List<Player> players = new ArrayList<>();

}


package com.codeoftheweb.salvo.Repositories;

import com.codeoftheweb.salvo.Entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PlayerRepository extends JpaRepository<Player, Long> {

  Player findByUsername(String username);

}

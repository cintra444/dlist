package com.cintra.dlist.repositories;

import com.cintra.dlist.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}

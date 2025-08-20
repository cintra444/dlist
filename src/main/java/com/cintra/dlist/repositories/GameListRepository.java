package com.cintra.dlist.repositories;

import com.cintra.dlist.model.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}

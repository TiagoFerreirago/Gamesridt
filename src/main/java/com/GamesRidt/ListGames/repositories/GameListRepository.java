package com.GamesRidt.ListGames.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GamesRidt.ListGames.entities.Game;
import com.GamesRidt.ListGames.entities.GameList;


public interface GameListRepository extends JpaRepository <GameList, Long> {

}

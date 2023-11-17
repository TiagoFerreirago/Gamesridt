package com.GamesRidt.ListGames.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GamesRidt.ListGames.entities.Game;
// realizar consulta ao banco (inserir,deletar,buscar e etc)
// camada de acesso a dados
public interface GameRepository extends JpaRepository <Game, Long> {

}

package com.GamesRidt.ListGames.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.GamesRidt.ListGames.entities.Game;
import com.GamesRidt.ListGames.projection.GameMinProjection;
// realizar consulta ao banco (inserir,deletar,buscar e etc)
// camada de acesso a dados
public interface GameRepository extends JpaRepository <Game, Long> {
	//realizando a consulta através da inserção do id
	@Query(nativeQuery = true, value = """
			SELECT tb_game.id, tb_game.title, tb_game.game_year AS `year`, tb_game.img_url AS imgUrl,
			tb_game.short_description AS shortDescription, tb_belonging.position
			FROM tb_game
			INNER JOIN tb_belonging ON tb_game.id = tb_belonging.game_id
			WHERE tb_belonging.list_id = :listId
			ORDER BY tb_belonging.position
				""")
	List <GameMinProjection> searchByList(Long listId);
}

package com.GamesRidt.ListGames.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.GamesRidt.ListGames.DTO.GameDto;
import com.GamesRidt.ListGames.DTO.GameListDto;
import com.GamesRidt.ListGames.DTO.GameMinDto;
import com.GamesRidt.ListGames.entities.Game;
import com.GamesRidt.ListGames.entities.GameList;
import com.GamesRidt.ListGames.repositories.GameListRepository;
import com.GamesRidt.ListGames.repositories.GameRepository;

//anotação realiza o registro do componente servico
@Service
public class GameListService {

	//Anotação de dependencia
	@Autowired
	private GameListRepository gameListRepository ;
	
	@Transactional(readOnly = true)
	public List<GameListDto> findAll(){
		List <GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDto(x)).toList();
		
	}
	

	
}
	

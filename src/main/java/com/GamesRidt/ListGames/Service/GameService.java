package com.GamesRidt.ListGames.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GamesRidt.ListGames.DTO.GameMinDto;
import com.GamesRidt.ListGames.entities.Game;
import com.GamesRidt.ListGames.repositories.GameRepository;

//anotação realiza o registro do componente servico
@Service
public class GameService {

	//Anotação de dependencia
	@Autowired
	private GameRepository gameRepository ;
	
	public List<GameMinDto> findAll(){
		List<Game> result= gameRepository.findAll();
		List<GameMinDto> dto = result.stream().map(x -> new GameMinDto(x)).toList();
		return dto;
	}
}
	

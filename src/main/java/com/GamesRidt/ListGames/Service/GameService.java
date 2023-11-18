package com.GamesRidt.ListGames.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.GamesRidt.ListGames.DTO.GameDto;
import com.GamesRidt.ListGames.DTO.GameMinDto;
import com.GamesRidt.ListGames.entities.Game;
import com.GamesRidt.ListGames.repositories.GameRepository;

//anotação realiza o registro do componente servico
@Service
public class GameService {

	//Anotação de dependencia
	@Autowired
	private GameRepository gameRepository ;
	
	//garanti a consulta ao bancos de dados respeitando o aside,
	//Nao permite escrita
	@Transactional(readOnly = true)
	public GameDto findById(Long id) {
		Game  result = gameRepository.findById(id).get();
		GameDto dto = new GameDto(result);
		return dto;
	}
	@Transactional(readOnly = true)
	public List<GameMinDto> findAll(){
		List<Game> result= gameRepository.findAll();
		List<GameMinDto> dto = result.stream().map(x -> new GameMinDto(x)).toList();
		return dto;
	}
	

	
}
	

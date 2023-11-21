package com.GamesRidt.ListGames.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GamesRidt.ListGames.DTO.GameDto;
import com.GamesRidt.ListGames.DTO.GameListDto;
import com.GamesRidt.ListGames.DTO.GameMinDto;
import com.GamesRidt.ListGames.Service.GameListService;
import com.GamesRidt.ListGames.Service.GameService;
import com.GamesRidt.ListGames.entities.Game;
//notações para utilizar o get e o post
 @RestController
 @RequestMapping(value = "/lists")
public class GameListController {

	// injetando dependencia
	@Autowired
	private GameListService gameListService;
	@Autowired
	private GameService gameService;
	// tipo de requisição
	@GetMapping
	public List <GameListDto> findAll(){
		List <GameListDto> result = gameListService.findAll();
		return result;
	
	}
	@GetMapping (value = "/{listId}/games")
	public List <GameMinDto> findByList(@PathVariable Long listId){
		List <GameMinDto> result = gameService.searchById(listId);
		return result;
	}
}
 

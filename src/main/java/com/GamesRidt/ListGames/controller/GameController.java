package com.GamesRidt.ListGames.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GamesRidt.ListGames.DTO.GameMinDto;
import com.GamesRidt.ListGames.Service.GameService;
import com.GamesRidt.ListGames.entities.Game;
//notações para utilizar o get e o post
 @RestController
 @RequestMapping(value = "/games")
public class GameController {

	// injetando dependencia
	@Autowired
	private GameService gameService;
	
	// tipo de requisição
	@GetMapping
	public List <GameMinDto> findAll(){
		List <GameMinDto> result = gameService.findAll();
		return result;
	}
}
 

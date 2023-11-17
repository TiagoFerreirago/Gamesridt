package com.GamesRidt.ListGames.DTO;

import com.GamesRidt.ListGames.entities.Game;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// representação da projeção do que vai ser transmitido no frontend
public class GameMinDto {

	private Long id;
	private String title;
	private String imgUrl; 
	private Integer year;
	private String shortDescription;
	
	public GameMinDto() {
		
	}

	public GameMinDto(Game entity) {
	
		id = entity.getId();
		title = entity.getTitle();
		imgUrl = entity.getImgUrl();
		year = entity.getYear();
		shortDescription = entity.getShortDescription();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public Integer getYear() {
		return year;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
	
	
		
}

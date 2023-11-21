package com.GamesRidt.ListGames.projection;

public interface GameMinProjection {
	// dados das consultas sql
	Long getId();
	String getTitle();
	Integer getYear();
	String getImgUrl();
	String getShortDescription();
	Integer getPosition();
	
	
}

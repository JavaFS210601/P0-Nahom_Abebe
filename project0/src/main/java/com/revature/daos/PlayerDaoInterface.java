package com.revature.daos;



import java.util.List;

import com.revature.models.Favorite;
import com.revature.models.Player;

public interface PlayerDaoInterface {

public List<Player> getPlayers(); //return a List of all player
	
	public void addPlayer(Player pla); //take a new player object, add it to the database
	
	public void changeRole(int plaId, int roleId); //change player role_id given their player_id
	
	public void removeplayer(int plaId);
	
	public List<Favorite> getFavorites(); 
	
	

	public void compareGuessedDay(String myDay);
	
	
	public void compareGuessedColor(String myColor);
	
	public void compareGuessedMonth(String myMonth);
	
	
	
}

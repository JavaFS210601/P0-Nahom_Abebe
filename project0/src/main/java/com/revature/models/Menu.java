package com.revature.models;

import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.revature.daos.FavoriteDao;

public class Menu {
	// all of the menu
	// Player ply = new Player();
	FavoriteDao astr = new FavoriteDao();
	// Player ply = new Player();

	public void display() {

		boolean displayMenu = true; // this toggles whether the menu continues after user input
		Scanner scan = new Scanner(System.in); // Scanner object to parse user input
		final Logger log = LogManager.getLogger(Menu.class);

		// greeting
		System.out.println("*====================================================*");
		System.out.println("Welcome to the guessing games System");
		System.out.println("*====================================================*");
		while (displayMenu) {
			System.out.println("----------------");
			System.out.println("CHOOSE AN OPTION BELLOW TO ACCESS THE DATA");
			System.out.println("*--------------------------------------------------*");

			// menu options
			System.out.println("Players -> show all player");
			System.out.println("Add -> add a new player ");
			System.out.println("Delete player -> Terminate a player");
			System.out.println("Start game -> show Favorite");
			System.out.println("exit -> exit the application");

			String input = scan.nextLine();

			switch (input) {

			case "Players": {

				// this is the logger
				log.info("user selected all players");

				System.out.println("Gathering all employees...");

				// List of player that gets populated by the getplayers method in our
				// AstrolgyDao
				List<Player> players = astr.getPlayers();

				// Print out each Employee from the List one by one for the user to see
				
//				for (Player e : players) {
//					System.out.println(e);
//
//					break;
//				}
				
				
				for (Player e : players) {
					System.out.println(
							e.getPlayer_id() + " " + e.getF_name() + " " + e.getL_name() + " " + e.getBirth_date());

					
				}
				break;
			}
			case "Add": {

				// we need to prompt the user for the players's name, and their role id
				
				System.out.println("Enter playerId: ");
				int player_Id = scan.nextInt();
				scan.nextLine();
				System.out.println("Enter player First Name:");
				String f_name = scan.nextLine();

				System.out.println("Enter player Last Name:");
				String l_name = scan.nextLine();

				// String birth_date = scan.nextLine();

				// because without any nextLine, your enter keystroke will be grabbed as the
				// next input

				// Given all this information, we'll create a new player object to send to a DAO
				// method
				
				Player newPlayer = new Player(player_Id, f_name, l_name, "xxxx-xx-xx"); // placeholder for hire_date,
																						// will be changed

				// Put the new player into the addPlayer() method in the AstrologyDao
				astr.addPlayer(newPlayer);

				break;
			}

			case "Delete player": {

				System.out.println("These are the players on the roster... who will you terminate?");

				// this is using the already existing getPlayer() method
				List<Player> players = astr.getPlayers();

				// Print out each player from the List one by one for the user to see
				for (Player e : players) {
					System.out.println(e);
				}

				System.out.println("------------------------------");

				System.out.println("Enter the player id of the player to terminate:");
				log.warn("Hey are you sure you want to delete a player");
				int idInput = scan.nextInt();
				scan.nextLine();

				astr.removeplayer(idInput);

				break;
			}

			case "Start game": {
				System.out.println("Please enter your name");
				String fName = scan.nextLine();

				log.info("Player entered the name");

				System.out.println("Hello" + " " + fName);
				System.out.println("Welcome to play guessing game");

				List<Favorite> favorites = astr.getFavorites();
				System.out.println("What day do you guess i love more?");
				String playerGuessDay = scan.nextLine();
				//System.out.println("Good trying");
				for (Favorite e : favorites) {
					String x =  e.getMyFavoritDay();
					if(playerGuessDay.equalsIgnoreCase(x)) {
						System.out.println("You are right ...applaud");
					}else {
						System.out.println("No but it was good trying");
					}
				}
				List<Player> players = astr.getPlayers();
				System.out.println("What color do you guess i love more?");
				String myFav_color = scan.nextLine();
				//System.out.println("Good trying");
				for (Favorite e : favorites) {
					String y = e.getMy_color();
					if(myFav_color.equalsIgnoreCase(y)) {
						System.out.println("You are right ...applaud");
					}else {
						System.out.println("No but it was good trying");
					}
				}
				
				System.out.println("===================================");
				System.out.println("What month do you guess i love more?");
				String myFav_month = scan.nextLine();
				//System.out.println("Good trying");
				for (Favorite e : favorites) {
					String z =   e.getMy_month();
					if( myFav_month.equalsIgnoreCase(z)) {
						System.out.println("You are right ...applaud");
					}else {
						System.out.println("No but it was good trying");
					}
				}
				// this is the logger
				log.warn("Hello player check the answers bellow if your were attempt");

				System.out.println("===================================");
				System.out.println("Greate here are my favorites day, color and months anyway.");
				for (Favorite e : favorites) {
					System.out.print("My favorite day is " + e.getMyFavoritDay() + "\n " + "My Favorite color is "
							+ e.getMy_color() + "\n " + "My favorite month is " + e.getMy_month() + "\n ");

				}
				System.out.println("Thank you for trying" + " " + fName);
				break;

			}

			case "exit": {
				System.out.println("Have a good one. Please come back and play again!");
				displayMenu = false;
				break;
			}

			default: {
				System.out.println("Didn't catch that... try again"); // in case user input doesn't match any cases
				break;
			}

			}

		}
	}
}

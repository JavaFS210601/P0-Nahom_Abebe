package com.revature.models;

import java.util.Scanner;

public class Menu {
 //all of the menu
	
	
	public void display(){
		boolean displayMenu = true;
		Scanner keyboard= new Scanner(System.in);
		//greeting
		System.out.println("Welcome to simple text game and astrolgoy");
		System.out.println("==========================================");
		while(displayMenu) {
			System.out.println("============================");
			System.out.println("Choice an option");
			System.out.println("----------------------------");
			
			//menu option
			System.out.println("game -> show all player");
			System.out.println();
			System.out.println();
			System.out.println();
			
			
			String input = keyboard.nextLine();
			
			
			switch(input) {
			case "january":{
				System.out.println("astrology");
				break;
			}
			case "exit":{
				System.out.println("bye now");
				displayMenu = false;
				break;
				
			}
			default:{
				System.out.println("didnt catch that try again");
				break;
			}
			
			
			}
			
		}
	}
}

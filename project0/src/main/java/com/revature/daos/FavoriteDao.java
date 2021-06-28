package com.revature.daos;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.revature.models.Favorite;

import com.revature.models.Player;
import com.revature.utils.ConnectionUtil;
;

public class FavoriteDao implements PlayerDaoInterface {

	Scanner scan = new Scanner(System.in);

	@Override
	public List<Player> getPlayers() {

		try (Connection conn = ConnectionUtil.getConnection()) { // try to establish a DB connection, so we can run a
			// query

			ResultSet rs = null; // initialize an empty ResultSet that will store the results of our query

			String sql = "SELECT * FROM \"project_one\".players;"; // write the query, assign it to a String variable

			Statement s = conn.createStatement(); // creating an object to send the query to our DB

			rs = s.executeQuery(sql); // execute the query (sql) using our Statement object (s), put it in our
// ResultSet (rs)

			List<Player> playerList = new ArrayList<>(); // create a List that will be populated with the returned
			// employees

			while (rs.next()) { // while there are results left in the ResultSet (rs)

// Create a new player Object from each returned record
				Player players = new Player(rs.getInt("player_id"), rs.getString("f_name"), rs.getString("l_name"),
						rs.getString("birth_date"));

// add the newly created player object into the ArrayList of Employees
				playerList.add(players);

			}

			return playerList; // Finally, if successful, return the List of Employees

		} catch (SQLException e) { // if something goes wrong accessing our data, it will get caught
			System.out.println("Something went wrong when trying to access your DB");
			e.printStackTrace();
		}

		return null;
	}

	
	
	@Override
	public void addPlayer(Player pla) {
		// TODO Auto-generated method stub

		try (Connection conn = ConnectionUtil.getConnection()) {

			// This is the way I want to get the current date in the appropriate format
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // date formatter formats dates

			Date date = new Date(); // new date from java.util package

			String birthDate = dateFormat.format(date); // make a String that represents today's date in the format we
														// want (line 69)

			// we're going to create a SQL statement using parameters to insert a new
			// Employee
			String sql = "INSERT INTO \"project_one\".players (player_id, f_name, l_name, birth_date)"
					+ "VALUES (?, ?, ?, ?);"; // these are parameters!!! We have to now specify the value of each "?"

			PreparedStatement ps = conn.prepareStatement(sql); // we use PreparedStatements for SQL commands with
																// parameters

			// use the PreparedStatement object to insert values into the SQL query
			// the values will come from the Employee object we sent in
			// this requires two arguments, the number of the "?", and the value to give it
			ps.setInt(1, pla.getPlayer_id());
			ps.setString(2, pla.getF_name());
			ps.setString(3, pla.getL_name());
			ps.setDate(4, java.sql.Date.valueOf(birthDate)); // this takes our Java Date, and turns it into a SQL
																// Date.

			// this method actually executes the SQL command that we built
			ps.executeUpdate(); // we use executeUpdate for inserts, updates, and deletes.

			// send confirmation to the console if successful
			System.out.println("Employee " + pla.getF_name() + " created. Welcome Aboard!");

		} catch (SQLException e) {
			System.out.println("Add employee failed!");
			e.printStackTrace();
		}

	}

	@Override
	public void changeRole(int plaId, int roleId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeplayer(int plaId) {
		try (Connection conn = ConnectionUtil.getConnection()) {

			String sql = "DELETE FROM \"project_one\".players WHERE player_id = ?;";

			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setInt(1, plaId);

			ps.executeUpdate();

			System.out.println("Get out of here player #" + plaId);

		} catch (SQLException e) {
			System.out.println("Add employee failed!");
			e.printStackTrace();
		}

	}

	@Override
	public List<Favorite> getFavorites() {
		
		
		try (Connection conn = ConnectionUtil.getConnection()) { // try to establish a DB connection, so we can run a
			// query

			ResultSet rs = null; // initialize an empty ResultSet that will store the results of our query

			String sql = "SELECT * FROM \"project_one\".favorite;"; // write the query, assign it to a String variable
			
            
			Statement s = conn.createStatement(); // creating an object to send the query to our DB
			

			rs = s.executeQuery(sql); // execute the query (sql) using our Statement object (s), put it in our
			
			
// ResultSet (rs)

			List<Favorite> favoriteList = new ArrayList<>(); // create a List that will be populated with the returned
			// employees

			while (rs.next()) { // while there are results left in the ResultSet (rs)

// Create a new player Object from each returned record
				Favorite fovorites = new Favorite(rs.getInt("favorite_id"), rs.getString("my_day"), rs.getString("my_color"),
						rs.getString("my_month"));

// add the newly created player object into the ArrayList of Employees
				favoriteList.add(fovorites);

			}

			return favoriteList; // Finally, if successful, return the List of Employees

		} catch (SQLException e) { // if something goes wrong accessing our data, it will get caught
			System.out.println("Something went wrong when trying to access your DB");
			e.printStackTrace();
		}

		return null;
		
		
		
		
		
	}



	@Override
	public void compareGuessedDay(String myDay) {
		try (Connection conn = ConnectionUtil.getConnection()) { 
			
	       
			String sql = "SELECT * FROM \"project_one\".favorite WHERE favorite_id =1;";
			PreparedStatement ps = conn.prepareStatement(sql); // creating an object to send the query to our DB
			ResultSet rs = null;
			rs = ps.executeQuery(sql);
		
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
	}



	@Override
	public void compareGuessedColor(String myColor) {
try (Connection conn = ConnectionUtil.getConnection()) { 
			
	       
			String sql = "SELECT * FROM \"project_one\".favorite WHERE favorite_id =2;";
			PreparedStatement ps = conn.prepareStatement(sql); // creating an object to send the query to our DB
			ResultSet rs = null;
			rs = ps.executeQuery(sql);
			System.out.println("");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
	}



	@Override
	public void compareGuessedMonth(String myMonth) {
      try (Connection conn = ConnectionUtil.getConnection()) { 
			
			String sql = "SELECT * FROM \"project_one\".favorite WHERE favorite_id =3;";
			PreparedStatement ps = conn.prepareStatement(sql); // creating an object to send the query to our DB
			ResultSet rs = null;
			rs = ps.executeQuery(sql);
			System.out.println("");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
	}


	}











	



	


	


	



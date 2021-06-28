package com.revature.models;

public class Player {
	private int player_id;
	private String f_name;
	private String l_name;
	private String birth_date;
	
	
	
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Player(int player_id, String f_name, String l_name, String birth_date) {
		super();
		this.player_id = player_id;
		this.f_name = f_name;
		this.l_name = l_name;
		this.birth_date = birth_date;
	}



	public Player(String f_name, String l_name, String birth_date) {
		super();
		this.f_name = f_name;
		this.l_name = l_name;
		this.birth_date = birth_date;
	}



	@Override
	public String toString() {
		return "Player [player_id=" + player_id + ", f_name=" + f_name + ", l_name=" + l_name + ", birth_date="
				+ birth_date + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birth_date == null) ? 0 : birth_date.hashCode());
		result = prime * result + ((f_name == null) ? 0 : f_name.hashCode());
		result = prime * result + ((l_name == null) ? 0 : l_name.hashCode());
		result = prime * result + player_id;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (birth_date == null) {
			if (other.birth_date != null)
				return false;
		} else if (!birth_date.equals(other.birth_date))
			return false;
		if (f_name == null) {
			if (other.f_name != null)
				return false;
		} else if (!f_name.equals(other.f_name))
			return false;
		if (l_name == null) {
			if (other.l_name != null)
				return false;
		} else if (!l_name.equals(other.l_name))
			return false;
		if (player_id != other.player_id)
			return false;
		return true;
	}



	public int getPlayer_id() {
		return player_id;
	}



	public void setPlayer_id(int player_id) {
		this.player_id = player_id;
	}



	public String getF_name() {
		return f_name;
	}



	public void setF_name(String f_name) {
		this.f_name = f_name;
	}



	public String getL_name() {
		return l_name;
	}



	public void setL_name(String l_name) {
		this.l_name = l_name;
	}



	public String getBirth_date() {
		return birth_date;
	}



	public void setBirth_date(String birth_date) {
		this.birth_date = birth_date;
	}
	
	
	
	

}

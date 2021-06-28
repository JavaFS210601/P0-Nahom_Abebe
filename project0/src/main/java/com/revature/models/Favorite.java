package com.revature.models;

public class Favorite {
	private int favorite_id;
	private int my_day;
	private String my_color;
	private String my_month;
	private String  myDay;
	
	
	public Favorite() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Favorite(int my_day, String my_color, String my_month, String string) {
		super();
		this.my_day = my_day;
		this.my_color = my_color;
		this.my_month = my_month;
	}


	@Override
	public String toString() {
		return "Favorite [favorite_id=" + favorite_id + ", my_day=" + my_day + ", my_color=" + my_color + ", my_month="
				+ my_month + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + favorite_id;
		result = prime * result + ((my_color == null) ? 0 : my_color.hashCode());
		result = prime * result + my_day;
		result = prime * result + ((my_month == null) ? 0 : my_month.hashCode());
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
		Favorite other = (Favorite) obj;
		if (favorite_id != other.favorite_id)
			return false;
		if (my_color == null) {
			if (other.my_color != null)
				return false;
		} else if (!my_color.equals(other.my_color))
			return false;
		if (my_day != other.my_day)
			return false;
		if (my_month == null) {
			if (other.my_month != null)
				return false;
		} else if (!my_month.equals(other.my_month))
			return false;
		return true;
	}


	public int getFavorite_id() {
		return favorite_id;
	}


	public void setFavorite_id(int favorite_id) {
		this.favorite_id = favorite_id;
	}


	public int getMy_day() {
		return my_day;
	}


	public void setMy_day(int my_day) {
		this.my_day = my_day;
	}


	public String getMy_color() {
		return my_color;
	}


	public void setMy_color(String my_color) {
		this.my_color = my_color;
	}


	public String getMy_month() {
		return my_month;
	}


	public void setMy_month(String my_month) {
		this.my_month = my_month;
	}


	public String getMyDay() {
		return myDay;
	}


	public void setMyDay(String myDay) {
		this.myDay = myDay;
	}
	
	
	
}

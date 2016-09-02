package com.fruitstuff;

public class Fruit {
	
	
	
	private String idfruit_id = null; //Why aren't you camelCaseing here?
	private String fruit_name = null;
	private String fruit_taste = null;
	private String fruit_price = null;
	private String fruit_season = null;
	
	
	public Fruit(String idfruit_id, String fruit_name, String fruit_taste, String fruit_price, String fruit_season) {
		
		this.idfruit_id = idfruit_id;
		this.fruit_name = fruit_name;
		this.fruit_taste = fruit_taste;
		this.fruit_price = fruit_price;
		this.fruit_season = fruit_season;
	}


	public Fruit() {
	
	}


	public String getIdfruit_id() {
		return idfruit_id;
	}


	public void setIdfruit_id(String idfruit_id) {
		this.idfruit_id = idfruit_id;
	}


	public String getFruit_name() {
		return fruit_name;
	}


	public void setFruit_name(String fruit_name) {
		this.fruit_name = fruit_name;
	}


	public String getFruit_taste() {
		return fruit_taste;
	}


	public void setFruit_taste(String fruit_taste) {
		this.fruit_taste = fruit_taste;
	}


	public String getFruit_price() {
		return fruit_price;
	}


	public void setFruit_price(String fruit_price) {
		this.fruit_price = fruit_price;
	}


	public String getFruit_season() {
		return fruit_season;
	}


	public void setFruit_season(String fruit_season) {
		this.fruit_season = fruit_season;
	}
	
	
	
	

	
}

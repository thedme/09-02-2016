package com.fruitstuff;

import java.sql.*;
import java.util.ArrayList;

public class DAO {
	
	static final String jdbc_driver = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/?user=root&autoReconnect=true&useSSL=false";
	static final String USER = "root";
	static final String PASSWORD = "root";

	static Connection CONN = null;
	static Statement STMT = null;
	static PreparedStatement PREP_STMT = null;
	static ResultSet RES_SET = null;

	
	public static final ArrayList<Fruit> ourFruit = new ArrayList<>();

	public static void connToDB() {

		try {
			
			Class.forName(jdbc_driver);

			System.out.println("Trying to connect to the DB...");
			CONN = DriverManager.getConnection(DB_URL, USER, PASSWORD);
			System.out.println("Connected to DB.");

		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("Connection failed");
			e.printStackTrace();
		}

	}

	public static void readFromDB() {

		connToDB();

		

		try {

			STMT = CONN.createStatement();
			RES_SET = STMT.executeQuery("SELECT * FROM weekfive_schema.fruit_table;");

			while (RES_SET.next()) {

				Fruit fruitInDB = new Fruit();

				fruitInDB.setIdfruit_id(RES_SET.getString("idfruit_id"));
				fruitInDB.setFruit_name(RES_SET.getString("fruit_name"));
				fruitInDB.setFruit_taste(RES_SET.getString("fruit_taste"));
				fruitInDB.setFruit_price(RES_SET.getString("fruit_price"));
				fruitInDB.setFruit_season(RES_SET.getString("fruit_season"));

				ourFruit.add(fruitInDB);

			}

		for (Fruit fruit : ourFruit) {
			System.out.println(fruit);
		}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void writeToDatabase(Fruit fruit) {

		Fruit animalToAdd = new Fruit();

		animalToAdd = fruit;

		try {

			connToDB();

			PREP_STMT = CONN.prepareStatement(insertIntoTable);

			PREP_STMT.setString(1, animalToAdd.getFruit_name());
			PREP_STMT.setString(2, animalToAdd.getFruit_taste());
			PREP_STMT.setString(3, animalToAdd.getFruit_price());
			PREP_STMT.setString(4, animalToAdd.getFruit_season());

			PREP_STMT.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static String insertIntoTable = "INSERT INTO `weekfive_schema`.`fruit_table` " 
			+ "(fruit_name, fruit_taste, fruit_price, fruit_season)"
			+ " VALUES " 
			+ "(?, ?, ?, ?);";
	

}

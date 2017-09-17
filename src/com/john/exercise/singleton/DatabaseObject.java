package com.john.exercise.singleton;

public class DatabaseObject {
	
	private static DatabaseObject instance = new DatabaseObject();
	
	public DatabaseObject(){}
	
	public static DatabaseObject getInstance(){
		return instance;
	}
	
	public void openDatabase(String username, String password){
		System.out.println("Logging in...");

		if(username.equals("wagkamakulit01") && password.equals("whatismypassword")){
			System.out.println("Login credentials are correct...");
			System.out.println("Database is now open...");
		}else{
			System.out.println("Sorry, try again...");
		}
	}
}

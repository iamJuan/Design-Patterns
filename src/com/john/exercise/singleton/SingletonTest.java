package com.john.exercise.singleton;

public class SingletonTest {
	public static void main(String args[]){
		DatabaseObject dbObject = DatabaseObject.getInstance();
		dbObject.openDatabase("watchamakalit", "1234");
		
		System.out.println();
		dbObject.openDatabase("wagkamakulit01", "whatismypassword");
	}
}

package com.john.exercise.composite;

import java.util.ArrayList;
import java.util.List;

public class Trash {
	
	private String trashName;
	private String type;
	private List<Trash> subordinates;
	
	public Trash(String trashName, String type){
		this.trashName = trashName;
		this.type = type;
		subordinates = new ArrayList<Trash>();
	}
	
	public void add(Trash a){
		subordinates.add(a);
	}
	
	public void remove(Trash a){
		subordinates.add(a);
	}
	
	public List<Trash> getSubordinates(){
		return subordinates;
	}
	
	public String toString(){
		return ("Employee :[ Name : " + trashName + ", Class : " + type+" ]");
	}
}

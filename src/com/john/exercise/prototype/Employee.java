package com.john.exercise.prototype;

public abstract class Employee implements Cloneable{
	private String id;
	public String type;
	
	abstract void display();
	
	public String getType(){
		return type;
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public String getId(){
		return id;
	}
	
	public Object clone(){
		Object clone = null;
		try{
			clone = super.clone();
		}catch(CloneNotSupportedException cnse){
			cnse.printStackTrace();
		}
		
		return clone;
	}
}

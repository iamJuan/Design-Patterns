package com.john.exercise.prototype;

import java.util.Hashtable;

public class EmployeeCache {
	private static Hashtable<String, Employee> empMap = new Hashtable<String, Employee>();
	
	public static Employee getEmployee(String id){
		return (Employee)empMap.get(id);
	}
	
	public static void loadCache(){
		Engineer engr = new Engineer();
		engr.setId("1");
		empMap.put(engr.getId(),engr);
		
		SafetyOfficer so = new SafetyOfficer();
		so.setId("2");
		empMap.put(so.getId(),so);
		
		Laborer labr = new Laborer();
		labr.setId("3");
		empMap.put(labr.getId(),labr);
	}
}

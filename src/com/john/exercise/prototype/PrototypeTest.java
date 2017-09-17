package com.john.exercise.prototype;

public class PrototypeTest {
	public static void main(String args[]){
		EmployeeCache.loadCache();
		
		Employee emp1 = (Employee) EmployeeCache.getEmployee("1");
		System.out.println("Employee : " + emp1.getType());
		emp1.display();

		Employee emp2 = (Employee) EmployeeCache.getEmployee("2");
		System.out.println("Employee : " + emp2.getType());
		emp2.display();

		Employee emp3 = (Employee) EmployeeCache.getEmployee("3");
		System.out.println("Employee : " + emp3.getType());
		emp3.display();
	}
}

package com.umut.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		//create the object
		Coach theCoach = new BasketballCoach(null);
		
		//use the object
		System.out.println(theCoach.getDailyWorkout());
		
	}

}

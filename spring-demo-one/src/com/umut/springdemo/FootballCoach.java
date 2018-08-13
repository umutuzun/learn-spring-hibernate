package com.umut.springdemo;

public class FootballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on free kick practice";
	}
}

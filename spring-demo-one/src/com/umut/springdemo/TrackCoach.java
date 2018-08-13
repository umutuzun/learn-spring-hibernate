package com.umut.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run some 2k";
	}

	@Override
	public String getDailyFortune() {
		return "On track: " + fortuneService.getFortune();
	}

}

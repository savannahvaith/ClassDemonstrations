package com.qa.solid.dependencyinv;

public class WeatherTracker {
	
	private String condition; 
	
//	Phone phone; 
//	Email email; 
	
//	public WeatherTracker() {
//		phone = new Phone(); 
//		email = new Email();
//	}
	
	public String getCondition() {
		return condition; 
	}
	
	public void setCondition(String weather) {
		this.condition = weather; 
	}
	
	public void notify(Notifier notifier) {
		notifier.alertWeatherCondition(condition);
	}

}

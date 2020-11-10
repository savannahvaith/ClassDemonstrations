package com.qa.solid.dependencyinv;

public class Email implements Notifier{

//	public String getWeatherAlert(String condition) {
//		String alert = "It is " + condition;
//		return alert; 
//	}

	@Override
	public void alertWeatherCondition(String weatherCondition) {
		if(weatherCondition.equals("sunny")) {
			System.out.println("It is sunny");
		}
		
	}
	
}

package com.qa.solid.dependencyinv;

public class Phone implements Notifier {
	
//	public String getWeatherAlert(String condition) {
//		String alert = "It is " + condition;
//		return alert; 
//	}

	@Override
	public void alertWeatherCondition(String weatherCondition) {
		if(weatherCondition.equals("rainy")) {
			System.out.println("It is rainy");
		}
		
	}

}

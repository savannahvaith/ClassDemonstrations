package com.qa.solid.liskov;

public class Animal {
	
//	public void learnToFly(Bird bird) {
//		if(bird instanceof Owl) {
//			bird.fly();
//		}
//	}
	
	public void learnToFly(FlyingBird flyingBird) {
		flyingBird.fly();
	}

}

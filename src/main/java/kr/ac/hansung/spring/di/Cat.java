package kr.ac.hansung.spring.di;

import lombok.Setter;

@Setter
public class Cat implements AnimalType {

	private String myName;
	
	public void sound() {
		System.out.println("Cat name=" + myName + ": " + "Meow!");
	}

}

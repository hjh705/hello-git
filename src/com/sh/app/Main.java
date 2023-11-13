package com.sh.app;

import com.sh.animal.Bird;
import com.sh.animal.Cat;
import com.sh.animal.Dog;
import com.sh.animal.Monkey;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("Hello Git");
		
		new Dog().bark();
		new Cat().jump();
		new Monkey().bananaThrow();
		new Bird().fly();
	}

}

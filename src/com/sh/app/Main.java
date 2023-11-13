package com.sh.app;

import com.sh.animal.Bird;
import com.sh.animal.Cat;
import com.sh.animal.Dog;
import com.sh.animal.Parrot;
import com.sh.animal.Monkey;

public class Main {

	public static void main(String[] args) {
		System.out.println("HELLO WORLD");//ctrl shift x 대문자 변환 
		System.out.println("HELLO GIT");
		
		new Dog().bark();
		new Cat().jump();
		new Parrot().say();
		new Monkey().bananaThrow();
		new Bird().fly();
	}
	
	public void test() {
		System.out.println("Main#test");
	}

}

package com.sh.app;

import com.sh.animal.Bird;
import com.sh.animal.Dog;
import com.sh.animal.Horse;
import com.sh.animal.Monkey;
import com.sh.animal.Parrot;

public class Main {

	public static void main(String[] args) {
		System.out.println("HELLO WORLD");//ctrl shift x 대문자 변환 
		System.out.println("HELLO GIT");
		
		System.out.println("동물 기능 시작!");
		System.out.println("Animal Go~");
		new Dog().bark();
		new Parrot().say();
		new Monkey().bananaThrow();
		new Bird().fly();
		new Horse().run();
	}
	
	public void test() {
		System.out.println("Main#test");
	}

}

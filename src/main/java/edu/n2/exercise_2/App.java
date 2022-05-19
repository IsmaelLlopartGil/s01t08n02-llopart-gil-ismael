package edu.n2.exercise_2;

import java.util.*;

public class App {

	public void run() {

		List<Integer> integerList = new ArrayList<>();
		integerList.add(5);
		integerList.add(78);
		integerList.add(15);
		integerList.add(-12350);
		integerList.add(7654);
		integerList.add(-3); 
		
		ParityAdder ti = (list) -> {
			String string="";
			for (Integer integer : list) {
				if (integer%2==0) {
					string+= "e" + integer.toString() +  ", ";
				} else {
					string+= "o" + integer.toString() +  ", ";
				}
			}
			return string;
		};
		
		System.out.println(ti.addParityToString(integerList));	
	}

	public static void main(String[] args) {
		App app = new App();
		app.run();
	}
}

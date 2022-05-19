package edu.n2.exercise_1;

import java.util.*;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {

		List<String> nameList=new ArrayList<>();
		nameList.add("Albert");
		nameList.add("Berta");
		nameList.add("Carme");
		nameList.add("Arseni");
		nameList.add("Pere");
		nameList.add("Ana");
		nameList.add("Edu");
		nameList.add("As");
		nameList.add("Asu");
		
		System.out.println(nameList.stream()
				.filter(c -> c.charAt(0)=='A' && c.length()==3)
				.collect(Collectors.toList()));
	}
}

package edu.n2.exercise_4;

import java.util.*;
import java.util.stream.*;

public class App {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("15");
		list.add("-685");
		list.add("95");
		list.add("Ariel");
		list.add("Joana");
		list.add("Víctor");
		list.add("Joaquín");
		list.add("Eloi");
		list.add("Bernat");
		list.add("Manel");
		list.add("Marc");
		list.add("-18");
		list.add("Mercè");

		System.out.println("Llista ordenada alfabèticament per la primera lletra: \n"
				+ list.stream()
				.sorted((o1, o2) -> o1.charAt(0) - o2.charAt(0))
				.collect(Collectors.toList()) +
				"\n");

		System.out.println("Llista ordenada (Els que inclouen la lletra e primer): \n" +
					list.stream()
					.sorted((o1, o2) -> {
						if (o1.toLowerCase().contains("e") && !o2.toLowerCase().contains("e")) {
							return -1;
						} else if (!o1.toLowerCase().contains("e") && o2.toLowerCase().contains("e")) {
							return 1;
						} else {
							return o1.compareTo(o2);
						}
					})
					.collect(Collectors.toList()) +
					"\n");
		
		System.out.println("Llista reemplaçant les 'a' per '4': \n" +
					list.stream()
					.map(e-> e.replaceAll("a", "4"))
					.collect(Collectors.toList()) +
					"\n");
		
		System.out.println("Llista, només els elements que són numèrics: \n" +
					list.stream()
					.filter(e -> e.matches("[+-]?\\d*(\\.\\d+)?"))
					.collect(Collectors.toList()));		
	}
}

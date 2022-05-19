package edu.n2.exercise_3;

public class App {

	public static void main(String[] args) {

		Operation addition = ((f1, f2) -> f1 + f2);
		Operation subtraction = ((f1, f2) -> f1 - f2);
		Operation multiplication = ((f1, f2) -> f1 * f2);
		Operation division = ((f1, f2) -> f1 / f2);

		float value1 = 54.25f;
		float value2 = 14.05f;

		System.out.println(addition.operate(value1, value2));
		System.out.println(subtraction.operate(value1, value2));
		System.out.println(multiplication.operate(value1, value2));
		System.out.println(division.operate(value1, value2));

	}
}

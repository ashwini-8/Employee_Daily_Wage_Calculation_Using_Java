package employeewageusecase;

import java.util.Random;

public class EmployeeWageProblem {

	public static void main(String[] args) {
		// start
		System.out.println("Welcome to Employee Wage Computation Program");

		/*
		 * uc1 This code is for employee present or absent use case
		 */
		Random generaterandom = new Random();
		int randomNumber = generaterandom.nextInt(2);
		System.out.println("Random number generated :" + randomNumber);
		if (randomNumber == 1) {
			System.out.println("Employee is present");
		} else {
			System.out.println("Employee is absent");
		}
	}
}
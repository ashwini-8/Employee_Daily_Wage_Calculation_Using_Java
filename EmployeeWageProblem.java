package employeewageusecase;

import java.util.Random;

public class EmployeeWageProblem {

	public static void main(String[] args) {
		// start
		System.out.println("Welcome to Employee Wage Computation Program");

		/*
		 * uc4 This code is to add part-time and full-time employee's daily wage use
		 * case using switch case
		 */
		int ratePerHour = 20;
		int empHour = 0;
		Random generaterandom = new Random();
		int randomNumber = generaterandom.nextInt(3);
		System.out.println("Random number generated :" + randomNumber);

		switch (randomNumber) {
		case 1:
			System.out.println("employee is full-time");
			empHour = 8;
			int salary = (empHour * ratePerHour);
			System.out.println("salary is :" + salary);
			break;
		case 2:
			System.out.println("employee is part-time");
			empHour = 4;
			int salary1 = (empHour * ratePerHour);
			System.out.println("salary is :" + salary1);
			break;
		default:
			System.out.println("employee is absent");
		}
	}
}
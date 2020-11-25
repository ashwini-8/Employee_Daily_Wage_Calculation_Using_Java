package employeewageusecase;

import java.util.Random;

public class EmployeeWageProblem {

	public static void main(String[] args) {
		// start
		System.out.println("Welcome to Employee Wage Computation Program");

		/*
		 * uc2 This code is to calculate employee's daily wage use case
		 */
		Random generaterandom = new Random();
		int randomNumber = generaterandom.nextInt(2);
		System.out.println("Random number generated :" + randomNumber);
		if (randomNumber == 1) {
			System.out.println("Employee is present");
			int empHour = 8;
			int ratePerHour = 20;
			int salary = (empHour * ratePerHour);
			System.out.println("salary is :" + salary);
		} else {
			System.out.println("Employee is absent");
			System.out.println("salary is : 0 ");

		}
	}
}
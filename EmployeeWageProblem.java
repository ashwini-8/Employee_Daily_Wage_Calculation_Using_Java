package employeewageusecase;

import java.util.Random;

public class EmployeeWageProblem {

	public static void main(String[] args) {
		// start
		System.out.println("Welcome to Employee Wage Computation Program");

		/*
		 * uc3 This code is to add part-time and full-time employee's daily wage use
		 * case
		 */
		int IS_PART_TIME = 1;
		int IS_FULL_TIME = 2;
		int ratePerHour = 20;
		int empHour = 0;
		Random generaterandom = new Random();
		int randomNumber = generaterandom.nextInt(3);
		System.out.println("Random number generated :" + randomNumber);
		if (randomNumber == IS_PART_TIME) {
			empHour = 4;
		} else if (randomNumber == IS_FULL_TIME) {
			empHour = 8;
		} else {
			empHour = 0;
		}
		System.out.println("employee hours is:" + empHour);
		int salary = (empHour * ratePerHour);
		System.out.println("employee salary is:" + salary);
	}
}
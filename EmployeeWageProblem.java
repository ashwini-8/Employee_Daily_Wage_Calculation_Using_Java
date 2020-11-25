package employeewageusecase;

import java.util.Random;

public class EmployeeWageProblem {

	public static void main(String[] args) {
		// start
		System.out.println("Welcome to Employee Wage Computation Program");

		/*
		 * uc5 This code is to check part-time and full-time employee's daily wage using
		 * switch case for a month
		 */
		int ratePerHour = 20;
		int empHour = 0;
		int NUM_WORKING_DAYS = 20;
		int MAX_HRS_IN_MONTH = 100;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		while (totalEmpHrs < MAX_HRS_IN_MONTH && totalWorkingDays < NUM_WORKING_DAYS) {
			totalWorkingDays++;
			totalEmpHrs++;
			Random generaterandom = new Random();
			int randomNumber = generaterandom.nextInt(2);
			System.out.println("Random number generated :" + randomNumber);

			switch (randomNumber) {
			case 0:
				System.out.println("employee is full-time");
				empHour = 8;
				int salary = (empHour * ratePerHour);
				System.out.println("salary is :" + salary);
				break;
			case 1:
				System.out.println("employee is part-time");
				empHour = 4;
				int salary1 = (empHour * ratePerHour);
				System.out.println("salary is :" + salary1);
				break;
			default:
				System.out.println("employee is absent");
				return;
			}
		}

	}
}
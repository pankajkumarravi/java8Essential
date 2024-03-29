package com.pankaj.java;

import java.util.Scanner;

import com.pankaj.java.utilities.MathHelper;

public class Calculator {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.calculate();
	}

	protected void calculate() {
		InputHelper inputHelper = new InputHelper();
		String s1 = inputHelper.getInput("Enter a numeric Value :");
		String s2 = inputHelper.getInput("Enter a numeric Value :");
		String operator = inputHelper.getInput("Choose an Operator(+,-,*,/ )");
		double result = 0;
		try {
			switch (operator) {
			case "+":
				result = MathHelper.addValues(s1, s2);
				break;
			case "-":
				result = MathHelper.subsValues(s1, s2);
				break;
			case "*":
				result = MathHelper.mulValues(s1, s2);
				break;
			case "/":
				result = MathHelper.divValues(s1, s2);
				break;
			default:
				System.out.println("Unrecognized Operation");
				break;
			}
			System.out.println("The result = " + result);
		} catch (Exception e) {

			System.out.println("Number formating Exception" + e.getMessage());
		}
	}

	class InputHelper {
		private String getInput(String string) {
			System.out.println(string);
			Scanner scanner = new Scanner(System.in);
			return scanner.nextLine();
		}
	}

}

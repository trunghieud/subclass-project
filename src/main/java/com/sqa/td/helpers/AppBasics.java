/**
 * File Name: AppBasics.java<br>
 * Dam, Trung-Hieu<br>
 * Created: Aug 19, 2017
 */
package com.sqa.td.helpers;

import java.util.*;

/**
 * AppBasics //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Dam, Trung-Hieu
 * @version 1.0.0
 * @since 1.0
 */
public class AppBasics {

	private static Scanner scanner = new Scanner(System.in);

	public static void farewellUser(String userName) {
		System.out.println("Thank you " + userName + " for using our application.");
		System.out.println("Have a nice day!");
	}

	public static String greetUserAndGetName(String appName) {
		// Greet the user a systemout call
		System.out.println("Welcome to the " + appName + " Application.");
		// Ask the user for their name and store in a local scope String
		// variable
		System.out.print("Can I get your name?");
		return scanner.nextLine();
	}

	public static double requestDouble(String question) {
		double num = 0.00;
		String input;
		System.out.print(question + " ");
		input = scanner.nextLine();
		try {
			num = Double.parseDouble(input);
		} catch (NumberFormatException e) {
			System.out.println("You did not supply a valid number [" + input + "]." + "please provide only digits.");
		}
		return num;
	}

	public static int requestInt(String question) {
		int num = 0;
		String input;
		System.out.print(question + " ");
		input = scanner.nextLine();
		try {
			num = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			System.out.println("You did not supply a valid number [" + input + "]. Please provide only digits.");
		}
		return num;
	}

	public static String requestString(String question) {
		System.out.print(question + " ");
		return scanner.nextLine();
	}
}

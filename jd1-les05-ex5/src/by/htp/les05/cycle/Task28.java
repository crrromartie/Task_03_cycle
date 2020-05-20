package by.htp.les05.cycle;

import java.util.Scanner;

public class Task28 {

	public static void task() {
		int fExit = 0;
		double rez;

		do {
			@SuppressWarnings("resource")
			Scanner in = new Scanner(System.in);
			System.out.println("Input x");
			while (!in.hasNextDouble()) {
				in.next();
			}
			double x = in.nextDouble();

			System.out.println("Input y");
			while (!in.hasNextDouble()) {
				in.next();
			}
			double y = in.nextDouble();

			System.out.println("+ add");
			System.out.println("- diff");
			System.out.println("* prod");
			System.out.println("/ div");
			System.out.println("0 stop");
			System.out.println("Select operation");

			while (!in.hasNext()) {
				in.next();
			}
			String menu = in.next();
			while (!menu.equals("+") && !menu.equals("-") && !menu.equals("*") && !menu.equals("/")
					&& !menu.equals("0")) {
				System.out.println("Invalid menu item. Try again");
				menu = in.next();
			}
			switch (menu) {
			case "+": {
				rez = x + y;
				System.out.println("Rez = " + rez);
			}
				break;
			case "-": {
				rez = x - y;
				System.out.println("Rez = " + rez);
			}
				break;
			case "*": {
				rez = x * y;
				System.out.println("Rez = " + rez);
			}
				break;
			case "/": {
				if (y > 0) {
					rez = x / y;
					System.out.println("Rez = " + rez);
				} else {
					System.out.println("Division by zero!");
				}
			}
				break;
			case "0": {
				fExit = 1;
			}
				break;
			}
		} while (fExit == 0);
	}

}

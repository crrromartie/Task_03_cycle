package by.htp.les05.cycle;

import java.util.Scanner;

public class Task38 {

	public static void task() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Input a number");
		while (!in.hasNextInt()) {
			in.next();
		}
		int x = in.nextInt();
		while (x < 100 || x > 2147483647) {
			System.out.println("Incorrect number, try again");
			x = in.nextInt();
		}
		int counter = 0;
		int c = x % 10 - (x / 10 % 10);
		do {
			if (x % 10 - x / 10 % 10 != c) {
				counter++;
			}
			x /= 10;
		} while (x > 10);
		if (counter == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}

package by.htp.les05.cycle;

import java.util.Scanner;

public class Task27 {

	public static void task() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Input m");
		while (!in.hasNextInt()) {
			in.next();
		}
		int m = in.nextInt();

		System.out.println("Input n");
		while (!in.hasNextInt()) {
			in.next();
		}
		int n = in.nextInt();

		if (n <= m) {
			System.out.println("Incorrect input");
			return;
		}

		while (m <= n) {
			System.out.print(m + ":");
			for (int i = 2; i < m - 1; i++) {
				if (m % i == 0) {
					System.out.print(" " + i + " ");
				}
			}
			System.out.println();
			m++;
		}

	}

}

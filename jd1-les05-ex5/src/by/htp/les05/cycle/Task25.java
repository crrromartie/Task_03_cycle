package by.htp.les05.cycle;

import java.math.BigInteger;
import java.util.Scanner;

public class Task25 {

	public static void task() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Input number");
		while (!in.hasNextInt()) {
			in.next();
		}
		int x = in.nextInt();
		BigInteger f = BigInteger.valueOf(1);
		for (int i = 1; i <= x; i++) {
			BigInteger b = BigInteger.valueOf(i);
			f = f.multiply(b);
		}
		System.out.println("X = " + x + " F = " + f);
	}

}

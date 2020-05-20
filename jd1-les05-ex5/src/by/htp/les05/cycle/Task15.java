package by.htp.les05.cycle;

public class Task15 {

	public static void task() {
		int n = 1;
		int sum = 0;
		while (n <= Math.pow(2, 10)) {
			sum += n;
			n *= 2;
		}
		System.out.println("Sum = " + sum);

	}

}

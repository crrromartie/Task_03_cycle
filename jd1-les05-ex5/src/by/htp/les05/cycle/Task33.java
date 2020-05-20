package by.htp.les05.cycle;

public class Task33 {

	public static void task() {
		int a = 89451;
		System.out.println("Number = " + a);
		int max = a % 10;
		int c;
		a /= 10;
		while (a > 0) {
			c = a % 10;
			if (c > max) {
				max = c;
			}
			a /= 10;
		}
		System.out.println("Max digit = " + max);
	}
}

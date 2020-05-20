package by.htp.les05.cycle;

public class Task16 {

	public static void task() {
		int sum = 3;
		long p = 3L;

		for (int i = 3; i <= 10; i++) {
			sum += i;
			p *= sum;
		}
		System.out.println("Sum = " + p);
	}

}

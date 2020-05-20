package by.htp.les05.cycle;

public class Task05 {

	public static void task() {
		int x = 1;
		int sum = 0;
		while (x <= 99) {
			sum += x;
			x = x + 2;
		}
		System.out.println("Sum = " + sum);
	}

}

package by.htp.les05.cycle;

public class Task09 {

	public static void task() {
		int x = 0;
		int sum = 0;
		while (x <= 100) {
			sum += (int) Math.pow(x, 2);
			x++;
		}
		System.out.println("Sum = " + sum);
	}

}

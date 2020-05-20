package by.htp.les05.cycle;

public class Task21 {

	public static void task() {

		double y;

		for (double i = -3.0; i <= 3; i++) {
			y = i - Math.sin(i);
			System.out.println("X = " + i + " Y = " + y);
		}
	}
}

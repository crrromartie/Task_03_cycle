package by.htp.les05.cycle;

public class Task23 {

	public static void task() {
		double y;

		for (double i = -3.0; i <= 3; i++) {
			y = (1 / Math.tan(i / 3)) + (0.5 * Math.sin(i));
			System.out.println("X = " + i + " Y = " + y);
		}
	}

}

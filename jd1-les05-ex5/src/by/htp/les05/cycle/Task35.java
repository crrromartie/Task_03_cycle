package by.htp.les05.cycle;

public class Task35 {

	public static void task() {
		int x = 458928;
		int counter = 0;
		while (x > 0) {
			if (x % 10 % 2 == 0) {
				counter++;
			}
			x /= 10;
		}
		System.out.println("Count = " + counter);
	}

}

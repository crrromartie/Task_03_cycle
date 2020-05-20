package by.htp.les05.cycle;

public class Task07 {

	public static void task() {
		int a = -8;
		int b = 8;

		for (int x = a; x <= b; x++) {
			if (x > 2) {
				System.out.println(x);
			} else {
				System.out.println(-(int) Math.abs(x));
			}
		}
	}

}

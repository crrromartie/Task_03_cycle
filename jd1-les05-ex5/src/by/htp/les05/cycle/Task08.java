package by.htp.les05.cycle;

public class Task08 {

	public static void task() {
		int a = 14;
		int b = 18;
		int c = 3;

		for (int x = a; x <= b; x++) {
			if (x == 15) {
				System.out.println((x + c) * 2);
			} else {
				System.out.println((x - c) + 6);
			}
		}
	}

}

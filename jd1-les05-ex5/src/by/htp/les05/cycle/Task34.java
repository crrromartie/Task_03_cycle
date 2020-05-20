package by.htp.les05.cycle;

public class Task34 {

	public static void task() {
		for (int i = 1000; i <= 9999; i++) {
			if (i % 10 + (i / 10 % 10) + (i / 100 % 10) + (i / 1000 % 10) == 15) {
				System.out.println(i);
			}
		}
	}

}

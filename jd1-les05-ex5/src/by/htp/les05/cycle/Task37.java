package by.htp.les05.cycle;

public class Task37 {

	public static void task() {
		System.out.println("99");
		for (int i = 10; i <= 99; i++) {
			for (int j = 10; j <= 99; j++) {
				if ((i * 100 + j) % 99 == 0) {
					System.out.println(i + " and " + j);
				}
			}
		}
		System.out.println("49");
		for (int j = 10; j <= 99; j++) {
			for (int i = 10; i <= 99; i++) {
				if ((i * 100 + j) % 49 == 0) {
					System.out.println(i + " and " + j);
				}
			}
		}
	}

}

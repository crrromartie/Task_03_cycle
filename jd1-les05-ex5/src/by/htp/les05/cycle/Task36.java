package by.htp.les05.cycle;

public class Task36 {

	public static void task() {
		for (int i = 10; i <= 99; i++) {
			for (int j = 10; j <= 99; j++) {
				if ((i * 100 + j) % (i * j) == 0) {
					System.out.println(i + " and " + j);
				}
			}
		}
	}

}

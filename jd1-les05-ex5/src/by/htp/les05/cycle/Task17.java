package by.htp.les05.cycle;

public class Task17 {

	public static void task() {
		double a = 3.0;
		int n = 4;
		double rez = 1.0;
		for (int i = 0; i < n; i++) {
			rez *= a + i;
		}
		System.out.println("Rez = " + rez);

	}

}

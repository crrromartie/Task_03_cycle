package by.htp.les05.cycle;

public class Task12 {

	public static void task() {
		int a = 1;
		long p = 1L;
		int n = 1;
		do {
			p *= a;
			a = 6 + a;
			System.out.println(a);
			n++;
		} while (n <= 10);
		System.out.println("P = " + p);
	}

}

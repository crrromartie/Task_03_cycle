package by.htp.les05.cycle;

public class Task29 {

	public static void task() {
		int x1 = 8743;
		int x2 = 9837;
		int z;
		int c;

		while (x1 > 0) {
			z = x1 % 10;
			x1 /= 10;
			c = x2;
			while (c > 0) {

				if (c % 10 == z) {
					System.out.print(z + " ");
				}
				c /= 10;
			}

		}
	}

}

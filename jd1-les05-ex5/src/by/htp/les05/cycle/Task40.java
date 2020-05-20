package by.htp.les05.cycle;

public class Task40 {

	public static void task() {
		int x;
		int n = 140;
		boolean z;
		for (int i = 1; i < n; i++) {
			x = i;
			z = true;
			while (x > 0 && z == true) {
				if (x % 10 == 0 || (i % (x % 10) != 0)) {
					z = false;
				} else {
					x /= 10;
				}
			}
			if (z == true) {
				System.out.print(i + " ");
			}

		}

	}

}

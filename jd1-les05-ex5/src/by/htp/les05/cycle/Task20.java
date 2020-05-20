package by.htp.les05.cycle;

public class Task20 {

	public static void task() {
		int i = 1;
		double elem;
		double sum = 0;

		double e = 0.001;

		while (true) {

			elem = (double) 1 / ((3 * i - 2) * (3 * i + 1));
			System.out.println(elem);

			if (Math.abs(elem) < e) {
				break;
			}

			sum += elem;
			i++;
		}
		System.out.println("Sum = " + sum);
	}

}

package by.htp.les05.cycle;

public class Task18 {

	public static void task() {

		int i = 1;
		double sum = 0;
		double elem;
		double e = 0.001;

		while (true) {

			elem = Math.pow(-1, i - 1) / i;

			if (Math.abs(elem) < e) {
				break;
			}

			sum += elem;
			i++;
		}
		System.out.println("Sum = " + sum);

	}
}

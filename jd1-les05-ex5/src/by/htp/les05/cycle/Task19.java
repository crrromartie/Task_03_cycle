package by.htp.les05.cycle;

public class Task19 {

	public static void task() {
		int i = 1;
		double sum = 0;
		double elem;
		double e = 0.015;

		while (true) {

			elem = (1.0 / Math.pow(2, i)) + (1.0 / Math.pow(3, i));

			if (Math.abs(elem) < e) {
				break;
			}

			sum += elem;
			i++;
		}
		System.out.println("Sum = " + sum);
	}

}

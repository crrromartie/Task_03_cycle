package by.htp.les05.cycle;

public class Task14 {

	public static void task() {
		double n = 1.0;
		double sum = 0;
		while(n <= 15.0) {
			sum += 1/n;
			n++;
		}
		System.out.println("Sum = " + sum);
	}

}

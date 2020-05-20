package by.htp.les05.cycle;

public class Task11 {

	public static void task() {
		int x = 0;
		int rez = 0;
		while (x <= 200) {
			rez -= (int) Math.pow(x, 3);
			x++;
		}
		System.out.println("Diff = " + rez);

	}

}

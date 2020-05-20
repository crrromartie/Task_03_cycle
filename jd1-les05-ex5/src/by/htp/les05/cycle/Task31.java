package by.htp.les05.cycle;

public class Task31 {

	public static void task() {
		int y1 = 7;
		int y2 = 11;
		int y3 = 2;
		int y4 = 8;
		int y5 = 9;
		System.out.println("y1 = " + y1);
		System.out.println("y2 = " + y2);
		System.out.println("y3 = " + y3);
		System.out.println("y4 = " + y4);
		System.out.println("y5 = " + y5);
		System.out.println();
		System.out.println("Random numbers [1 .. 15]");
		int[] ar = new int[5];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = (int) (Math.random() * 15) + 1;
			System.out.print(ar[i] + " ");
		}

		System.out.println();
		System.out.println("Guessed numbers:");
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == y1 || ar[i] == y2 || ar[i] == y3 || ar[i] == y4 || ar[i] == y5) {
				System.out.print(ar[i] + " ");
			}
		}

		System.out.println();
		System.out.println("Unguessed numbers:");
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != y1 && ar[i] != y2 && ar[i] != y3 && ar[i] != y4 && ar[i] != y5) {
				System.out.print(ar[i] + " ");
			}
		}

		int counter1 = 0;
		int counter2 = 0;
		int counter3 = 0;
		int counter4 = 0;
		int counter5 = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == y1) {
				counter1++;
			}
			if (ar[i] == y2) {
				counter2++;
			}
			if (ar[i] == y3) {
				counter3++;
			}
			if (ar[i] == y4) {
				counter4++;
			}
			if (ar[i] == y5) {
				counter5++;
			}
		}

		System.out.println();
		if (counter1 == 0) {
			System.out.println("y1: " + y1 + " - wrong number");
		}
		if (counter2 == 0) {
			System.out.println("y2: " + y2 + " - wrong number");
		}
		if (counter3 == 0) {
			System.out.println("y3: " + y3 + " - wrong number");
		}
		if (counter4 == 0) {
			System.out.println("y4: " + y4 + " - wrong number");
		}
		if (counter5 == 0) {
			System.out.println("y5: " + y5 + " - wrong number");
		}
	}

}

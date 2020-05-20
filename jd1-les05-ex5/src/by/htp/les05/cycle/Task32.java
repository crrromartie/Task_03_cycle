package by.htp.les05.cycle;

public class Task32 {

	public static void task() {
		String str = "_Igor_570";
		char[] result = str.toCharArray();
		int counter = 0;
		if (!Character.isLetter(result[0]) && result[0] != '_') {
			System.out.println("Incorrect string");
			return;
		} else {
			for (int i = 1; i < result.length; i++) {
				if (!Character.isLetter(result[i]) && !Character.isDigit(result[i]) && result[i] != '_') {
					counter++;
				}
			}
		}

		if (counter > 0) {
			System.out.println("Incorrect string");
		} else {
			System.out.println("Correct string");
		}

	}

}

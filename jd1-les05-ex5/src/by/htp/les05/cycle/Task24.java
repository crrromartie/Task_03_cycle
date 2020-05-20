package by.htp.les05.cycle;

public class Task24 {
	
	public static void task() {
		int x = 418765;
		int y = 0;
		int counter = 0;
		
		while(x > 0) {
			
			if(x % 10 % 2 == 0)
			{
				counter++;
			}
			y = 10 * y + x % 10;
			x /= 10;
		}
		System.out.println("Revers X = " + y);
		System.out.println("Count even = " + counter);
	}

}

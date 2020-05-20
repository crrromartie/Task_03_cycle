package by.htp.les05.cycle;

import java.math.BigInteger;

public class Task10 {

	public static void task() {
		BigInteger p = BigInteger.valueOf(1);
        int x = 0;
		for (int i = 1; i <= 200; i++) {
			x = (int) Math.pow(i, 2);
			BigInteger b = BigInteger.valueOf(x);
			p = p.multiply(b);
		}
		System.out.println(p);
	}

}

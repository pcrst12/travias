package javabook.ch6;

import java.util.Random;

public class lotto {
	public static void main(String[] args) {
		Random r = new Random();
		int rnum1 = r.next(10);
		long num2 = r.nextLong();
		System.out.println("rnum1" + rnum1);
	}
}

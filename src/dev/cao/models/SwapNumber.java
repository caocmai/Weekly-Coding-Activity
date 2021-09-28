package dev.cao.models;

public class SwapNumber {
	
	public static void swapNumber(int x, int y) {
		x += y;
		y = x-y;
		x -= y;
		System.out.println("x: " + x + " y: " + y);
	}

}

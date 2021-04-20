package week2;

import acm.program.*;

public class Fibonacci extends ConsoleProgram {

	private static int MYRIAD = 10000;
	int x = 0;
	int y = 1;
	
	public void run() {
		while ( y < MYRIAD) {
			int z= x + y;
			x = y;
			y = z;
			println(x + " ");
		}
		}
	}

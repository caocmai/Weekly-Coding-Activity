package dev.cao.app;

import dev.cao.models.MemorySize;

public class App {
	
	
	public static void main(String[] args) {
		MemorySize ms = new MemorySize();
		System.out.println(ms.actualMemorySize("32GB"));
		System.out.println(ms.actualMemorySize("2GB"));
		System.out.println(ms.actualMemorySize("512MB"));
		/* Console Output
		 * 29.76GB
		 * 1.86GB
		 * 476.16MB
		 */
		
	}

}

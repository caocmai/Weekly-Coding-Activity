package dev.cao.app;

import dev.cao.models.MemorySize;

public class App {
	
	
	public static void main(String[] args) {
		MemorySize ms = new MemorySize();
		System.out.println(ms.actualMemorySize("32GB"));
		System.out.println(ms.actualMemorySize("2GB"));
		System.out.println(ms.actualMemorySize("512MB"));
		System.out.println(ms.actualMemorySize("113GB"));
		System.out.println(ms.actualMemorySize("1KB"));
		System.out.println(ms.actualMemorySize("1GB"));

		/* Console Output
		 * 29.76GB
		 * 1.86GB
		 * 476MB
		 * 930MB
		 */
	}
	

}

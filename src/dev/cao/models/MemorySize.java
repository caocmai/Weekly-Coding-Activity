package dev.cao.models;

public class MemorySize {

	public String actualMemorySize(String size) {
		int stringSize = size.length();
		String type = size.substring(stringSize-2, stringSize-1);
		String amount = size.substring(0, stringSize-2);

		double intAmount = Double.parseDouble(amount);
		double actualSize = intAmount * .93;
		
		String sizes = "KMGTP";
		int index = sizes.indexOf(type);
		
		if (actualSize <= 1 && index > 0) {
			char returnType = sizes.charAt(index-1);
			return String.valueOf(Math.round(actualSize * 1000)) + String.valueOf(returnType) + "B";
		} 
		
		// if the starting storage is at least G then will show decimals
		if (index > 1) {
			return String.format("%.2f", actualSize) + type + "B";
		}
		
		return String.valueOf(Math.round(actualSize)) + type + "B";

	}

}
 
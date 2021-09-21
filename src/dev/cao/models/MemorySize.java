package dev.cao.models;

public class MemorySize {
	
	public String actualMemorySize(String size) {
	    String type = size.substring(size.length()-2);
	    String amount = size.substring(0, size.length()-2);
	    int intAmount = Integer.parseInt(amount);

	    if (type.equals("MB")) {
	      return String.valueOf(Math.round(intAmount * .93)) + type;
	    } 

	    double actualSize = intAmount * .93;
	    return String.format("%.2f", actualSize) + type;
	  }

}

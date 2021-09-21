package dev.cao.models;

public class MemorySize {
	
	public String actualMemorySize(String size) {
	    String type = size.substring(size.length()-2);
	    String amount = size.substring(0, size.length()-2);
	    double intAmount = Double.parseDouble(amount);
	    
	    double actualSize = intAmount * .93;

	    if (type.equals("MB")) {
	      return String.valueOf(Math.round(actualSize)) + type;
	    }
	    
	    if (actualSize <= 1 && type.equals("TB")) {
	    	return String.valueOf(Math.round(actualSize * 1000)) + "GB";
	    }
	    
	    if (actualSize <= 1 && type.equals("GB")) {
	    	return String.valueOf(Math.round(actualSize * 1000)) + "MB";
	    }

	    return String.format("%.2f", actualSize) + type;
	  }

}

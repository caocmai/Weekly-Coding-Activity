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
	    
	    if (actualSize <= 1) {
	    	String returnType = "";
	    	switch (type) {
				case "TB":
					returnType = "GB";
					break;
				case "GB":
					returnType = "MB";
					break;
				default:
					break;
			}
	    	return String.valueOf(Math.round(actualSize * 1000)) + returnType;
	    }

	    return String.format("%.2f", actualSize) + type;
	  }

}

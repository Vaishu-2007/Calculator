
package com.calculator;

public class Calculator {
	public boolean isPositive(int number) {
	    if (number > 0) {
	        return true;
	    } else if(number < 0){
	        return false;
	    }
	    else if(number > 0){
	        return true;
	    }
	    else {
	    	return false;
	    }
	    
	}

    public static void main(String[] args) {

        int a = 20;
        int b = 10;

        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);

        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
    }
}


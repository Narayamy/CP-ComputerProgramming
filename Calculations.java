/**
 * @(#)Calculations.java
 *
 * Calculations application
 *
 * @author 
 * @version 1.00 2017/10/17
 */
 
public class Calculations {
    
    public static void main(String[] args) {
    	
    	int divider = 13;
    		int dividend = 4;
    	System.out.println("Hello everybody, Let's make some calculations?");
    	System.out.println("I'll show you the result of 13 divided by 4 ");
    	System.out.println("The result would be " + divider / dividend);
    	System.out.println("let's make it more complicated?");
    	System.out.println("What would be the remainder of them? " + "Curious?");
    	System.out.println("The answer is " + divider % dividend);
    if(divider%2==0){
    	System.out.println("The number is even!");
        }
        else{
        	System.out.println("The number is odd.");
        }
    	System.out.println("Any more ideas?");
    	System.out.println("Shall we see the volume of a sphere with radius 6 cm?");
    		
    		double pi = 3.14;
    			int r = 6;
    			double v = ((4.0/3.0)*pi*r*r*r);
    			System.out.println("The calculation result of this would be "+ v + (" cm cubed"));
    	
    	
    }
}

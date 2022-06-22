import java.util.Scanner;
 
public class IfElse {
    
    public static void main(String[] args) {
    	
   Scanner in = new Scanner(System.in);
    	System.out.println("Good Morning, let's calculate how much will be the insurance for your car.");
    	System.out.println("First, what is your age?");
    	int userAge = in.nextInt();
    	if(userAge<=16){
    		System.out.println("Sorry, you are too young to be insured.");
    	} else if(userAge>=17 && userAge<=25){
    		System.out.println("Your insurance will be 1000 euro.");
    	}
    	  else if(userAge>=26 && userAge<=35){
    	  	System.out.println("Your insurance will be 600 euro.");
    	  }
    	  else if(userAge>=36 && userAge<=50){
    	  	System.out.println("Your insurance will be 400 euro.");
    	  }
    	  else if(userAge>=51 && userAge<=80){
    	  	System.out.println("Your insurance will be 500 euro.");
    	  }
    	  else{
    	  	System.out.print("Please call the insurance company to get a quote.");
    	      			
    	}
    	
    }
}

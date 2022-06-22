import java.util.Scanner;
public class randomNumbers {
    
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	
    	System.out.println("Welcome, would you like to play a guessing game? Please, put y or n.");
    	char wantToPlay = in.nextLine().charAt(0);
    	if (wantToPlay=='y'){
    		int x = 1 + (int)(Math.random()*((10-1)+1));
    		System.out.println("Please enter a number between 1 and 10.");
    		int guessedNumber = in.nextInt();
    
    	if (guessedNumber==x){
    		System.out.println("Great, you nailed it.");    		
    	}
    	else{
    		System.out.println("Sorry, try again.");
    		System.out.println("The right number is " + x);
    	}}
    	else{
    		System.out.print("Ok, maybe later.");
    	}
    }
}

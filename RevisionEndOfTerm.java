/**
 * @(#)RevisionEndOfTerm.java
 *
 * RevisionEndOfTerm application
 *
 * @author 
 * @version 1.00 2018/2/6
 */
 import java.util.Scanner;
public class RevisionEndOfTerm {
    
    	public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);    	
    	
    	System.out.println("Hello user, please enter a number");
    	int userNumber = in.nextInt();
    	System.out.println("Great, let's make a countdown until zero from " + userNumber);
    	while (userNumber>=0){
    		System.out.println(userNumber);
    		userNumber--;
    		}
    }
}

import java.util.Scanner;
 
public class WhileLoops {
    
    public static void main(String[] args) {
    	
    	Scanner in = new Scanner(System.in);
    	System.out.println("Give me a number:");
    	int userNumber = in.nextInt();
    	int counter = 0;
    	while(counter<=userNumber){
    		System.out.println(counter);
    		counter++;
    	}
    	
    	
    	
    	
    	
    }
}

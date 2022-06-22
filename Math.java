import java.util.Scanner;
 
public class Math {
    
    public static void main(String[] args) {
    	
    // Scanner in = new Scanner(System.in);
    // System.out.println("Please give me a number less than 100:");
    // int userNumber = in.nextInt();
    // if (userNumber< 100){
    //	   
   //   if (userNumber%7==0){
    // 	System.out.println("Great job, you found a number divisible by 7");
   // }
   // else{ 
    //	System.out.println("The number you have chosen is not divisible by 7");   
   // }
    //}
    // else{
      //	System.out.println("Please, this number is outside the specified range, give me another one.");
      // }
      
      //Scanner in = new Scanner(System.in);
      //int guessNumber = 13;
      //System.out.println("What is your age?");
      //int userAge = in.nextInt();
      //if (userAge>=18&&userAge<=30){
      	//System.out.println("Great, you're in. Could you guess a lucky number between 1 and 20?");
      	//int guessUser = in.nextInt();
      	
      	//	if (guessUser==guessNumber){
      	//	System.out.println("You nailed it."); 
      	//}
      	//	else{
      	//	System.out.println("Sorry, that is not the right number. Better luck next time.");
      	//}
//
  //    }
    //  else{
      //	System.out.println("Sorry you're not allowed to compete for now, maybe next year.");
     // }
      
      
      Scanner in = new Scanner(System.in);
      System.out.println("Could you give me a positive odd number?");
      	int userNumber = in.nextInt();
      	if (userNumber%2==0||userNumber<=0){
      		System.out.println("Sorry, but this number is not positive or odd.");
      	}
      	else{
      		System.out.println("Great, that is a good number.");
      	}
      
      
      
}
}

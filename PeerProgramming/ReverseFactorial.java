package PeerProgramming;
import java.util.Scanner; 
public class ReverseFactorial  { 
   public static void main(String[] args) 
   { 
      Scanner inputTaker = new Scanner(System.in); 
      System.out.println("Enter reverse factorial starting number: "); 
      int start = inputTaker.nextInt(); 
      
      int reverseFactorial = start;  // e.g. 5 = 5

      for(int counter = 2; reverseFactorial != counter; counter++){  // while 5 != (counter) 2, add 1 to counter
         reverseFactorial = reverseFactorial / counter; 
      } 
      System.out.println("You entered: " + start + ", reverse factorial of this is: " + reverseFactorial);
      inputTaker.close();
   } 
} 
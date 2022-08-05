package PeerProgramming;
import java.util.Scanner;

public class Factorials {

            public static void main(String[] args){

                Scanner inputTaker = new Scanner (System.in);
                System.out.println("Enter your number: ");
        
                int n = inputTaker.nextInt();

                long fact = 1;
                for (int i = 2; i <= n; i++) {
                    fact = fact * i;

                    System.out.println(fact);
                }
            inputTaker.close();
        
    }
}
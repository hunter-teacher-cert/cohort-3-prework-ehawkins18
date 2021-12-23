import java.io.*;
import java.util.*;

public class Guess{
public static void main(String[]args){

  Random random = new Random();
  Scanner in = new Scanner(System.in);

  int secretNumber = random.nextInt(100)+1;

  System.out.println("I am thinking of a number between 1 and 100 (including both). Can you guess what it is?");
  System.out.print("Type a number: ");
  int guess = in.nextInt();
  System.out.print("Your guess is: ");
  System.out.println(guess);
  System.out.print("The number I was thinking of is: ");
  System.out.println(secretNumber);
  System.out.println("You were off by "+(guess-secretNumber)+".");

}
}
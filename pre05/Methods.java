import java.io.*;
import java.util.*;

public class Methods{

//Exercise 2: isDivisible
  public static boolean isDivisible(int n, int m) {
    if(n%m==0){
      return true;
    } else {
      return false;
    }
  }

//Exercise 3: isTriangle
  public static boolean isTriangle(int a, int b, int c){
    if ((a < b+c) && (b < a+c) && (c < a+b)){
      return true;
    } else {return false;
    }
  }

//Exercise 8: ack
  public static int ack(int m, int n){
    if (m==0) {return (n+1);
    }
    if (n==0) {return ack((m-1),1);
    }
    return ack((m-1), ack(m,(n-1)));
  }

//Method main to call Methods from the Exercises
  public static void main(String[]args){

    //call Method ack
    System.out.println("The value of ack(2,2) is "+ack(2,2)+".");
    System.out.println("The value of ack(3,4) is "+ack(3,4)+".");
    System.out.println();

    //call Method isDivisible
    System.out.println("The value of isDivisible(24,7) is "+isDivisible(24,7)+".");
    System.out.println("The value of isDivisible(25,5) is "+isDivisible(25,5)+".");
    System.out.println();

    //call Method isTriangle
    System.out.println("The value of isTriangle (5,6,4) is "+isTriangle(5,6,4)+".");
    System.out.println("The value of isTriangle (5,3,14) is "+isTriangle(5,3,14)+".");
    System.out.println();

  }

}
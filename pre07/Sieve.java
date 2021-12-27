import java.io.*;
import java.util.*;

public class Sieve{

  public static boolean[] sieve(int n){
    //create array 
    boolean[] a = new boolean [n];
    for(int i = 0; i < a.length; i++){
    a[i] = true;
    }
    //apply the sieve to the array
    for(int i = 2; i < a.length; i++){
      for(int j = 2; i*j < a.length; j++){
        a[i*j] = false;
      }
    }
  return a;
  }

  public static void main(String[]args){
  //create array representing all positive integers up to the given number n
  boolean[] isPrime = new boolean [20];
  isPrime = sieve(20);
  System.out.println(Arrays.toString(isPrime));
  System.out.println("Debug OK");
  }


}
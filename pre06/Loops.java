import java.io.*;
import java.util.*;

public class Loops{

//Think Java Ch 7 Exercises
  //Exercise 2 squareRoot
  public static double squareRoot(double a){
    double temp;
    double sr = a/2;
    do { temp = sr;
    sr = (temp + a/temp)/2;
    } while (Math.abs(sr-temp)>=0.0001);
    return a;
  }

  public static void main(String[]args){
    System.out.println(squareRoot(2));
    System.out.println("debug check OK");
  
  }

}

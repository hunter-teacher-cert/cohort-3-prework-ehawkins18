import java.io.*;
import java.util.*;

public class Max{

  //method to find index of largest element in an integer array
  public static int indexOfMax(int[] a){
    int maxIndex = 0;
    int tempMax = a[0];
    for(int i = 1; i < a.length; i++){
      if(a[i] > tempMax){
        maxIndex = i;
        tempMax = a[i];
      }
    }
    return maxIndex;
  }

  //method to create a random array of specified length
  public static int[] randomArray(int size){
    Random random = new Random();
    int[] a = new int[size];
    for(int i = 0; i < size; i++){
      a[i] = random.nextInt(100);
    }
    return a;
  }

//main method
  public static void main(String[]args){
    //call random Array to create a random array
    int[] values = randomArray(10);
    //print the array
    System.out.println("For the array:");
    System.out.println(Arrays.toString(values));
    System.out.println();
    //call indexOfMax and print the result
    System.out.println("The index of the Max value is:");
    System.out.println(indexOfMax(values));
    System.out.println();
  }
}
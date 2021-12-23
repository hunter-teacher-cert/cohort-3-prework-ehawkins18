import java.io.*;
import java.util.*;

public class Celsius{
public static void main(String[]args){

double celsius, fahrenheit;

Scanner in = new Scanner(System.in);
System.out.println("Enter Celsius temperature:");
celsius = in.nextDouble();
fahrenheit = 9*celsius/5+32;

System.out.printf("%.1f C = %.1f F\n", celsius,fahrenheit);

}
}
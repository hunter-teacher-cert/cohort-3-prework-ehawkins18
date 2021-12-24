import java.io.*;
import java.util.*;

public class Date{
public static void main(String[]args){

String day, month;
int date, year;

day = "Thursday";
month = "December";
date = 23;
year = 2021;

System.out.println("American format:");
System.out.println(day+", "+month+" "+date+", "+year);
System.out.println();
System.out.println("European format:");
System.out.println(day+" "+date+" "+month+" "+year);

}
}
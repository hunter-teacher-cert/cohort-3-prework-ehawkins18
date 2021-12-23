import java.io.*;
import java.util.*;

public class Time{
public static void main(String[]args){

int hour = 7;
int minute = 47;
int second = 36;
int secondsSinceMidnight = hour*3600+minute*60+second;
int secondsRemainingInDay = 24*3600-secondsSinceMidnight;
double percentOfDayPassed = (double) ((100*secondsSinceMidnight)/(24*3600));

System.out.print("The current time is ");
System.out.print(hour);
System.out.print(":");
System.out.print(minute);
System.out.println(".");
System.out.print(secondsSinceMidnight);
System.out.println(" seconds have elapsed since midnight.");
System.out.println("There are "+secondsRemainingInDay+" seconds remaining in the day.");
System.out.println(percentOfDayPassed+" percent of the day has passed.");
hour = 8;
minute = 11;
second = 15;

System.out.print("The updated time is ");
System.out.print(hour);
System.out.print(":");
System.out.print(minute);
System.out.println(".");
int updatedSecondsSinceMidnight = hour*3600+minute*60+second;
int timeElapsed = updatedSecondsSinceMidnight-secondsSinceMidnight;
System.out.println(timeElapsed+" seconds have elapsed while working on this program.");
}
}
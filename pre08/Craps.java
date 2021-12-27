import java.io.*;
import java.util.*;

public class Craps{

//Method roll for rolling a die
  public static int roll(int maxRoll){
    //returns an integer between 1 and maxRoll (both includesive)
    Random random = new Random();
    int numRolled = random.nextInt(maxRoll) + 1;
  return numRolled;
  }
//Method shoot for rolling multiple dice
  public static int shoot(int numDice, int maxRoll){
    //returns an integer between numDice and (numDice * maxRoll) (both inclusive)
    int rollTotal = 0;
    for (int i = 1; i <= numDice; i++){
      rollTotal += roll(maxRoll);
    }
  return rollTotal;
  }
//Method point for when shooter rolls a 4, 5, 6, 8, 9, or 10
  public static boolean point(int pointVal){
    boolean pointWins;
    //System.out.println("point is "+pointVal);
    int pointRoll = shoot(2,6);
    System.out.println(" point roll "+pointRoll);
    if(pointRoll == pointVal){pointWins = true;}
      else{if(pointRoll == 7){pointWins = false;}
        else {pointWins = point(pointVal);}}
    return pointWins;
  }
//Method round for determining if the shooter wins or loses
  public static boolean round(){
    //returns true if the shooter wins the round and returns false if the shooter loses the round
    Boolean shooterWins;
    int shooterRoll = shoot(2,6);
    System.out.println("Shooter rolled "+shooterRoll);
    if(shooterRoll == 2 || shooterRoll == 3 || shooterRoll == 12) {return false;}
    if(shooterRoll == 7 || shooterRoll == 11) {return true;} else {System.out.println("Point is "+shooterRoll); shooterWins = point(shooterRoll);}
    
    return shooterWins;
  }
  public static void main(String[]args){
    Boolean result = round();
    if(result == true){System.out.println("Shooter wins.");}
      else{System.out.println("Shooter loses.");}
    
  }
}
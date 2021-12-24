import java.io.*;
import java.util.*;

public class Beer{  

    public static void beerCount(int beersOnWall) {
      if(beersOnWall==1)
        {System.out.println(beersOnWall+" bottle of beer on the wall,");
        System.out.println(beersOnWall+" bottle of beer,");
        System.out.println("ya' take one down, ya' pass it around,");
        System.out.println("No bottles of beer on the wall!");
        System.out.println();
        System.out.println("No bottles of beer on the wall,");
        System.out.println("no bottles of beer,");
        System.out.println("ya' can't take one down, ya' can't pass it around,");
        System.out.println("'cause there are no more bottles of beer on the wall!");
        }

      else
        {System.out.println(beersOnWall+" bottles of beer on the wall,");
        System.out.println(beersOnWall+" bottles of beer,");
        System.out.println("ya' take one down, ya' pass it around,");
        System.out.println((beersOnWall-1)+" bottles of beer on the wall!");
        System.out.println();
        beerCount(beersOnWall-1);
        }   

    }
  public static void main(String[]args){
    int beersOnWall;
    beersOnWall = 5;
    beerCount(beersOnWall);
  }
}

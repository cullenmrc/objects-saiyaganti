

/**
 * Write a description of class DICE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Random;

public class DICE
{
    public static void main( String[] args)
    {
        Random dice = new Random();
        System.out.println(dice.nextInt(255));
        
    }

}



/**
 * Write a description of class COlor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.Color;
import javax.swing.JFrame;
import java.util.Random;

public class COlor
{
     public static void main( String[] args)
    {
       Random dice = new Random();
       int x = (dice.nextInt(255));
       int y = (dice.nextInt(255));
       int z = (dice.nextInt(255));
       Color color = new Color(x,y,z);
       Color coler = new Color(z,y,x);
       turtle.setPenColor(color);
       turtle2.setPenColor(color);
        
    }
}



/**
 * THis lab makes the turtles make a colorful spiral
 * 
 * @author Sai Yaganti
 * @version 9/1/16
 */

import java.awt.Color;
import javax.swing.JFrame;
import java.util.Random;
public class Turtlelab
{
    public static void main(String args[])
    throws InterruptedException
    {
       World turtleWorld = new World(1000, 1000);
       
       Turtle turtle = new Turtle(turtleWorld);
       Turtle turtle2 = new Turtle(turtleWorld);
       Picture picture = new Picture("dank.jpg");
       turtleWorld.setPicture(picture);
       turtle.setPenColor(Color.BLUE);
       turtle2.setPenColor(Color.RED);
       turtle.turnLeft();
       turtle.setHeight(10);
       turtle2.setHeight(10);
       turtle2.setPenWidth(50);
       turtle.setPenWidth(50);
       
       int loopVal = 0;
       int tloop = 0;
       while (tloop != (300))
       {   
          Thread.sleep(35); 
          
          Random dice = new Random();
          int x = (dice.nextInt(255));
          int y = (dice.nextInt(255));
          int z = (dice.nextInt(255));
          Color color = new Color(x,y,z);
          Color coler = new Color(z,y,x);
          turtle.setPenColor(color);
          turtle2.setPenColor(color);
          
          turtle.forward(tloop);
          turtle2.forward(tloop);
          
          turtle.turn(40);
          turtle2.turn(40);
          
          turtle.forward(tloop);
          turtle2.forward(tloop);
          
          turtle.turn(40);
          turtle2.turn(40);
          
          turtle.forward(tloop);
          turtle2.forward(tloop);
          
           loopVal += 1;
          tloop += 1;
          
          if (loopVal == 5)
          {
              loopVal = 0;
            }
          
      
        
    }
          
          
          
          
         
       
       
       
        
    }

}


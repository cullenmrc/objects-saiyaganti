

import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        /* objects are entities in a program
         * Objects have properties
         * Objects are manipulated by invoking methods
         * 
         * Turtle world and turlte are variables  that reference obecjts
         * 
         * Classes describe a collection of objects that have the same behavior(methods) and tyoes of properties
         * 
         *World and turtle are classes
         *
         */
        World turtleWorld = new World();
        /* this is how we consturct objects 
         * the new operator is used to construct an object
         * we have to specify the class after the new operator
         * we also have to specify any arguments used to constuct the object
         */
       
        Turtle turtle = new Turtle(turtleWorld);
        
        /* the setPenColor method takes one argument 9the color
         * the setPenColor mehtod is a mutator method 
         * Mutator methods modify the state of the object
         * the pendown and foreward methods are mutator methods
         */
       
        turtle.setPenColor(Color.RED);
        // the penDown method takes no arguments
        turtle.penDown();
        turtle.forward(50);
        /* the penWidth method is an accesson method
         * accessor methods do not change the state of the object
         */
        int penWidth = turtle.getPenWidth();
        
        
        /* variables store values
         * variables have a type (int), a name (width), and a value (500)
         *
         */
        
        int width = (500);
       
      
        /* there are several Java primitive data types
         *  here are some examples 
         *
         */
        
        // Boolean stores true or false
        
        boolean isSummer= true;
        
        // int stores integer numbers
        int height = 400;
        
        // double stores real numbers (floating point)
        double scorePercentage = 0.85;
        
        // char stores a single character
        char letter = 'd';
    }
}
        
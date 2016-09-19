

/**
 * Write a description of class helloprinter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
// this line declares the class HelloPrinter
public class HelloPrinter
{
    // this class declares the main method, which is run when the program runs
    // public is an identifier defined by the java language
   public static void main( String[] args)
   {
       /* a body of a method contains statements; this line is a statement
        * in general methhods are called on objects
        * parameters are passes within parenthesis
        * println is an identifier defined by the java standered library
       */
       System.out.println( "Hello, World!!!!!");
       
       //x is an identifier defined by me
       int x;
       
       int y, x2, x_y, xy$;
       
       // this wont compile
       // int 27;
       
       // identifiers are case sensitive
       // there identifiers are all different
       
       String box, BOX, Box; 
       
       /* classes start with upper case letters
        * constatnts are upper case
        * everything else starts with a lower case 
       
     
        */
       
       int SPEED_OF_LIGHT = 300000000;
       String firstName;
       
       // this is a compile-time error ( the code does not compile)
       // this includes syntax errors, some sematic error
       
       //System.ou.println( "Hellow World"); 
       
       /* this is a run time error ( the program generates the error 
        * when it it run/executed
        * this is a logical error( the program does not crash but does not work as expected)
        * 
        */
       System.out.println( "Hellow Word"); 
       
       /* this is also a run time error, it is an exception, the program crashes in general
        * 
        */
       
       //System.out.println( 1/0); 
       
       
       
   }

}

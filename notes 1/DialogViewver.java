

/**
 * Write a description of class E115 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JOptionPane;
public class DialogViewver
{
    public static void main(String[] args)
    {
        String name = JOptionPane.showInputDialog("What is your name?: ");
        System.out.println("Hello " + name + "!");
    }
}

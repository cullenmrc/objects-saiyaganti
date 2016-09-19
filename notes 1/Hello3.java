

/**
 * Write a description of class Hello3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Hello3
{
    public static void main(String[] args) throws Exception
    {
        URL imageLocation = new URL("https://upload.wikimedia.org/wikipedia/commons/e/e1/Aziz_Ansari_2012_Shankbone.JPG");
        JOptionPane.showMessageDialog(null, "Heyy", "Title", JOptionPane.PLAIN_MESSAGE,
                                                    new ImageIcon(imageLocation));
    }
                                     
            
     
   
}

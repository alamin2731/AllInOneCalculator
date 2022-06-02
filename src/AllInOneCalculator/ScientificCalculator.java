package AllInOneCalculator;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Alamin
 */
public class ScientificCalculator {
    public static void main(String[] args) {
     Load s=new Load();
     
     s.pack();
      s.setLocationRelativeTo(null);
       s.setVisible(true);
     
    try        
{
    Thread.sleep(3000);
} 
catch(InterruptedException ex) 
{
    Thread.currentThread().interrupt();
}
     //TimeUnit.SECONDS.sleep(1);
     s.dispose();
     Normal n=new Normal();
     n.setVisible(true);
      n.setLocationRelativeTo(null);
    
    }  
}

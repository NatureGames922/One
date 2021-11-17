import objectdraw.*;
import java.awt.*;

/**
 * Write a description of class RisingSun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RisingSun extends WindowController
{
    // instance variables - replace the example below with your own
   public void begin() {
      new FilledOval(150,350,100,100,canvas);
      
      new Text("Please click the mouse repeatedly",20,20,canvas);
   }
}

/**
 *
 * File:  Initials.java
 * 
 * Author: Harrison Williams
 * 
 * Description: Draws my initials HTW
 * 
 */

import java.awt.*;

public class Initials {

    private Integer anchorX;
    private Integer anchorY;
    private Color   aColor;
    
    
    public Initials(Integer x, Integer y, Color c){
        anchorX = x;
        anchorY = y;
        aColor = c;
    } // end of constructor
    
    
    public void draw( Graphics g ) {
        //sets the color to whatever the user puts as the color
        g.setColor(aColor);
        
        //sets the line thickness to 5 pixels
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke( new BasicStroke(5) );
        
        //draws the H in my initals
        g.drawLine(anchorX, anchorY, anchorX, anchorY + 50);
        g.drawLine(anchorX, anchorY + 50/2, anchorX + 20, anchorY + 50/2);
        g.drawLine(anchorX + 20, anchorY, anchorX + 20, anchorY + 50);
        
        //draws the T in my initials
        g.drawLine(anchorX + 30, anchorY, anchorX + 60, anchorY);
        g.drawLine(anchorX + 90/2, anchorY, anchorX + 90/2, anchorY + 50);
        
        //draws the W in my Initials 
        g.drawLine(anchorX + 70, anchorY, anchorX + 80, anchorY + 50);
        g.drawLine(anchorX + 80, anchorY + 50, anchorX + 90, anchorY + 30);
        g.drawLine(anchorX + 90, anchorY + 30, anchorX + 100, anchorY + 50);
        g.drawLine(anchorX + 100, anchorY + 50, anchorX + 110, anchorY);
        
    } // end of draw()
    
} // end of class Logo

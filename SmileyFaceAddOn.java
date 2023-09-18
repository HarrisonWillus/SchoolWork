/**
 *
 * File:  SmileyFaceAddOn.java
 * 
 * Author: Harrison Williams
 * 
 * Description: Draws another Logo add on to the original logo
 * 
 */

import java.awt.*;

public class SmileyFaceAddOn {
    
    private Integer anchorX, anchorY, width, height;
    private Color aColor;
    
    public SmileyFaceAddOn(Integer x, Integer y, Integer w, Integer h, Color c){
        anchorX = x;
        anchorY = y;
        width = w;
        height = h;
        aColor = c;
    }
    
    public void draw(Graphics g){
        //sets pixel thickness to 1 px
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke( new BasicStroke(2) );

        //draws base circle and outlinefor the smiley face
        g.setColor(aColor);
        g.fillOval(anchorX, anchorY, width, height);
        g.setColor(Color.BLACK);
        g.drawOval(anchorX, anchorY, width, height);
        
        //draws the eyes on the smiley face
        g.setColor(Color.BLACK);
        g.fillOval(anchorX + 10, anchorY + 10, width/5, height/5);
        g.fillOval(anchorX + 30, anchorY + 10, width/5, height/5);
        
        //draws the smile on the face
        g.drawArc(anchorX + 10, anchorY + 20, width/2 + 5 , height/2, 180, 180);
    }
}

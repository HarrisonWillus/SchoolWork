/**
 *
 * File:  Logo.java
 * 
 * Author: Harrison Williams
 * 
 * Description: Draws a Logo of a bookshelf
 * 
 */

import java.awt.*;

public class Logo {

    private Integer anchorX, anchorY, width, height, shelves, books;
    private Color aColor;
    
    public Logo(Integer x, Integer y, Integer w, Integer h, Color c) {
        anchorX = x;
        anchorY = y;
        width = w;
        height = h;
        aColor = c;
        shelves = 5;
        books = shelves * 3;
    } // end of constructor
    
    
    public void draw( Graphics g ) {
        //initalizes the counting variables
        int k = 0;
        int o = 0;
        
        //draws the border for the bookshelf
        g.setColor(Color.BLACK);
        g.drawRect(anchorX, anchorY, width + width/20, height);
        
        //draws the shelves
        for(int i = 0; i <= height && k <= shelves; i =+ height * k/shelves){
            g.setColor(Color.BLACK);
            g.drawLine(anchorX, anchorY + i, anchorX + width + 10, anchorY + i);
                
                //draws the books on the shelves
                //each shelf has a different color except for the first and last one
                for(int j = 0; j <= width && k <= books; j =+ (width * o/shelves) * 1/3){
                    g.setColor(aColor);
                    g.fillRect(anchorX + j, anchorY + height * 1/shelves - height/6, width/20, height/6);
                    g.setColor(Color.CYAN);
                    g.fillRect(anchorX + j, anchorY + height * 2/shelves - height/6, width/20, height/6);
                    g.setColor(Color.MAGENTA);
                    g.fillRect(anchorX + j, anchorY + height * 3/shelves - height/6, width/20, height/6);
                    g.setColor(Color.PINK);
                    g.fillRect(anchorX + j, anchorY + height * 4/shelves - height/6, width/20, height/6);
                    g.setColor(aColor);
                    g.fillRect(anchorX + j, anchorY + height * 5/shelves - height/6, width/20, height/6);
                    o++;
                }
            k++;  
        }// end of for loop
        
    } // end of draw()
    
} // end of class Logo

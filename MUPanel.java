/* CSC 120 PA1
 * Harrison Williams
 * 09/06/2023
 *
 * Project Description: draws two logos and two initials
 *
 * Enhancements: changes thickness on initals from 1 to 5 pixels, 
 * and defines another class SmileyFaceAddOn to be with the bookshelf Logo
 * 
 */
import java.awt.*;
import javax.swing.*;

public class MUPanel extends JPanel {

    // 1. Declare private objects here:
    private Logo logo1, logo2;
    private Initials initials1, initials2;
    private SmileyFaceAddOn face1, face2;
    

    // constructor method
    public MUPanel() {
        setLayout(null);
        setPreferredSize(new Dimension(800, 600));
        setName("Harrison's Logo and Initials");
        setUp();
        setBackground(Color.GRAY);

        //instanciates all the objects
        logo1 = new Logo(100, 50, 200, 300, Color.GREEN);
        logo2 = new Logo(450, 225, 200, 300, Color.ORANGE);
        initials1 = new Initials(325, 150, Color.RED);
        initials2 = new Initials(675, 250, Color.BLUE);
        face1 = new SmileyFaceAddOn(30, 70, 50, 50, Color.PINK);
        face2 = new SmileyFaceAddOn(380, 245, 50, 50, Color.YELLOW);
        
        
    } // end of constructor
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //draws the methods
        logo1.draw(g);
        logo2.draw(g);
        initials1.draw(g);
        initials2.draw(g);
        face1.draw(g);
        face2.draw(g);
	
		
    } // end of paintComponent()
    
    
    
       
    
    
    
    /***********************************************
     * Do NOT change or delete anything below here!
     ***********************************************/
    public void setUp() {
        for (Component c: getComponents())
            c.setSize(c.getPreferredSize());
        JFrame f = new JFrame(getName());
        f.setContentPane(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);    
    }

    public static void main(String args[]){new MUPanel();}

} // end of class MUPanel

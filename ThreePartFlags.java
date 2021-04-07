/** 
 * Based on the ecs 100 template
 * Code for drawing Three Part Flags
 * Name: Josh Clark
 * Date: 08/04/2021
 */


import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;


/** 
 * class for drawing Three Part Flags flag
 */
public class ThreePartFlags{

    /**  
     * Constructor for objects of class ThreePartFlags
     */
    public ThreePartFlags(){
        UI.initialise();
        UI.addButton("Quit", UI::quit); // comment out for checkstyle
    }

    /**
     * Draw the French flag
     */
    private void drawFrance()
    {
        /* draw border for flag */
        UI.setLineWidth(2);
        UI.drawRect(300, 300, 600, 400);
        /* drawing the blue */
        UI.setLineWidth(1);
        UI.setColor(Color.blue);
        UI.fillRect(300, 300, 200, 400);
        /* drawing the white */
        UI.setLineWidth(1);
        UI.setColor(Color.white);
        UI.fillRect(500, 300, 200, 400);
        /* drawing the red */
        UI.setLineWidth(1);
        UI.setColor(Color.red);
        UI.fillRect(700, 300, 200, 400);
    }
    
    /**
     * Draw the Bolivian flag
     */
    private void drawBolivia()
    {
        /* draw border for flag */
        UI.setLineWidth(2);
        UI.drawRect(300, 300, 600, 450);
        /* drawing the green */
        UI.setLineWidth(1);
        UI.setColor(Color.green);
        UI.fillRect(300, 300, 600, 150);
        /* drawing the white */
        UI.setLineWidth(1);
        UI.setColor(Color.yellow);
        UI.fillRect(300, 450, 600, 150);
        /* drawing the red */
        UI.setLineWidth(1);
        UI.setColor(Color.blue);
        UI.fillRect(300, 600, 600, 150);
    }
    
    public static void main(String[] args){
        // instance for ThreePartFlags
        ThreePartFlags obj = new ThreePartFlags();
        // Ask user what flag they want to print
        UI.println("Flags: France, Bolivia");
        String whichFlag = UI.askString("Which flag: ");
        
        
        obj.drawFrance();
        obj.drawBolivia();
    }

}


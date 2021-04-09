import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;

/** 
 * Based on the ecs 100 template
 * Code for drawing extension part flags, i.e. Switzerland and stuff
 * Name: Josh Clark
 * Date: 08/04/2021
 */
public class Extension{
    // instance variables
    private final double TOPLEFT = 100.0;
    private final double LINEWIDTH = 1.0;
    private final double DIMENSION = 200.0;
    private final double INNERDIMENSION = 80.0;
    
    
    /**  
     * Constructor for objects of class Extension
     */
    public Extension(){
        UI.initialise();
        UI.addButton("Quit", UI::quit); // comment out for checkstyle
    }

    /**
     * Draw the Swiss flag
     */
    private void drawSwiss()
    {
        // fields
        double height = DIMENSION * 2.0;
        
        /* draw border for flag */
        UI.setLineWidth(LINEWIDTH + LINEWIDTH);
        UI.setColor(Color.red);
        UI.fillRect(TOPLEFT, TOPLEFT, height, height); // (100, 100) from top left, 400*400 square outline
        
        /* drawing the horizontal part of the cross */
        UI.setLineWidth(LINEWIDTH);
        UI.setColor(Color.white);
        UI.fillRect(TOPLEFT + INNERDIMENSION, TOPLEFT + INNERDIMENSION * 2, INNERDIMENSION * 3.0, INNERDIMENSION); // (180, 260) from top left, blue 240*80 rectangle
        
        /* drawing the vertical part of the cross */
        UI.setLineWidth(LINEWIDTH);
        UI.setColor(Color.white);
        UI.fillRect(TOPLEFT + INNERDIMENSION * 2, TOPLEFT + INNERDIMENSION, INNERDIMENSION, INNERDIMENSION * 3.0); // (260, 80) from top left, white 80*240 rectangle
    }
    
    /**
     * Draw the Japanese flag
     */
    private void drawJapan()
    {
        // fields
        double width = DIMENSION * 3.0;
        double height = DIMENSION * 2.0;
        
        /* draw border for flag */
        UI.setLineWidth(LINEWIDTH + LINEWIDTH);
        UI.drawRect(TOPLEFT, TOPLEFT, width, height);  // (100, 100) from top left, 600*400 rectangle
        
        /* drawing the red dot */
        UI.setLineWidth(LINEWIDTH);
        UI.setColor(Color.red);
        UI.fillOval(TOPLEFT * 2 + INNERDIMENSION, TOPLEFT + INNERDIMENSION, INNERDIMENSION * 3.0, INNERDIMENSION * 3.0); // (280, 180) from top left, red 240*240 circle
    }
    
    /**
     * main method for running program
     */
    public static void main(String[] args){
        // instance for extension
        Extension obj = new Extension();
        
        // constants for the countries names
        String SWISS = "swiss";
        String JAPAN = "japan";
        
        // Ask user what flag they want to print
        UI.println("Flags: swiss, japan");
        String whichFlag = UI.askToken("Which flag: ");
        
        // if/else for printing the right flag
        if (whichFlag.equals(SWISS)) // if user entered swiss
        {
            obj.drawSwiss();
        } 
        else if (whichFlag.equals(JAPAN)) // if user entered japan
        {
            obj.drawJapan();
        } 
    }

}


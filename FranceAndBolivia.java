import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;

/** 
 * Based on the ecs 100 template
 * Code for drawing France And Bolivia flags
 * Name: Josh Clark
 * Date: 08/04/2021
 */
public class FranceAndBolivia{
    // instance variables
    private final double TOPLEFT = 300.0;
    private final double LINEWIDTH = 1.0;
    private final double VERTSTRIP = 200.0, HORIZSTRIP = 150.0;
    
    
    /**  
     * Constructor for objects of class FranceAndBolivia
     */
    public FranceAndBolivia(){
        UI.initialise();
        UI.addButton("Quit", UI::quit); // comment out for checkstyle
    }

    /**
     * Draw the French flag
     */
    private void drawFrance()
    {
        // fields
        double height = VERTSTRIP * 2.0;
        
        /* draw border for flag */
        UI.setLineWidth(LINEWIDTH + LINEWIDTH);
        UI.drawRect(TOPLEFT, TOPLEFT, VERTSTRIP * 3.0, height); // (300, 300) from top left, 600*400 rectangle outline
        
        /* drawing the blue */
        UI.setLineWidth(LINEWIDTH);
        UI.setColor(Color.blue);
        UI.fillRect(TOPLEFT, TOPLEFT, VERTSTRIP, height); // (300, 300) from top left, blue 200*400 rectangle
        
        /* drawing the white */
        UI.setLineWidth(LINEWIDTH);
        UI.setColor(Color.white);
        UI.fillRect(TOPLEFT + VERTSTRIP, TOPLEFT, VERTSTRIP, height); // (500, 300) from top left, white 200*400 rectangle
        
        /* drawing the red */
        UI.setLineWidth(LINEWIDTH);
        UI.setColor(Color.red);
        UI.fillRect(TOPLEFT + height, TOPLEFT, VERTSTRIP, height); // (700, 300) from top left, red 200*400 rectangle
    }
    
    /**
     * Draw the Bolivian flag
     */
    private void drawBolivia()
    {
        // fields
        double width = HORIZSTRIP * 4.0;
        
        /* draw border for flag */
        UI.setLineWidth(LINEWIDTH + LINEWIDTH);
        UI.drawRect(TOPLEFT, TOPLEFT, width, HORIZSTRIP * 3.0);  // (300, 300) from top left, 600*450 rectangle outline
        
        /* drawing the green */
        UI.setLineWidth(LINEWIDTH);
        UI.setColor(Color.green);
        UI.fillRect(TOPLEFT, TOPLEFT, width, HORIZSTRIP); // (300, 300) from top left, green 600*150 rectangle
        
        /* drawing the white */
        UI.setLineWidth(LINEWIDTH);
        UI.setColor(Color.yellow);
        UI.fillRect(TOPLEFT, HORIZSTRIP * 3.0, width, HORIZSTRIP); // (300, 450) from top left, yellow 600*150 rectangle
        
        /* drawing the red */
        UI.setLineWidth(LINEWIDTH);
        UI.setColor(Color.blue);
        UI.fillRect(TOPLEFT, width, width, HORIZSTRIP); // (300, 600) from top left, blue 600*150 rectangle
    }
    
    /**
     * main method for running program
     */
    public static void main(String[] args){
        // instance for FranceAndBolivia
        FranceAndBolivia obj = new FranceAndBolivia();
        
        // constants for the countries names
        String FRANCE = "france";
        String BOLIVIA = "bolivia";
        
        // Ask user what flag they want to print
        UI.println("Flags: france, bolivia");
        String whichFlag = UI.askToken("Which flag: ");
        
        // if/else for printing the right flag
        if (whichFlag.equals(FRANCE)) // if user entered france
        {
            obj.drawFrance();
        } 
        else if (whichFlag.equals(BOLIVIA)) // if user entered bolivia
        {
            obj.drawBolivia();
        } 
    }

}


import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;

/** 
 * Based on the ecs 100 template
 * Code for drawing Three Part Flags
 * Name: Josh Clark
 * Date: 08/04/2021
 */
public class ThreePartFlags{
    // instance variables
    private final double TOPLEFT = 300.0;
    private final double LINEWIDTH = 1.0;
    private final double VERTSTRIP = 200.0, HORIZSTRIP = 150.0;
    
    // colour variables and arrays
    private Color Green = Color.green, Yellow = Color.yellow, Red = Color.red, Blue = Color.blue, White = Color.white, Orange = Color.orange, Black = Color.black;
    private final String[] STRINGCOLOURS = new String[] {"green", "yellow", "red", "blue", "white", "orange", "black"};
    private final Color[] COLOURS = new Color[] {Green, Yellow, Red, Blue, White, Orange, Black};
    
    
    /**  
     * Constructor for objects of class ThreePartFlags
     */
    public ThreePartFlags(){
        UI.initialise();
        UI.addButton("Quit", UI::quit); // comment out for checkstyle
    }

    /**
     * Draw vertical flags
     */
    private void drawVertical(String[] colours)
    {
        // fields
        String[] VertColours = colours;
        double height = VERTSTRIP * 2.0;
        
        /* draw border for flag */
        UI.setLineWidth(LINEWIDTH + LINEWIDTH);
        UI.drawRect(TOPLEFT, TOPLEFT, VERTSTRIP * 3.0, height); // (300, 300) from top left, 600*400 rectangle outline
        
        /* drawing the first stripe */
        UI.setLineWidth(LINEWIDTH);
        for (int i = 0; i < COLOURS.length; i++)
        {
            if (VertColours[0].equals(STRINGCOLOURS[i]))
            {
                UI.setColor(COLOURS[i]);
            }
        }
        UI.fillRect(TOPLEFT, TOPLEFT, VERTSTRIP, height); // (300, 300) from top left, blue 200*400 rectangle
        
        /* drawing the second stripe */
        UI.setLineWidth(LINEWIDTH);
        for (int i = 0; i < COLOURS.length; i++)
        {
            if (VertColours[1].equals(STRINGCOLOURS[i]))
            {
                UI.setColor(COLOURS[i]);
            }
        }
        UI.fillRect(TOPLEFT + VERTSTRIP, TOPLEFT, VERTSTRIP, height); // (500, 300) from top left, white 200*400 rectangle
        
        /* drawing the third stripe */
        UI.setLineWidth(LINEWIDTH);
        for (int i = 0; i < COLOURS.length; i++)
        {
            if (VertColours[2].equals(STRINGCOLOURS[i]))
            {
                UI.setColor(COLOURS[i]);
            }
        }
        UI.fillRect(TOPLEFT + height, TOPLEFT, VERTSTRIP, height); // (700, 300) from top left, red 200*400 rectangle
    }
    
    /**
     * Draw horizontal flags
     */
    private void drawHorizontal(String[] colours)
    {
        // fields
        String[] HorizColours = colours;
        double width = HORIZSTRIP * 4.0;
        
        /* draw border for flag */
        UI.setLineWidth(LINEWIDTH + LINEWIDTH);
        UI.drawRect(TOPLEFT, TOPLEFT, width, HORIZSTRIP * 3.0);  // (300, 300) from top left, 600*450 rectangle outline
        
        /* drawing the first stripe */
        UI.setLineWidth(LINEWIDTH);
        for (int i = 0; i < COLOURS.length; i++)
        {
            if (HorizColours[0].equals(STRINGCOLOURS[i]))
            {
                UI.setColor(COLOURS[i]);
            }
        }
        UI.fillRect(TOPLEFT, TOPLEFT, width, HORIZSTRIP); // (300, 300) from top left, green 600*150 rectangle
        
        /* drawing the second stripe */
        UI.setLineWidth(LINEWIDTH);
        for (int i = 0; i < COLOURS.length; i++)
        {
            if (HorizColours[1].equals(STRINGCOLOURS[i]))
            {
                UI.setColor(COLOURS[i]);
            }
        }
        UI.fillRect(TOPLEFT, HORIZSTRIP * 3.0, width, HORIZSTRIP); // (300, 450) from top left, yellow 600*150 rectangle
        
        /* drawing the third stripe */
        UI.setLineWidth(LINEWIDTH);
        for (int i = 0; i < COLOURS.length; i++)
        {
            if (HorizColours[2].equals(STRINGCOLOURS[i]))
            {
                UI.setColor(COLOURS[i]);
            }
        }
        UI.fillRect(TOPLEFT, width, width, HORIZSTRIP); // (300, 600) from top left, blue 600*150 rectangle
    }
    
    /**
     * main method for running program
     */
    public static void main(String[] args){
        // instance for ThreePartFlags
        ThreePartFlags obj = new ThreePartFlags();
        
        // constants for the vertical or horizontal option
        String VERTICAL = "V";
        String HORIZONTAL = "H";
        final int MAXCOLOURS = 3;
        // list for storing the colours
        String[] colours = new String[MAXCOLOURS];
        
        // Ask user what flag they want to print
        UI.println("Flag types: Vertical (V) or Horizontal (H)");
        String whichFlag = UI.askToken("Which flag type: ");
        
        // Ask user what colours they want
        UI.println("Colours: green, yellow, red, blue, white, orange, black");
        for (int i = 0; i < MAXCOLOURS; i++)
        {
            colours[i] = UI.askToken("Enter colour number " + i + ": ");
        }
        
        // if/else for printing the right flag
        if (whichFlag.equals(VERTICAL)) // if user entered V
        {
            obj.drawVertical(colours);
        } 
        else if (whichFlag.equals(HORIZONTAL)) // if user entered H
        {
            obj.drawHorizontal(colours);
        }
    }
}


package oop;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import java.util.concurrent.TimeUnit;
import uk.ac.leedsbeckett.oop.LBUGraphics;

public class MainClass extends LBUGraphics {
	
		Shape shapes = new Shape();
		
        public static void main(String[] args) {
                
        		new MainClass(); 
        }

        public MainClass() {
                
        		JFrame MainFrame = new JFrame("LBU Graphics Application");                
                MainFrame.setLayout(new FlowLayout()); 
                MainFrame.add(this);                                    
                MainFrame.pack();                                               
                MainFrame.setVisible(true);  
                MainFrame.setResizable(false);
                
                penDown();
                setPenColour(Color.red);
                
        }
        
        public void reset() {
        	
        	super.reset();
        	penDown();
        }
        
        public void processCommand(String input) {
        	
        	String[] inputtedArray = input.split(" ");
        	String command = inputtedArray[0].toLowerCase();
        	int value;
        	String posVal;
        	boolean validCommand = false;
        	int cmdLength = inputtedArray.length;
        	
        	if(cmdLength == 0) return;
        	
        	 if (cmdLength > 1) {
    			
        		posVal = inputtedArray[1];
    			try {
    				
    				value = Integer.parseInt(inputtedArray[1]);
    			
    			} catch (NumberFormatException e) {
    			
    				displayMessage("Please enter a valid numeric parameter.");
    				value = 0;
  	
    			}
    		} else {
    			
    			posVal = null;
    			value = 0;	
    
    		}
        	
        	System.out.println("User calls "+command);
        	
        	// --- Turtle moves FORWARD
        	
        	if(command.equals("forward") && cmdLength == 1) {
        		
        		forward(25);
        		validCommand = true;
        		
        		displayMessage("Missing parameter, Turtle moves forward the default number of pixels");
        	} else if(command.equals("forward") && cmdLength > 1) {
        		
        		forward(value);
        		validCommand = true;
        		
        		displayMessage("Turtle moves forward "+posVal+" number of pixels");
        	}
        	
        	if(command.equals("backward") && cmdLength == 1) {
        		
        		forward(-25);
        		validCommand = true;
        		
        		displayMessage("Missing parameter, Turtle moves backwards the default number of pixels");
        	} else if(command.equals("backward") && cmdLength > 1) {
        		
        		forward(-value);
        		validCommand = true;
        		
        		displayMessage("Turtle moves backwards "+posVal+"number of pixels");
        	}
        	
        	// --- Turtle turns LEFT
        	
        	if(command.equals("left") && cmdLength == 1) {
        		
        		turnLeft();
        		validCommand = true;
        		
        		displayMessage("Missing parameter, Turtle turns left at the default angle");
        	} else if(command.equals("left") && cmdLength > 1) {
        		
        		turnLeft(value);
        		validCommand = true;
        		
        		displayMessage("Turtle turns left by "+posVal+" degrees");
        	}
        	
        	// --- Turtle turns RIGHT
        	
        	if(command.equals("right") && cmdLength == 1) {
        		
        		turnRight();
        		validCommand = true;
        		
        		displayMessage("Missing parameter, Turtle turns right at the default angle");
        	} else if(command.equals("right") && cmdLength > 1) {
        		
        		turnRight(value);
        		validCommand = true;
        		
        		displayMessage("Turtle turns right by "+posVal+" degrees");
        	}
        	
        	// --- CLEARS the GUI
        	
        	if(command.equals("clear")) {
        		
        		clear();
        		validCommand = true;
        		
        		displayMessage("GUI clears");
        	}
        	
        	// --- RESETS the GUI
        	
        	if(command.equals("reset")) {
        		
        		reset();
        		validCommand = true;
        		
        		displayMessage("Turtle resets to initial position");
        	}
        	
        	// --- Turtle does the OOP dance :3
        	
        	if(command.equals("about")) {
        		
        		about();
        		validCommand = true;
        		
        		displayMessage("Turtle does cute dance :3");
        	}
        	
        	// --- Change pen COLOUR
        	
        	if(command.equals("colour")) {
        		
        		if(inputtedArray[1].equals("red")) {
        			
        			setPenColour(Color.red);
        			validCommand = true;
            		
        			displayMessage("Now using colour red");
        		}
        		
        		if(inputtedArray[1].equals("blue")) {
        			
        			setPenColour(Color.blue);
        			validCommand = true;
            		
        			displayMessage("Now using colour blue");
        		}
        		
        		if(inputtedArray[1].equals("green")) {
        			
        			setPenColour(Color.green);
        			validCommand = true;
            		
        			displayMessage("Now using colour green");
        		}
        		
        		if(inputtedArray[1].equals("yellow")) {
        			
        			setPenColour(Color.yellow);
        			validCommand = true;
            		
        			displayMessage("Now using colour yellow");
        		}
        	}
        	
        	// --- Brings the pen UP or DOWN
        	
        	if(command.equals("pen")) {
        		
        		if(inputtedArray[1].equals("down")) {
        			
        			penDown();
        			validCommand = true;
            		
        			displayMessage("Turtle pen is pressed down");
        		}
        		
        		if(inputtedArray[1].equals("up")) {
        			
        			penUp();
        			validCommand = true;
    				
        			displayMessage("Turtle pen is up off the GUI");
        		}
        	}
        	
        	// --- Turtle draws a SQUARE
        	
        	if(command.equals("square") && cmdLength == 1) {
        		
    			shapes.square(25);
    			validCommand = true;
        		
    			displayMessage("Turtle draws a square");
    		} else if(command.equals("square") && cmdLength > 1) {
    			
    			shapes.square(value);
    			validCommand = true;
        		
    			displayMessage("Turtle draws a square");
    		}
        	
        	// --- Turtle draws a TRIANGLE
        	
        	if(command.equals("triangle") && cmdLength == 1) {
        		
        		shapes.triangle(25);
        		validCommand = true;
        		
        		displayMessage("Turtle draws a triangle");
        	} else if(command.equals("triangle") && cmdLength > 1) {
        		
        		shapes.triangle(value);
        		validCommand = true;
        		
        		displayMessage("Turtle draws a triangle");
        	}
        	
        	// --- Validates commands
        	
        	if(validCommand == false) {
        		
        		displayMessage("Please enter a valid command");
        	}
        }	
        
        class Shape{
        	
        	public void square(int length) {
    			
        		for (int i=0; i<4; i++) {
    				
    				penDown();
    				forward(length);
    				turnRight(90);
    				penUp();
    			}
        		
    			turnLeft(90);
    			forward(90); 
    			turnRight(90); 
    		}
        	
        	public void triangle(int length) {
        		
        		turnLeft(30);
        		for (int i=0; i<3; i++) {
        			
        			penDown();
        			forward(length);
        			turnRight(120);
        			penUp();
        		}
        		
        		turnLeft(60);
        		forward(40);
        		turnRight(90);
        	}
        }
}

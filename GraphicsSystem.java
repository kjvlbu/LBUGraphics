package oop;

import java.awt.Color;
import java.awt.Graphics2D;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

import uk.ac.leedsbeckett.oop.LBUGraphics;


public class GraphicsSystem extends LBUGraphics {
	
	Shape shapes = new Shape();

	public void about() {
		
		super.about();
		
		Graphics2D graphicGFX = getGraphics2DContext();
		graphicGFX.drawString("Kaven", 25, 25);
		
	}
	
	public void reset() {
    	
    	super.reset();
    	penDown();
    	setPenColour(Color.red);
    	
    }
	
	public void setStroke() {
		
		super.setStroke(WIDTH);
		penDown();
	}
	
	public void setTurtleSpeed() {
		
		super.setTurtleSpeed(turtleSpeed);
		penDown();
	}
	
	public void circle() {
		
		super.circle(ABORT);
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
				
				value = 0;
				displayMessage("Please enter a valid numeric parameter.");
				return;
				
			}
		} else {
			
			posVal = null;
			value = 0;	
		} 
    	 
    	if (value < 0) {
    		displayMessage("Negative numbers aren't valid, please enter a positive integer");
    		return;
    	}
    	
    	if (value > 250) {
    		displayMessage("Number too big, please use a sensible amount");
    		return;
    	}
    	
    	System.out.println("User calls "+command);
    	
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
    		
    		displayMessage("Turtle moves backwards "+posVal+" number of pixels");
    	}
    	
    	if(command.equals("left") && cmdLength == 1) {
    		
    		turnLeft();
    		validCommand = true;
    		
    		displayMessage("Missing parameter, Turtle turns left at the default angle");
    	} else if(command.equals("left") && cmdLength > 1) {
    		
    		turnLeft(value);
    		validCommand = true;
    		
    		displayMessage("Turtle turns left by "+posVal+" degrees");
    	}
    	
    	if(command.equals("right") && cmdLength == 1) {
    		
    		turnRight();
    		validCommand = true;
    		
    		displayMessage("Missing parameter, Turtle turns right at the default angle");
    	} else if(command.equals("right") && cmdLength > 1) {
    		
    		turnRight(value);
    		validCommand = true;
    		
    		displayMessage("Turtle turns right by "+posVal+" degrees");
    	}
    	
    	if(command.equals("width") && cmdLength == 1) {
    		
    		displayMessage("Please set a width");
    		return;
    	} else if(command.equals("width") && cmdLength > 1) {
    		
    		setStroke(value);
    		validCommand = true;
    		
    		displayMessage("Turtle width set to "+posVal);
    	}
    	
    	if(command.equals("speed") && cmdLength == 1) {
    		
    		displayMessage("Please set a speed");
    		return;
    	} else if(command.equals("speed") && cmdLength > 1) {
    		
    		setTurtleSpeed(value);
    		displayMessage("Speed set to "+posVal);
    		validCommand = true;
    	}
    	
    	if(command.equals("clear")) {
    		
    		clear();
    		validCommand = true;
    		
    		displayMessage("GUI clears");
    	}
    	
    	if(command.equals("reset")) {
    		
    		reset();
    		validCommand = true;
    		
    		displayMessage("Turtle resets to initial position");
    	}
    	
    	if(command.equals("about")) {
    		
    		about();
    		validCommand = true;
    		
    		displayMessage("Turtle does the OOP dance");
    	}
    	
    	if(command.equals("red")) {
    		
    		setPenColour(Color.red);
    		validCommand = true;
    		
    		displayMessage("Now using colour red");
    	}
    	
    	if(command.equals("green")) {
    		
    		setPenColour(Color.green);
    		validCommand = true;
    		
    		displayMessage("Now using colour green");
    	}
    	
    	if(command.equals("black")) {
    		
    		setPenColour(Color.black);
    		validCommand = true;
    		
    		displayMessage("Now using colour black");
    	}
    	
    	if(command.equals("white")) {
    		
    		setPenColour(Color.white);
    		validCommand = true;
    		
    		displayMessage("Now using colour white");
    	}
    	
    	if(command.equals("penup")) {
    		
    		penUp();
    		validCommand = true;
    		
    		displayMessage("Turtle pen moves up off the GUI");
    	}
    	
    	if(command.equals("pendown")) {
    		
    		penDown();
    		validCommand = true;
    		
    		displayMessage("Turtle pen is pressed down");
    	}

    	if(command.equals("square") && cmdLength == 1) {
    		
			shapes.square(25);
			validCommand = true;
    		
			displayMessage("Missing parameter, Turtle draws a default square");
		} else if(command.equals("square") && cmdLength > 1) {
			
			shapes.square(value);
			validCommand = true;
    		
			displayMessage("Turtle draws a square of "+posVal+" size");
		}
    	
    	if(command.equals("circle") && cmdLength == 1) {
    		
    		circle(25);
    		validCommand = true;
    		
    		displayMessage("Missing parameter, Turtle draws a default circle");
    	} else if(command.equals("circle") && cmdLength > 1) {
    		
    		circle(value);
    		validCommand = true;
    		
    		displayMessage("Turtle draws a circle of "+posVal+" size");
    	}
    	
    	if(command.equals("triangle") && cmdLength == 1) {
    		
    		shapes.triangle(25);
    		validCommand = true;
    		
    		displayMessage("Turtle draws a triangle");
    	} else if(command.equals("triangle") && cmdLength > 1) {
    		
    		shapes.triangle(value);
    		validCommand = true;
    		
    		displayMessage("Turtle draws a triangle of "+posVal+" size");
    	}
    	
    	if(command.equals("save")) {
    		 try {
    			BufferedImage buffImg = getBufferedImage();
    			File output = new File("LBU_Graphics_Image" + ".png");
    			ImageIO.write(buffImg, "png", output);
    			displayMessage("Image successfully saved");
    			
    			validCommand = true;
    		} catch(IOException e) {
    			displayMessage("Error whilst saving image");
    			return;
    		}
    	} 
  
    	if(validCommand == false) {
    		
    		displayMessage("Please enter a valid command");
    	}
    }	
    
    public class Shape{
    	
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

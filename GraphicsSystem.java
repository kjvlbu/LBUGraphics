package oop;

import java.awt.FlowLayout;
import java.util.Arrays;

import javax.swing.JFrame;
import uk.ac.leedsbeckett.oop.LBUGraphics;


public class GraphicsSystem extends LBUGraphics {

	public void processCommand(String input) {
		
	}
	

	public void square(int length) {
			
			for(int i=0;i<4;i++) {
				
				penDown();
				forward(length);
				turnLeft(90);
				penUp();
			}
			turnRight(90);
			forward(40);
			turnLeft(90);
	}
}

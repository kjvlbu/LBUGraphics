package oop;

import java.awt.FlowLayout;
import javax.swing.JFrame;

public class MainClass{
		
		GraphicsSystem gfx = new GraphicsSystem();
		
        public static void main(String[] args) {
                
        		new MainClass();
        		new GraphicsSystem();
        }

        public MainClass() {
                
        		JFrame MainFrame = new JFrame("LBU Graphics Application");                
                MainFrame.setLayout(new FlowLayout()); 
                MainFrame.add(gfx);                                    
                MainFrame.pack();                                               
                MainFrame.setVisible(true);  
                MainFrame.setResizable(false);
                
        } 
}

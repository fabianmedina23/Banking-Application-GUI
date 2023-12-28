package guis;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;

public abstract class BaseFrame extends JFrame{
	public BaseFrame(String title) {
		intialize(title);
	}
	
	private void intialize(String title) {
		

		
	    getContentPane().setBackground(new Color(255,255,255));

		// Set jframe properties and add title
		setTitle(title);
		
		// size in pixels
		setSize(420, 600);
		
		// close program when closed
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// set layout to null to have absolute logout
		setLayout(null);
		
		// prevent gui from being resized
		setResizable(false);
		
		// launch gui in center of screen
		setLocationRelativeTo(null);
		
		// call on addGuiComponent()
		addGuiComponents();
	}
	
	protected abstract void addGuiComponents();

	
}

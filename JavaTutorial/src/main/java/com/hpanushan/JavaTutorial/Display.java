package com.hpanushan.JavaTutorial;

import java.awt.FlowLayout;		// Layout to the window
import javax.swing.JFrame;		// Main window functionalities close, minimize, maximiza
import javax.swing.JLabel;		// Text fields inside the window

public class Display extends JFrame {

	private JLabel item1,item2;
	
	public Display() {
		super("Title bar");				// The titlebar
		setLayout(new FlowLayout());	// Create a new layout
		
		item1 = new JLabel("Hellow world");
		add(item1);
		item2 = new JLabel("Anushan");
		add(item2);
	}
	
}

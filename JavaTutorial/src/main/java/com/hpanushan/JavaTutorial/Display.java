package com.hpanushan.JavaTutorial;

import java.awt.FlowLayout;		// Layout to the window
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;		// Main window functionalities close, minimize, maximiza
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import javax.swing.JLabel;		// Text fields inside the window

public class Display extends JFrame {

	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	private JPasswordField passwordField;
	
	// Constructor
	public Display() {
		super("Title bar");				// The titlebar
		setLayout(new FlowLayout());	// Create a new layout
		
		item1 = new JTextField(10);		// Text field 1
		add(item1);
		
		item2 = new JTextField("Enter text here");	// Text field 2
		add(item2);
		
		item3 = new JTextField("uneditable",20);	// Text field 3
		item3.setEditable(false);
		add(item3);
		
		passwordField = new JPasswordField("******************");	// Password field
		add(passwordField);
	}
	
}
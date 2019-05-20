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
		
		thehandler handler = new thehandler();
		item1.addActionListener(handler);
		item2.addActionListener(handler);
		item3.addActionListener(handler);
		passwordField.addActionListener(handler);
		
	}
	
	private class thehandler implements ActionListener {
		
		public void actionPerformed(ActionEvent event) {
			
			String string = "";
			
			if (event.getSource()==item1) {
				string = String.format("field 1: %s", event.getActionCommand());
			}
			else if (event.getSource()==item2) {
				string = String.format("field 2: %s", event.getActionCommand());
			}
			else if (event.getSource()==item3) {
				string = String.format("field 3: %s", event.getActionCommand());
			}
			else if (event.getSource()==passwordField) {
				string = String.format("password field: %s", event.getActionCommand());
			}
			JOptionPane.showMessageDialog(null,string);
		}
	}
}

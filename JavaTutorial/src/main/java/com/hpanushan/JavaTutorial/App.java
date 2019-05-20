package com.hpanushan.JavaTutorial;

import javax.swing.JFrame;

public class App 
{
    public static void main( String[] args )
    {
    	Display ds = new Display();
    	ds.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// How to close the window
    	ds.setSize(700,700);		// Set window size
    	ds.setVisible(true);
    }
    
}

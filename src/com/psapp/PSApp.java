/**
 * PSApp
 */
package com.psapp;

import com.psapp.gui.MainWindow;
import javafx.application.Application;

public class PSApp {
	public static void main(String[] args) {
		// all PSLib stuff on main thread
		
		Application.launch(MainWindow.class, args); // start GUI
	}
}

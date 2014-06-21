package com.psapp.gui;

import java.awt.Dimension;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;

/**
 * The main window for the PSApp GUI.
 */
public class MainWindow extends Application {
	private Scene scene;
	private Dimension dim = new Dimension(800, 600);
	
	private void initScene() {
		Group g = new Group();
		scene = new Scene(g, dim.width, dim.height);
	}
	
	public void start(Stage stage) {
		stage.setTitle("PSApp");
		initScene();
		stage.setScene(scene);
		stage.show();
	}
}

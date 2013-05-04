package de.se.tinf11b3.breakdown;

import com.vaadin.Application;
import com.vaadin.ui.*;

/**
 * Main application class.
 */
public class Breakdown extends Application {

	@Override
	public void init() {
		Window mainWindow = new Window("Breakdown");
		Canvas canvas = new Canvas();
		Label label = new Label("Hello Vaadin user");
		mainWindow.addComponent(canvas);
		// mainWindow.addComponent(label);
		setMainWindow(mainWindow);
	}

}

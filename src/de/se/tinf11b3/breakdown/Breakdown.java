package de.se.tinf11b3.breakdown;



import com.vaadin.Application;
import com.vaadin.ui.*;
import com.vaadin.ui.Window.CloseEvent;
import com.vaadin.ui.Window.CloseListener;

import de.se.tinf11b3.breakdown.server.gui.Hauptmenue;
import de.se.tinf11b3.breakdown.server.spielverwaltung.Spielverwaltung;

/**
 * Main application class.
 */
public class Breakdown extends Application {

	private Spielverwaltung spielverwaltung = new Spielverwaltung();
	private Hauptmenue hauptmenue = new Hauptmenue(spielverwaltung);

	@Override
	public void init() {
		System.out.println("Player joined");
		Window mainWindow = new Window("Breakdown");

		mainWindow.addListener(new CloseListener() {

			public void windowClose(CloseEvent e) {
				System.out.println("Closing the application");
				getMainWindow().getApplication().close();
			}
		});

		mainWindow.setContent(hauptmenue);
		setMainWindow(mainWindow);
		setTheme("breakdowntheme");
	}

}

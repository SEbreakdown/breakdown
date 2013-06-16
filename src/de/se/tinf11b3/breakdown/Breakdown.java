package de.se.tinf11b3.breakdown;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.tools.ant.types.CommandlineJava.SysProperties;

import com.vaadin.Application;
import com.vaadin.ui.*;
import com.vaadin.ui.Window.CloseEvent;
import com.vaadin.ui.Window.CloseListener;

import de.se.tinf11b3.breakdown.server.gui.Hauptmenue;
import de.se.tinf11b3.breakdown.server.highscore.Highscorehandler;
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

		try {
			File file = new File("/tmp/highscore.txt");
			if(!file.exists()) {
				BufferedWriter out = new BufferedWriter(new FileWriter("/tmp/highscore.txt"));
				out.write("500 Mitsch  " + "\n");
				out.write("400 Dennis  " + "\n");
				out.write("300 Udo  " + "\n");
				out.write("200 Olli  " + "\n");
				out.write("100 Julian  " + "\n");
				out.close();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}

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

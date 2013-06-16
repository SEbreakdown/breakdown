package de.se.tinf11b3.breakdown.server.highscore;

import java.util.ArrayList;

public class Highscorehandler {

	private HighscoreReader reader = new HighscoreReader();
	
	
	/**
	 * Fügt einen neuen Eintrag zur Highscoreliste hinzu
	 * 
	 * Nur die besten 5 werden gespeichert
	 * 
	 * 
	 * @param entry
	 */
	public void addEntry(HighscoreEntry entry){
		//TODO	Speichere TOP 5
	}
	
	
	
	/**
	 * Liefert alle Einträge zurück 
	 * @return
	 */
	public ArrayList<HighscoreEntry> getEntrylist() {
		return reader.readEntriesFromFile();
	}
	
	
}

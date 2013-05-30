package de.se.tinf11b3.breakdown;

import java.util.ArrayList;

public class Highscorehandler {

	private HighscoreReader reader = new HighscoreReader();
	private ArrayList<HighscoreEntry> entrylist = new ArrayList<HighscoreEntry>();
	

	
	
	/**
	 * Fügt einen neuen Eintrag zur Highscoreliste hinzu
	 * 
	 * Nur die besten 10 werden gespeichert
	 * 
	 * 
	 * @param entry
	 */
	public void addEntry(HighscoreEntry entry){
		//TODO	Speichere TOP 10
	}
	
	/**
	 * Liefert alle Einträge zurück 
	 * @return
	 */
	public ArrayList<HighscoreEntry> getEntrylist() {
		return entrylist;
	}
	
	
}

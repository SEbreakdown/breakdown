package de.se.tinf11b3.breakdown.server.highscore;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
	public void addEntry(HighscoreEntry entry) {

		ArrayList<HighscoreEntry> highscoreList = getEntrylist();
		ArrayList<HighscoreEntry> tmp = new ArrayList<HighscoreEntry>();
		boolean entryPlaced = false;
		
		for(int i = 0; i < highscoreList.size(); i++) {

			// Highscoreeintrag höher als bereits vorhandene?
			if(highscoreList.get(i).getScore() < entry.getScore() && !entryPlaced) {
				entryPlaced = true;
				tmp.add(entry);
			}
			else{
				tmp.add(highscoreList.get(i));
			}
		}

		if(tmp.size() > 5){
			tmp.remove(5);
		}
		
		
		writeToFile(tmp);
	}

	private void writeToFile(ArrayList<HighscoreEntry> highscoreList) {
		try {
			File file = new File(reader.getDateiname());
			BufferedWriter out = new BufferedWriter(new FileWriter(reader.getDateiname()));

			for(int i = 0; i < highscoreList.size(); i++) {
				out.write(highscoreList.get(i).getScore() + " "
						+ highscoreList.get(i).getName() + "\n");
			}
			out.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Liefert alle Einträge zurück
	 * 
	 * @return
	 */
	public ArrayList<HighscoreEntry> getEntrylist() {
		return reader.readEntriesFromFile();
	}

}

package de.se.tinf11b3.breakdown.server.highscore;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

import de.se.tinf11b3.breakdown.server.spielverwaltung.Spielverwaltung;

/**
 * Liest die vorhandenen Scores aus einer TXT Datei
 * 
 * @author michael
 * 
 */
public class HighscoreReader {

	private String dateiname = "/tmp/highscore.txt";

//	
//	public static void main(String[] args) {
//		ArrayList<HighscoreEntry> list = new HighscoreReader().readEntriesFromFile();
//		for(HighscoreEntry highscoreEntry : list) {
//			System.out.println(highscoreEntry.getName()+":"+highscoreEntry.getScore());
//		}
//		
//	}
	
	public String getDateiname() {
		return dateiname;
	}
	
	/**
	 * Liest die Einträge aus einer TXT Datei aus und gibt alle Einträge als
	 * Arraylist zurück
	 * 
	 * @return
	 */
	public ArrayList<HighscoreEntry> readEntriesFromFile() {

		ArrayList<HighscoreEntry> highscorelist = new ArrayList<HighscoreEntry>();
		ArrayList<String> zeilen = readFile();
		
		for(String zeile : zeilen) {
			String werte[] = zeile.split(" ");
			int punkte = Integer.parseInt(werte[0]);
			String name = werte[1];
			highscorelist.add(new HighscoreEntry(punkte,name));
		}
		
		return highscorelist;
	}

	/**
	 * Liest Textdatei Zeile für Zeile aus und speichert diese in eine
	 * Arraylist vom Typ String
	 * 
	 * @return
	 */
	private ArrayList<String> readFile() {
		ArrayList<String> arrayListZeileninhalt = new ArrayList<String>();
		String zeile;

		//Wenn Datei nicht existiert Template erstellen
		try {
			File file = new File(dateiname);
			if(!file.exists()) {
				BufferedWriter out = new BufferedWriter(new FileWriter(dateiname));
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
		
		
		try {
			FileInputStream fis = new FileInputStream(dateiname);
			Reader filereader = new InputStreamReader(fis, "UTF-8");

			BufferedReader reader = new BufferedReader(filereader);
			zeile = null;
			arrayListZeileninhalt = new ArrayList<String>();
			while((zeile = reader.readLine()) != null) {
				arrayListZeileninhalt.add(zeile);
			}
			reader.close();
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}

		return arrayListZeileninhalt;
	}

}

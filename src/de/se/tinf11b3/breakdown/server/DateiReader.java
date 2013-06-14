package de.se.tinf11b3.breakdown.server;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

/**
 * Liest W�rter aus einer Textdatei aus und speichert diese in einer Arrayliste
 * 
 * @author Mitsch
 * 
 */
public class DateiReader {

	protected ArrayList<String> zeilenArray;
	protected String dateiname="";
	
	
	//private DateiReader highscore = new DateiReader("/Highscore.txt");
	//String[] zeilen = highscore.getZeilenAlsArray();
	// oder
	// ArrayList<String> zeilen =  highscore.getZeilenListe();

	public DateiReader(String dateiname) {
		this.dateiname=dateiname;
		this.leseZeileAusDatei();
	}

	public void openFile(File pLexicon) {
		try {
			FileReader filereader = new FileReader(pLexicon);
			zeilenArray = new ArrayList<String>();

			BufferedReader reader = new BufferedReader(filereader);

			String zeile = null;

			while((zeile = reader.readLine()) != null) {
				zeilenArray.add(zeile);
			}

			reader.close();
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}

	private void leseZeileAusDatei() {
		try {
			InputStream stream = this.getClass().getResourceAsStream(dateiname);
			Reader filereader = new InputStreamReader(stream, "ISO-8859-1");

			zeilenArray = new ArrayList<String>();

			BufferedReader reader = new BufferedReader(filereader);

			String zeile = null;

			while((zeile = reader.readLine()) != null) {
				zeilenArray.add(zeile);
			}

			reader.close();
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}

	public String[] getZeilenAlsArray() {

		String[] temp = new String[zeilenArray.size()];
		zeilenArray.toArray(temp);
		return temp;
	}
	
	
	public ArrayList<String> getZeilenListe(){
		return this.zeilenArray;
	}
	
}


package de.se.tinf11b3.breakdown.server.spielverwaltung;

import de.se.tinf11b3.breakdown.server.highscore.Highscorehandler;

public class Spielverwaltung {
	
	private Highscorehandler highscorehandler = new Highscorehandler();
	private int anzLeben = 3;
	
	
	public Spielverwaltung() {
	}
	
	
	/**
	 * Erniedrigt die Anzahl der Leben um 1
	 * 
	 * Liefert True, falls das Spiel zu Ende
	 * @return
	 */
	public boolean erniedrigeLeben() {
		
		anzLeben--;
		
		if(anzLeben <= 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	
	
	
	public int getAnzLeben() {
		return anzLeben;
	}
	
}

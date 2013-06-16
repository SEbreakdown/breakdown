package de.se.tinf11b3.breakdown.server.spielverwaltung;

import com.vaadin.ui.Window;

import de.se.tinf11b3.breakdown.server.gui.GameOver;
import de.se.tinf11b3.breakdown.server.gui.Hauptmenue;
import de.se.tinf11b3.breakdown.server.highscore.Highscorehandler;

public class Spielverwaltung {
	
	private Highscorehandler highscorehandler = new Highscorehandler();
	private int anzLeben = 3;
	private Window mainWindow;
	private Hauptmenue hauptmenue;
	private int highscore;
	private Schwierigkeitsgrad schwierigkeitsgrad = Schwierigkeitsgrad.LEICHT;
	
	
	public enum Schwierigkeitsgrad{
		LEICHT, MITTEL, SCHWER
	}
	
	
	
	public Spielverwaltung(Window mainWindow) {
		this.mainWindow = mainWindow;
	}
	
	public void connectHauptmenue(Hauptmenue hauptmenue) {
		this.hauptmenue = hauptmenue;
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
			mainWindow.setContent(new GameOver(this,1000));
			return true;
		}
		else{
			return false;
		}
	}
	
	
	
	public void resetGame(Schwierigkeitsgrad schwierigkeitsgrad){
		anzLeben = 3;
		hauptmenue.getSchwierigkeitsgrad().getSpielfenster().getCanvas_1().neuesSpiel();
	}
	
	
	public Schwierigkeitsgrad getSchwierigkeitsgrad() {
		return schwierigkeitsgrad;
	}
	
	public void setSchwierigkeitsgrad(Schwierigkeitsgrad schwierigkeitsgrad) {
		this.schwierigkeitsgrad = schwierigkeitsgrad;
	}
	
	public void showHighscoreWindow() {
		hauptmenue.getHighscore().refreshScore();
		mainWindow.setContent(hauptmenue.getHighscore());
	}
	
	public Highscorehandler getHighscorehandler() {
		return highscorehandler;
	}
	
	public int getAnzLeben() {
		return anzLeben;
	}
	
}

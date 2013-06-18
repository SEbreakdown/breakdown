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
	private int highscore = 0;
	private Schwierigkeitsgrad schwierigkeitsgrad = Schwierigkeitsgrad.LEICHT;
	private Integer zeit = 0;
	
	public void setHighscore(int highscore) {
		this.highscore = highscore;
	}
	
	public Integer getZeit() {
		return zeit;
	}
	
	public void setZeit(Integer zeit) {
		this.zeit = zeit;
	}
	
	public enum Schwierigkeitsgrad {
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
	 * 
	 * @return
	 */
	public boolean erniedrigeLeben() {

		anzLeben--;

		hauptmenue.getSchwierigkeitsgrad().getSpielfenster().setLeben(anzLeben);
		
		if(anzLeben <= 0) {
			gameOver();
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public void gameOver() {
		if(anzLeben != 0){
			if(zeit == 0) zeit++;
			Integer score = 500000 / zeit;
			erhoeheHighscoreUm(score);
		}
		mainWindow.setContent(new GameOver(this, highscore));
	}
	
	
	public Window getMainWindow() {
		return mainWindow;
	}
	public int getHighscore() {
		return highscore;
	}

	public void showHighscore() {
		hauptmenue.getSchwierigkeitsgrad().getSpielfenster().refreshHighscore(highscore);
	}

	public void erhoeheHighscoreUm(int wert) {
		highscore += wert;
		showHighscore();
	}

	public void resetGame(Schwierigkeitsgrad schwierigkeitsgrad) {
		anzLeben = 3;
		highscore = 0;
		showHighscore();
		hauptmenue.getSchwierigkeitsgrad().getSpielfenster().getCanvas_1().neuesSpiel();
		hauptmenue.getSchwierigkeitsgrad().getSpielfenster().refreshHighscore(highscore);
		hauptmenue.getSchwierigkeitsgrad().getSpielfenster().setLeben(anzLeben);
		
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

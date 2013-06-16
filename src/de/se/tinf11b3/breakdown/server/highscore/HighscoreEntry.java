package de.se.tinf11b3.breakdown.server.highscore;

public class HighscoreEntry {

	private int score = 0;
	private String name = "";
	
	
	
	
	public HighscoreEntry(int score, String name) {
		this.score = score;
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}

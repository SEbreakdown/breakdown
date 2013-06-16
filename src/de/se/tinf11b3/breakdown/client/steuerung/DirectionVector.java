package de.se.tinf11b3.breakdown.client.steuerung;


import de.se.tinf11b3.breakdown.client.collision.Kollisionsseite;

public class DirectionVector {

	private int x_direction;
	private int y_direction;
	private Kollisionsseite seite;
	
	
	
	public DirectionVector(int x_direction, int y_direction, Kollisionsseite seite) {
		this.x_direction = x_direction;
		this.y_direction = y_direction;
		this.seite = seite;
	}
	
	public int getX_direction() {
		return x_direction;
	}
	
	public int getY_direction() {
		return y_direction;
	}
	
	public Kollisionsseite getSeite() {
		return seite;
	}
	
}

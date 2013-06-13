package de.se.tinf11b3.breakdown.client.steuerung;

public class DirectionVector {

	private int x_direction;
	private int y_direction;
	
	
	public DirectionVector(int x_direction, int y_direction) {
		this.x_direction = x_direction;
		this.y_direction = y_direction;
	}
	
	public int getX_direction() {
		return x_direction;
	}
	
	public int getY_direction() {
		return y_direction;
	}
}

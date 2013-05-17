package de.se.tinf11b3.breakdown.client.gameobjects;

import gwt.g2d.client.graphics.Color;

public class Ball extends Gameobject {

	private int radius;

	/**
	 * Init with Values
	 * 
	 * @param x
	 * @param y
	 * @param color
	 * @param radius
	 */
	public Ball(int x, int y, Color color, int radius) {
		super(x, y, color);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}

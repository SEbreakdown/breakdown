package de.se.tinf11b3.breakdown.client.gameobjects;

import java.awt.Rectangle;

import gwt.g2d.client.graphics.Color;
import gwt.g2d.client.graphics.Surface;

public class Block extends Gameobject {

	private Rectangle size;

	/**
	 * Init with given Values
	 * 
	 * @param x
	 * @param y
	 * @param color
	 * @param size
	 */
	public Block(int x, int y, Color color, Rectangle size) {
		super(x, y, color);
		this.size = size;
	}

	public Rectangle getSize() {
		return size;
	}

	public void setSize(Rectangle size) {
		this.size = size;
	}

	@Override
	public void drawObject(Surface surface) {
		// TODO Auto-generated method stub
		
	}

}

package de.se.tinf11b3.breakdown.client.gameobjects;

import gwt.g2d.client.graphics.Color;
import gwt.g2d.client.graphics.KnownColor;
import gwt.g2d.client.graphics.Surface;
import gwt.g2d.client.graphics.shapes.Shape;
import gwt.g2d.client.graphics.shapes.ShapeBuilder;
import gwt.g2d.client.math.Vector2;

public class Block extends Gameobject {

	private Vector2 size;
	private int hitcount = 0;
	private boolean collided = false;
	
	
	/**
	 * Init with given Values
	 * 
	 * @param x
	 * @param y
	 * @param color
	 * @param size
	 */
	public Block(int x, int y, Color color, Vector2 size, int hitcount) {
		super(x, y, color);
		setHitcount(hitcount);
		this.size = size;
	}

	public Vector2 getSize() {
		return size;
	}

	public void setSize(Vector2 size) {
		this.size = size;
	}

	@Override
	public void drawObject(Surface surface) {
		// Block zeichnen
		ShapeBuilder sb = new ShapeBuilder();
		sb.drawRect(x, y, size.getX(), size.getY());
		Shape shape = sb.build();
		surface.setFillStyle(color);
		surface.fillShape(shape);
	}

	public int getHitcount() {
		return hitcount;
	}

	public void setHitcount(int hitcount) {

		switch(hitcount) {
			case 0:
				this.color = KnownColor.RED;
				break;
			case 1:
				this.color = KnownColor.GREEN;
				break;
			case 2:
				this.color = KnownColor.YELLOW;
				break;
			case 3:
				this.color = KnownColor.DARK_VIOLET;
				break;
				
			default:
				this.color = KnownColor.BROWN;
				break;
		}

		this.hitcount = hitcount;
	}

	
	public boolean isCollided() {
		return collided;
	}
	
	public void setCollided(boolean collided) {
		this.collided = collided;
	}
}

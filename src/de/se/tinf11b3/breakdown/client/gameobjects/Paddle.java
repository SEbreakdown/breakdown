package de.se.tinf11b3.breakdown.client.gameobjects;

import de.se.tinf11b3.breakdown.client.ui.VCanvas;
import gwt.g2d.client.graphics.Color;
import gwt.g2d.client.graphics.KnownColor;
import gwt.g2d.client.graphics.Surface;
import gwt.g2d.client.graphics.shapes.Shape;
import gwt.g2d.client.graphics.shapes.ShapeBuilder;
import gwt.g2d.client.math.Rectangle;
import gwt.g2d.client.math.Vector2;


public class Paddle extends Gameobject {

	private int size;
	

	/**
	 * Init with Values
	 * 
	 * @param x
	 * @param y
	 * @param size
	 */
	public Paddle(int x, int y, Color color, int size, Surface surface) {
		super(x, y, color, surface);
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	

	/**
	 * Remove old Paddle
	 * @param surface
	 */
	private void cleanCanvas() {
		//Altes Paddle loeschen
		surface.setFillStyle(VCanvas.BACKGROUNDCOLOR);
		surface.setLineWidth(10);
		surface.fillShape(new ShapeBuilder().drawRect(new Rectangle(0, 450, 500, 100)).build());		
	}

	
	@Override
	public void drawObject() {
	
		//Remove old Graphics
		cleanCanvas();
		
		// Paddle zeichnen
		ShapeBuilder sb = new ShapeBuilder();
			sb.drawLineSegment(new Vector2(x - (size/2), y), new Vector2(x + (size/2), y));
		Shape shape = sb.build();
		surface.setStrokeStyle(color);
		surface.strokeShape(shape);
		
		
	}
	

	
	
	
	
}

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

	private Rectangle size;

	/**
	 * Init with Values
	 * 
	 * @param x
	 * @param y
	 * @param size
	 */
	public Paddle(int x, int y, Color color, Rectangle size) {
		super(x, y, color);
		this.size = size;
	}

	public Rectangle getSize() {
		return size;
	}
	
	@Override
	public void drawObject(Surface surface) {
		 
		//Altes Paddle loeschen
		surface.setFillStyle(VCanvas.BACKGROUNDCOLOR);
		surface.setLineWidth(10);
		surface.fillShape(new ShapeBuilder().drawRect(new Rectangle(0, 460, 500, 100)).build());
		
		// Shape zeichnen
		ShapeBuilder sb = new ShapeBuilder();
			sb.drawLineSegment(new Vector2(x - 50, 480), new Vector2(x + 50, 480));
		Shape shape = sb.build();
		surface.setStrokeStyle(KnownColor.BLACK);
		surface.strokeShape(shape);
		
	}
	

}

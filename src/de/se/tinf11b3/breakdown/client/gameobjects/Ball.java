package de.se.tinf11b3.breakdown.client.gameobjects;

import de.se.tinf11b3.breakdown.client.ui.VCanvas;
import gwt.g2d.client.graphics.Color;
import gwt.g2d.client.graphics.DirectShapeRenderer;
import gwt.g2d.client.graphics.KnownColor;
import gwt.g2d.client.graphics.Surface;
import gwt.g2d.client.graphics.shapes.Shape;
import gwt.g2d.client.graphics.shapes.ShapeBuilder;
import gwt.g2d.client.math.Rectangle;
import gwt.g2d.client.math.Vector2;

public class Ball extends Gameobject {

	private int radius;
	private DirectShapeRenderer shapeRenderer;

	
	private int oldX, oldY;
	
	/**
	 * Init with Values
	 * 
	 * @param x
	 * @param y
	 * @param color
	 * @param radius
	 */
	public Ball(int x, int y, Color color, int radius, Surface surface) {
		super(x, y, color, surface);
		this.radius = radius;
		oldX = x;
		oldY = y;
	}

	
	@Override
	public void setPosition(int x, int y) {
		oldX = this.x;
		oldY = this.y;
		super.setPosition(x, y);
	}
	
	@Override
	public void setX(int x) {
		oldX = this.x;
		super.setX(x);
	}
	
	@Override
	public void setY(int y) {
		oldY = this.y;	
		super.setY(y);
	}
	
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	/**
	 * Remove old Ball
	 * @param surface
	 */
	public void cleanCanvas() {
		//Remove old Ball
//		surface.setFillStyle(VCanvas.BACKGROUNDCOLOR);
//		surface.setStrokeStyle(VCanvas.BACKGROUNDCOLOR);
		
		
		surface.setFillStyle(KnownColor.CORNFLOWER_BLUE).fillShape(new ShapeBuilder().drawCircle(oldX, oldY, radius+10).build());
		

		
		ShapeBuilder sb = new ShapeBuilder();
		sb.drawCircle(new Vector2(oldX, oldY), radius+5);
		Shape shape = sb.build();
		surface.fillShape(shape);		
		
	}
	
	@Override
	public void drawObject() {

		cleanCanvas();
		
		shapeRenderer = new DirectShapeRenderer(surface);

		// Kugel
		surface.setFillStyle(color);
		shapeRenderer.drawCircle(new Vector2(x, y), radius).fill();

	}

}

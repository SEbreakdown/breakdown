package de.se.tinf11b3.breakdown.client.steuerung;

import com.google.gwt.event.dom.client.MouseDownEvent;
import com.google.gwt.event.dom.client.MouseDownHandler;
import com.google.gwt.event.dom.client.MouseMoveEvent;
import com.google.gwt.event.dom.client.MouseMoveHandler;
import com.google.gwt.event.dom.client.MouseUpEvent;
import com.google.gwt.event.dom.client.MouseUpHandler;
import com.google.gwt.user.client.Random;

import de.se.tinf11b3.breakdown.client.gameobjects.Ball;
import de.se.tinf11b3.breakdown.client.gameobjects.Block;
import de.se.tinf11b3.breakdown.client.gameobjects.Paddle;
import de.se.tinf11b3.breakdown.client.ui.VCanvas;
import gwt.g2d.client.graphics.Color;
import gwt.g2d.client.graphics.DirectShapeRenderer;
import gwt.g2d.client.graphics.KnownColor;
import gwt.g2d.client.graphics.Surface;
import gwt.g2d.client.graphics.shapes.Shape;
import gwt.g2d.client.graphics.shapes.ShapeBuilder;
import gwt.g2d.client.math.Rectangle;
import gwt.g2d.client.math.Vector2;
import gwt.g2d.client.util.FpsTimer;

public class Spielsteuerung {

	private Surface surface;
	// private ShapeBuilder sb = new ShapeBuilder();

	private boolean gameStarted = false;
	private Paddle paddle;
	private Ball ball;
	boolean hoch=true;
	// private Particle p = new Particle(
	// new Vector2(Random.nextInt(VCanvas.WIDTH),
	// Random.nextInt(VCanvas.HEIGHT)),
	// new Vector2(Math.random(), Math.random()).normalize(),
	// new Color(Random.nextInt(256),
	// Random.nextInt(256),
	// Random.nextInt(256),
	// 1.0));

	public Spielsteuerung(final Surface surface) {
		this.surface = surface;

		surface.fillBackground(VCanvas.BACKGROUNDCOLOR);

		// Init Paddle
		paddle = new Paddle(250, 480, KnownColor.BLACK, 100, surface);
		paddle.drawObject();

		// Init Ball
		ball = new Ball(250, 465, KnownColor.GREEN, 10, surface);
		ball.drawObject();

		// Init Level
		initLevel(surface);

		// Move Paddle along the Canvas
		surface.addMouseMoveHandler(new MouseMoveHandler() {
			public void onMouseMove(MouseMoveEvent event) {
				int mouseX = event.getX();

				// Innerhalb des Canvas
				if(event.getX() <= 450 && event.getX() >= 50) {
					paddle.setX(mouseX);
					paddle.drawObject();

					if(gameStarted == false) {
						ball.setX(mouseX);
						ball.drawObject();
					}
				}

			}
		});

		surface.addMouseUpHandler(new MouseUpHandler() {
			public void onMouseUp(MouseUpEvent event) {
			}
		});

		surface.addMouseDownHandler(new MouseDownHandler() {
			public void onMouseDown(MouseDownEvent event) {

				gameStarted = true;
				
				FpsTimer timer = new FpsTimer(25) {
					@Override
					public void update() {
						
						
						if(ball.getY() <= 15){
							hoch = false;
						}
						if(ball.getY() >= 475){
							hoch = true;
						}
						
						if(hoch){
							ball.setY(ball.getY()-5);
							ball.drawObject();
						}
						else{
							ball.cleanCanvas();
							ball.setY(ball.getY()+5);
							ball.drawObject();
						}
					}
				};

				timer.start();

			}
		});

	}

	/**
	 * Inits Level 1 with the Blogs
	 * 
	 * @param surface
	 */
	private void initLevel(Surface surface) {

		Block bloecke[] = new Block[15];

		int x = 30;
		int y = 10;

		for(int i = 0; i < 15; i++) {
			bloecke[i] = new Block(x, y, KnownColor.RED, new Vector2(80, 30), surface);
			bloecke[i].drawObject();
			x += 90;
			if((i + 1) % 5 == 0) {
				y += 50;
				x = 30;
			}
		}
	}

	// public void update() {
	// Vector2 pos = p.getPosition();
	// Vector2 vel = p.getVelocity();
	// if (pos.getX() < 0) {
	// vel.setX(Math.abs(vel.getX()));
	// } else if (pos.getX() >= VCanvas.WIDTH) {
	// vel.setX(-Math.abs(vel.getX()));
	// }
	// if (pos.getY() < 0) {
	// vel.setY(Math.abs(vel.getY()));
	// } else if (pos.getY() >= VCanvas.HEIGHT) {
	// vel.setY(-Math.abs(vel.getY()));
	// }
	// pos.mutableAdd(p.getVelocity());
	//
	// draw();
	//
	//
	// //DRAW PADDLE
	// surface.setFillStyle(KnownColor.CORNFLOWER_BLUE);
	// surface.fillShape(new ShapeBuilder().drawRect(new Rectangle(0, 460, 500,
	// 100)).build());
	//
	// // Let the show begin!
	// ShapeBuilder sb = new ShapeBuilder();
	// sb.drawLineSegment(new Vector2(this.mouseX - 50, 480), new
	// Vector2(this.mouseX + 50, 480));
	// Shape shape = sb.build();
	// surface.setStrokeStyle(KnownColor.BLACK);
	// surface.strokeShape(shape);
	//
	//
	//
	//
	// }

	/**
	 * Draws the particles.
	 */
	// private void draw() {
	// surface.clear().fillBackground(KnownColor.CORNFLOWER_BLUE);
	// surface.save()
	// .setFillStyle(p.getColor());
	// shapeRenderer.beginPath()
	// .moveTo(p.getPosition())
	// .drawCircle(p.getPosition(), 10)
	// .closePath()
	// .fill();
	// surface.restore();
	// }

	/**
	 * Simple particle class.
	 * 
	 * @author hao1300@gmail.com
	 */
	// private static class Particle {
	// private final Vector2 position, velocity;
	// private final Color color;
	//
	// public Particle(Vector2 position, Vector2 velocity, Color color) {
	// this.position = position;
	// this.velocity = velocity;
	// this.color = color;
	// }
	//
	// public final Color getColor() {
	// return color;
	// }
	//
	// public final Vector2 getPosition() {
	// return position;
	// }
	//
	// public final Vector2 getVelocity() {
	// return velocity;
	// }
	//
	// }

}

package de.se.tinf11b3.breakdown.client.steuerung;

import java.util.ArrayList;

import com.google.gwt.event.dom.client.MouseDownEvent;
import com.google.gwt.event.dom.client.MouseMoveEvent;
import com.google.gwt.event.dom.client.MouseUpEvent;

import de.se.tinf11b3.breakdown.client.collision.Blockkollision;
import de.se.tinf11b3.breakdown.client.collision.CollisionResult;
import de.se.tinf11b3.breakdown.client.collision.Kollisionserkennung;
import de.se.tinf11b3.breakdown.client.gameobjects.Ball;
import de.se.tinf11b3.breakdown.client.gameobjects.Block;
import de.se.tinf11b3.breakdown.client.gameobjects.Paddle;
import de.se.tinf11b3.breakdown.client.ui.Widget_GUI_Interface;
import gwt.g2d.client.graphics.KnownColor;
import gwt.g2d.client.math.Circle;
import gwt.g2d.client.math.Rectangle;
import gwt.g2d.client.math.Vector2;
import gwt.g2d.client.util.FpsTimer;
import de.se.tinf11b3.breakdown.client.vector.*;

public class Spielsteuerung implements ISteuerung {

	private boolean gameStarted = false;
	private Paddle paddle;
	private Ball ball;
	private ArrayList<Block> bloecke = new ArrayList<Block>();
	private int x_direction =  5, y_direction = -5;
	private Widget_GUI_Interface app;

	public Spielsteuerung(final Widget_GUI_Interface app) {
		this.app = app;

		// Init Paddle
		paddle = new Paddle(250, 480, KnownColor.BLACK, 100);

		// Init Ball
		ball = new Ball(250, 465, KnownColor.GREEN, 10);

		// Init Blocks
		initLevel();

		// Draw them all
		app.drawAllGameObjects(ball, paddle, bloecke);

	}

	/**
	 * Überprüft nach jeder neuen Ballposition, ob eine Kollision mit -dem Rand
	 * -dem Paddle -einem Block stattgefunden hat
	 */
	private void checkCollision() {
		
		//RandKollision
		DirectionVector direction = Kollisionserkennung.checkFrameCollision(ball, x_direction, y_direction, app);
		x_direction = direction.getX_direction();
		y_direction = direction.getY_direction();
		
		//Paddle Kollission
		direction = Kollisionserkennung.checkPaddleCollision(paddle, ball, bloecke, x_direction, y_direction, app);
		x_direction = direction.getX_direction();
		y_direction = direction.getY_direction();
		
		//Kollision mit Blöcken
		Blockkollision blockKoll = Kollisionserkennung.checkBlockCollision(bloecke, ball, x_direction, y_direction, app);
		if(blockKoll.isCollided()){
			bloecke = blockKoll.getBloecke();
			x_direction = blockKoll.getDirection().getX_direction();
			y_direction = blockKoll.getDirection().getY_direction();
		}
		
	}


	/**
	 * Inits Level 1 with the Blogs
	 * 
	 * @param surface
	 */
	private void initLevel() {

		int x = 30;
		int y = 10;

		for(int i = 0; i < 15; i++) {
			bloecke.add(new Block(x, y, KnownColor.RED, new Vector2(80, 30), 3));
			x += 90;
			if((i + 1) % 5 == 0) {
				y += 50;
				x = 30;
			}
		}
	}

	public void mouseMoved(MouseMoveEvent event) {
		int mouseX = event.getX();

		// Innerhalb des Canvas
		if(event.getX() <= 450 && event.getX() >= 50) {
			paddle.setX(mouseX);

			if(gameStarted == false) {
				ball.setX(mouseX);
			}
			app.drawAllGameObjects(ball, paddle, bloecke);
		}
	}

	public void mouseUp(MouseUpEvent event) {
	}

	public void mouseDown(MouseDownEvent event) {
		app.pushToServer("Hello, this is Client :P");

		if(gameStarted == false) {

			gameStarted = true;
			
			//FPS=60
			FpsTimer timer = new FpsTimer(60) {
				@Override
				public void update() {

					checkCollision();

					ball.setY(ball.getY() + y_direction);
					ball.setX(ball.getX() + x_direction);

					app.drawAllGameObjects(ball, paddle, bloecke);
				}

			};

			timer.start();
		}
	}

	public void requestRepaintGameObjects() {
		app.drawAllGameObjects(ball, paddle, bloecke);
	}

}

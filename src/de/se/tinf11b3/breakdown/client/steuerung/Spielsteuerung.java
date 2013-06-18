package de.se.tinf11b3.breakdown.client.steuerung;

import java.util.ArrayList;

import com.google.gwt.event.dom.client.MouseDownEvent;
import com.google.gwt.event.dom.client.MouseMoveEvent;
import com.google.gwt.event.dom.client.MouseUpEvent;

import de.se.tinf11b3.breakdown.client.collision.Blockkollision;
import de.se.tinf11b3.breakdown.client.collision.Kollisionserkennung;
import de.se.tinf11b3.breakdown.client.collision.Kollisionsseite;
import de.se.tinf11b3.breakdown.client.gameobjects.Ball;
import de.se.tinf11b3.breakdown.client.gameobjects.Block;
import de.se.tinf11b3.breakdown.client.gameobjects.Paddle;
import de.se.tinf11b3.breakdown.client.ui.Widget_GUI_Interface;
import gwt.g2d.client.graphics.KnownColor;
import gwt.g2d.client.math.Vector2;
import gwt.g2d.client.util.FpsTimer;

public class Spielsteuerung implements ISteuerung {

	private boolean gameStarted = false;
	private Paddle paddle;
	private Ball ball;
	private ArrayList<Block> bloecke = new ArrayList<Block>();
	private int x_direction =  5, y_direction = -5;
	private Widget_GUI_Interface app;
	private FpsTimer timer;
	
	private boolean gameOver = false;
	private int level = 1;
	private int time[] = new int[5];
	
	
	
	public Spielsteuerung(final Widget_GUI_Interface app) {
		this.app = app;

		// Init Paddle
		paddle = new Paddle(250, 480, KnownColor.BLACK, 100);

		// Init Ball
		ball = new Ball(250, 465, KnownColor.GREEN, 10);

		// Init Blocks
		initLevel_1();

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
			
			Kollisionsseite seite = blockKoll.getDirection().getSeite();
			
			//Ball ein wenig wegstupsen, damit er nicht öfter runterzaehl, als der Ball eigentlich getroffen hat
			switch(seite) {
				case OBEN:
					ball.setPosition(ball.getX(), ball.getY() - 3);
					break;
				case UNTEN:
					ball.setPosition(ball.getX(), ball.getY() + 3);
					break;
				case LINKS:
					ball.setPosition(ball.getX() - 3, ball.getY());
					break;
				case RECHTS:
					ball.setPosition(ball.getX() + 3, ball.getY());
					break;
					
				default:
					break;
			}
			
			
		}
		
	}


	/**
	 * Inits Level 1 with the Blogs
	 * 
	 * @param surface
	 */
	private void initLevel_1() {

		int x = 30;	//30
		int y = 30;	//10

		for(int i = 0; i < 15; i++) {
			bloecke.add(new Block(x, y, KnownColor.RED, new Vector2(50, 20), 3));		//x=80,y=30
			x += 90;
			if((i + 1) % 5 == 0) {
				y += 50;
				x = 30;
			}
		}
	}
	
	
	
	private void initLevel_2() {
		int x_start = 30;
		int x = x_start;	//30
		int y_start = 30;
		int y = y_start;	//10

		for(int k=0;k<5;k++){
			
			for(int i = 0; i < 5-k; i++) {
				bloecke.add(new Block(x, y, KnownColor.RED, new Vector2(50, 20), 3));		
				x += 90;
			}
			y += 50;
			x = x_start+50*(k+1);
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
		
		if(gameStarted == false && !gameOver) {

			gameStarted = true;
			
			//FPS=60
			timer = new FpsTimer(60) {
				@Override
				public void update() {

					time[0]++;
					if(time[0] == 60){
						time[1]++; 		//Nun 1. Sekunde
						time[0]=0;
//						app.pushToServer(String.valueOf(time[1]));
						app.sendTime();
					}
					
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

	
	public void resetBallToInitPosition(){
		timer.cancel();
		gameStarted = false;
		
		// Init Ball
		ball.setPosition(250, 465);
		paddle.setPosition(250, 480);
		
		requestRepaintGameObjects();
	}

	public void gameOver() {
		gameOver = true;
	}

	public void nextLevel() {
		level++;
		if(level == 2){
			initLevel_2();
		}
		else{
			timer.cancel();
			gameStarted = false;
		}
		
	}
	
	public Integer getAnzahlBloecke() {
		if(bloecke.size() == 0){
			
			level++;
			if(level == 2){
				resetBallToInitPosition();
				initLevel_2();
			}
			else{
				gameOver = true;
				resetBallToInitPosition();
			}
			
		}
		return bloecke.size();
	}

	public Integer getTime() {
		return time[1];
	}
	
	
}

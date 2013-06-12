package de.se.tinf11b3.breakdown.tests.junit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import gwt.g2d.client.graphics.KnownColor;
import gwt.g2d.client.math.Circle;
import gwt.g2d.client.math.Rectangle;
import gwt.g2d.client.math.Vector2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import de.se.tinf11b3.breakdown.client.collision.CollisionResult;
import de.se.tinf11b3.breakdown.client.gameobjects.Ball;
import de.se.tinf11b3.breakdown.client.gameobjects.Block;
import de.se.tinf11b3.breakdown.client.gameobjects.Paddle;
import de.se.tinf11b3.breakdown.client.steuerung.Spielsteuerung;
import de.se.tinf11b3.breakdown.client.ui.VCanvas;
import de.se.tinf11b3.breakdown.client.vector.VectorOperations;

public class IntersectionTest {

	private static Ball ball;
	private static Paddle paddle;
	private static ArrayList<Block> bloecke = new ArrayList<Block>();
	private static int x_direction = 5, y_direction = -5;	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		// Init Paddle
		paddle = new Paddle(250, 480, KnownColor.BLACK, 100);

		// Init Ball
		ball = new Ball(250, 465, KnownColor.GREEN, 10);

		initLevel();
		
	}
	
	/**
	 * Inits Level 1 with the Blogs
	 * 
	 * @param surface
	 */
	private static void initLevel() {

		int x = 30;
		int y = 10;

		for(int i = 0; i < 15; i++) {
			bloecke.add(new Block(x, y, KnownColor.RED, new Vector2(80, 30)));
			x += 90;
			if((i + 1) % 5 == 0) {
				y += 50;
				x = 30;
			}
		}
	}
	

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	/**
	 * Überprüft, ob eine Kollision mit einem Block stattgefunden hat
	 */
	private void checkBlockCollision() {
		for(int i = 0; i < bloecke.size(); i++) {
			Block tmp = bloecke.get(i);
			Vector2 position = new Vector2(tmp.getX(), tmp.getY());
			double width = tmp.getSize().getX();
			double height = tmp.getSize().getY();

			Rectangle rec = new Rectangle(position, width, height);
			Circle circ = new Circle(ball.getX(), ball.getY(), ball.getRadius());
			boolean hit = RectangleCircleKollision(rec, circ).isCollided();

			if(hit) {
				bloecke.remove(tmp);
			}
		}

	}

	// TODO AUSLAGERN IN EIGENE STATISCHE KLASSE

	// TODO CODE UMSCHREIBEN
	Vector2 PointLineDist(Vector2 point, Vector2 linestart, Vector2 lineend) {
		Vector2 a = new Vector2(lineend.getX() - linestart.getX(), lineend.getY()
				- linestart.getY());
		Vector2 b = new Vector2(point.getX() - linestart.getX(), point.getY()
				- linestart.getY());
		double t = VectorOperations.dot(a, b)
				/ (VectorOperations.sqr_length(a));

		if(t < 0)
			t = 0;
		if(t > 1)
			t = 1;
		return VectorOperations.vec_plus_vec(linestart, VectorOperations.vec_mal_scalar(a, t));
	}

	// Gibt zurück, ob eine Kollision stattfand und wenn ja, wo, und wie lang
	// der (minimale, quadratische) Abstand zum Rechteck ist.
	private CollisionResult RectangleCircleKollision(Rectangle rect, Circle circle) {
		double x = rect.getX();
		double y = rect.getY();
		double h = rect.getHeight();
		double w = rect.getWidth();

		Vector2 p1 = new Vector2(x, y);
		Vector2 p2 = new Vector2(x + w, y);
		Vector2 p3 = new Vector2(x + w, y + h);
		Vector2 p4 = new Vector2(x, y + h);

		double minDistSq = 80000;
		Vector2 basePoint = new Vector2(0, 0);

		// Seiten durchgehen, Schleife kann (bzw muss, je nachdem wie Rect
		// aussieht) entrollt werden
		Vector2 base = PointLineDist(circle.getCenter(), p1, p2);
		if(VectorOperations.sqr_length(VectorOperations.vec_minus_vec(circle.getCenter(), base)) < minDistSq) {
			// Kürzerer Abstand, neu zuweisen.
			minDistSq = VectorOperations.sqr_length(VectorOperations.vec_minus_vec(circle.getCenter(), base));
			basePoint = base;
		}

		base = PointLineDist(circle.getCenter(), p2, p3);
		if(VectorOperations.sqr_length(VectorOperations.vec_minus_vec(circle.getCenter(), base)) < minDistSq) {
			// Kürzerer Abstand, neu zuweisen.
			minDistSq = VectorOperations.sqr_length(VectorOperations.vec_minus_vec(circle.getCenter(), base));
			basePoint = base;
		}

		base = PointLineDist(circle.getCenter(), p3, p4);
		if(VectorOperations.sqr_length(VectorOperations.vec_minus_vec(circle.getCenter(), base)) < minDistSq) {
			// Kürzerer Abstand, neu zuweisen.
			minDistSq = VectorOperations.sqr_length(VectorOperations.vec_minus_vec(circle.getCenter(), base));
			basePoint = base;
		}
		base = PointLineDist(circle.getCenter(), p4, p1);
		if(VectorOperations.sqr_length(VectorOperations.vec_minus_vec(circle.getCenter(), base)) < minDistSq) {
			// Kürzerer Abstand, neu zuweisen.
			minDistSq = VectorOperations.sqr_length(VectorOperations.vec_minus_vec(circle.getCenter(), base));
			basePoint = base;
		}

		CollisionResult result = new CollisionResult(minDistSq < circle.getRadius()
				* circle.getRadius(), basePoint, minDistSq);

		return result;
	}

	private void checkPaddleCollision() {

		Vector2 position = new Vector2(paddle.getX() - paddle.getSize() / 2, paddle.getY());
		double width = paddle.getSize();
		double height = 10;

		Rectangle rec = new Rectangle(position, width, height);
		Circle circ = new Circle(ball.getX(), ball.getY(), ball.getRadius());
		boolean hit = RectangleCircleKollision(rec, circ).isCollided();

	}

	private void checkFrameCollision() {
		// Check Y-Rand Collision
		if((ball.getY() <= 15) || (ball.getY() >= 475)) {
			y_direction *= -1;
		}

		// Check X-Rand Collision
		if((ball.getX() <= 0) || (ball.getX() >= 495)) {
			x_direction *= -1;
		}
	}
	
	
	
	
	@Test
	public void intersectionTest() {
			
		
		ball.setPosition(0, 0);
		
		
		
		
		
		checkFrameCollision();
		
		
		fail("Not yet implemented");
	}

}

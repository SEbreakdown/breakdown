package de.se.tinf11b3.breakdown.client.collision;

import java.util.ArrayList;

import de.se.tinf11b3.breakdown.client.gameobjects.Block;
import de.se.tinf11b3.breakdown.client.steuerung.DirectionVector;

public class Blockkollision {

	private DirectionVector direction;
	private ArrayList<Block> bloecke;
	private boolean collided = false;
	
	public Blockkollision(DirectionVector direction, ArrayList<Block> bloecke, boolean collided) {
		this.direction = direction;
		this.bloecke = bloecke;
		this.collided = collided;
	}

	public DirectionVector getDirection() {
		return direction;
	}

	public ArrayList<Block> getBloecke() {
		return bloecke;
	}

	
	public boolean isCollided() {
		return collided;
	}
	
}

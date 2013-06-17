package de.se.tinf11b3.breakdown.client.ui;

import java.util.ArrayList;

import de.se.tinf11b3.breakdown.client.gameobjects.Ball;
import de.se.tinf11b3.breakdown.client.gameobjects.Block;
import de.se.tinf11b3.breakdown.client.gameobjects.Paddle;

public interface Widget_GUI_Interface {

	public void drawAllGameObjects(Ball ball, Paddle paddle, ArrayList<Block> bloecke);

	public void drawBlocks(ArrayList<Block> bloecke);

	public void drawBlock(Block block);

	public void drawBall(Ball ball);

	public void drawPaddle(Paddle paddle);

	public void pushToServer(String message);
	
	public void erniedrigeLeben();
	
	public void blockGetroffen();
	
	public void gameOver();
	

}

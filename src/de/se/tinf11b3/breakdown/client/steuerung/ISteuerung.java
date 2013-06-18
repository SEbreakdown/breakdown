package de.se.tinf11b3.breakdown.client.steuerung;

import com.google.gwt.event.dom.client.MouseDownEvent;
import com.google.gwt.event.dom.client.MouseMoveEvent;
import com.google.gwt.event.dom.client.MouseUpEvent;

public interface ISteuerung {

	public void mouseMoved(MouseMoveEvent event);

	public void mouseUp(MouseUpEvent event);

	public void mouseDown(MouseDownEvent event);

	public void requestRepaintGameObjects();

	public void nextLevel();
	
	public void resetBallToInitPosition();
	
	public void gameOver();
	
	public Integer getAnzahlBloecke();
	
	public Integer getTime();
	
	public void setSchwierigkeitsgrad(Integer value);
	
}
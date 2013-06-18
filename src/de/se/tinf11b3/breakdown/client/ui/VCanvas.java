/*
 * Copyright 2010 IT Mill Ltd.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package de.se.tinf11b3.breakdown.client.ui;

import java.util.ArrayList;

import gwt.g2d.client.graphics.Color;
import gwt.g2d.client.graphics.KnownColor;
import gwt.g2d.client.graphics.Surface;

import com.google.gwt.event.dom.client.BlurEvent;
import com.google.gwt.event.dom.client.BlurHandler;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.MouseDownEvent;
import com.google.gwt.event.dom.client.MouseDownHandler;
import com.google.gwt.event.dom.client.MouseMoveEvent;
import com.google.gwt.event.dom.client.MouseMoveHandler;
import com.google.gwt.event.dom.client.MouseUpEvent;
import com.google.gwt.event.dom.client.MouseUpHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.vaadin.terminal.gwt.client.ApplicationConnection;
import com.vaadin.terminal.gwt.client.Paintable;
import com.vaadin.terminal.gwt.client.UIDL;
import com.vaadin.terminal.gwt.client.ui.Field;

import de.se.tinf11b3.breakdown.client.gameobjects.Ball;
import de.se.tinf11b3.breakdown.client.gameobjects.Block;
import de.se.tinf11b3.breakdown.client.gameobjects.Paddle;
import de.se.tinf11b3.breakdown.client.steuerung.ISteuerung;
import de.se.tinf11b3.breakdown.client.steuerung.Spielsteuerung;
import de.se.tinf11b3.breakdown.server.gui.GameOver;

/**
 * Clientside Part of the Widget
 * 
 * @author michael
 * 
 */
public class VCanvas extends Composite implements Paintable, Field,
		ChangeHandler, BlurHandler, Widget_GUI_Interface {

	// Options
	public static int WIDTH = 500;
	public static int HEIGHT = 500;
	public static Color BACKGROUNDCOLOR = KnownColor.CORNFLOWER_BLUE;

	/**
	 * The input node CSS classname.
	 */
	public static final String CLASSNAME = "v-canvas";

	protected String id;
	protected ApplicationConnection client;

	private final FlowPanel flowPanel = new FlowPanel();

	// Init Canvas
	private final Surface surface = new Surface(500, 500);

	// Init Steuerung
	private Spielsteuerung steuerung = new Spielsteuerung(this);

	// Interface für diese GUI
	private ISteuerung steuerungsInterface = (ISteuerung) steuerung;

	
	
	
	/**
	 * Model: View
	 * 
	 * Canvas als GUI-Element
	 */
	public VCanvas() {

		surface.fillBackground(BACKGROUNDCOLOR);
		flowPanel.add(surface);
		

		/**
		 * 
		 * MouseEventListener rufen Interface der Steuerung auf
		 * 
		 */

		surface.addMouseMoveHandler(new MouseMoveHandler() {
			public void onMouseMove(MouseMoveEvent event) {
				steuerungsInterface.mouseMoved(event);
			}
		});

		surface.addMouseUpHandler(new MouseUpHandler() {
			public void onMouseUp(MouseUpEvent event) {
				steuerungsInterface.mouseUp(event);
			}
		});

		surface.addMouseDownHandler(new MouseDownHandler() {
			public void onMouseDown(MouseDownEvent event) {
				steuerungsInterface.mouseDown(event);
			}
		});

		steuerungsInterface.requestRepaintGameObjects();

		initWidget(flowPanel);
		setStyleName(CLASSNAME);
	}

	public void drawAllGameObjects(Ball ball, Paddle paddle, ArrayList<Block> bloecke) {
		surface.clear().fillBackground(KnownColor.CORNFLOWER_BLUE);

		drawBall(ball);
		drawBlocks(bloecke);
		drawPaddle(paddle);
	}

	public void drawBlocks(ArrayList<Block> bloecke) {
		for(Block tmp : bloecke) {
			drawBlock(tmp);
		}
	}

	public void drawBlock(Block block) {
		block.drawObject(surface);
	}

	public void drawBall(Ball ball) {
		ball.drawObject(surface);
	}

	public void drawPaddle(Paddle paddle) {
		paddle.drawObject(surface);
	}

	/**
	 * Push changed Variables to the Server
	 * 
	 * @param message
	 */
	public void pushToServer(String message) {
		if(client != null)
			client.updateVariable(id, "debug", message, true);
	}
	
	
	public void erniedrigeLeben() {
		if(client != null){
			client.updateVariable(id, "leben", -1, true);
			steuerungsInterface.resetBallToInitPosition();
		}
	}
	
	
	public void blockGetroffen() {
		if(client != null){
			client.updateVariable(id, "hit_block", steuerungsInterface.getAnzahlBloecke(), true);
		}
	}
	
	
	public void gameOver() {
		if(client != null){
			client.updateVariable(id, "gameover", true, true);
		}

	}
	
	/**
	 * Get updated Variables from Server
	 */
	public void updateFromUIDL(final UIDL uidl, ApplicationConnection client) {
		if(client.updateComponent(this, uidl, true)) {
			return;
		}
		
		this.client = client;

		id = uidl.getId();
		
		boolean gameover = uidl.getBooleanAttribute("gameover");
		

		if(gameover){
			steuerungsInterface.gameOver();
		}
		
		
		
	}

	/**
	 * Method is public to let popupview force synchronization on close.
	 */
	public void synchronizeContentToServer() {
	}

	public void onBlur(BlurEvent event) {
		synchronizeContentToServer();
	}

	public void onChange(ChangeEvent event) {
	}

	public void loadNextLevel() {
		steuerungsInterface.nextLevel();
	}

}

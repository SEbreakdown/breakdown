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

package de.se.tinf11b3.breakdown.widgetset.client.ui;

import java.util.ArrayList;

import gwt.g2d.client.graphics.KnownColor;
import gwt.g2d.client.graphics.Surface;
import gwt.g2d.client.graphics.shapes.ShapeBuilder;

import com.google.gwt.event.dom.client.BlurEvent;
import com.google.gwt.event.dom.client.BlurHandler;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.MouseDownEvent;
import com.google.gwt.event.dom.client.MouseDownHandler;
import com.google.gwt.event.dom.client.MouseMoveEvent;
import com.google.gwt.event.dom.client.MouseMoveHandler;
import com.google.gwt.event.dom.client.MouseUpEvent;
import com.google.gwt.event.dom.client.MouseUpHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.vaadin.client.ApplicationConnection;
import com.vaadin.client.Paintable;
import com.vaadin.client.UIDL;
import com.vaadin.client.ui.Field;

/**
 * This class implements a basic client side rich text editor component.
 * 
 * @author IT Mill Ltd.
 * 
 */
public class VDrawCanvas extends Composite implements Paintable, Field,
		ChangeHandler, BlurHandler {

	private boolean zeichner = true;

	/**
	 * The input node CSS classname.
	 */
	public static final String CLASSNAME = "v-richtextarea";

	// protected ApplicationConnection client;
	private FlowPanel flowPanel = new FlowPanel();

	/** Speichert, ob die Maus momentan noch geklickt ist */
	private boolean mausMomentanDown = false;

	/** Zeichenbare Ebene */
	private Surface surface = new Surface(500, 600);


	/** Liste mit den Client paintableIDs */
	private static ArrayList<String> identifierListe = new ArrayList<String>();

	/** Array mit x Koordinaten */
	private static int[] xLis;

	/** Array mit y Koordinaten */
	private static int[] yLis;

	private Button clean = new Button("Clean");

	private static ArrayList<Integer> clientX = new ArrayList<Integer>();
	private static ArrayList<Integer> clientY = new ArrayList<Integer>();

	private boolean refresh = false;
	
	
	
	private static int pinselGroesse = 7;
	private static ArrayList<Integer> pinselGroessenListe = new ArrayList<Integer>();
	private static int[] pinselGroesseLis;
	

	public VDrawCanvas() {
		surface.clear();
		surface.fillBackground(KnownColor.CORNFLOWER_BLUE).setFillStyle(KnownColor.ALICE_BLUE);

		clean.addClickHandler(new ClickHandler() {

			public void onClick(ClickEvent event) {
				if(zeichner) {
					cleanVars();
				}
				else {
					clean.setVisible(false);
				}
			}
		});

		surface.addMouseMoveHandler(new MouseMoveHandler() {
			public void onMouseMove(MouseMoveEvent event) {
				if(mausMomentanDown && zeichner) {

					if(!randKollision(event.getX(), event.getY())) {

						int x = event.getX();
						int y = event.getY();

						// Fuege die aktuellen Koordinaten KoordinatenArrayliste
						// hinzu
						clientX.add(x);
						clientY.add(y);
						pinselGroessenListe.add(pinselGroesse);

						// zeichne auf Canvas
						surface.setFillStyle(KnownColor.BLACK).fillShape(new ShapeBuilder().drawCircle(event.getX(), event.getY(), pinselGroesse).build());
					}

				}
				else if(!zeichner) {
					clean.setVisible(false);
				}
			}
		});

		surface.addMouseUpHandler(new MouseUpHandler() {
			public void onMouseUp(MouseUpEvent event) {
				if(zeichner) {
					mausMomentanDown = false;

					// Wandle die Arrayliste in ein Array um, welches versendbar
					// ist
					Integer[] tempClientX = new Integer[clientX.size()];
					Integer[] tempClientY = new Integer[clientY.size()];
					Integer[] tempPinselGroesse = new Integer[pinselGroessenListe.size()];
					
					
					clientX.toArray(tempClientX);
					clientY.toArray(tempClientY);
					pinselGroessenListe.toArray(tempPinselGroesse);
					

				}
				else {
					clean.setVisible(false);
				}
			}
		});

		surface.addMouseDownHandler(new MouseDownHandler() {
			public void onMouseDown(MouseDownEvent event) {
				if(zeichner) {

					if(!randKollision(event.getX(), event.getY())) {
						mausMomentanDown = true;
						int x = event.getX();
						int y = event.getY();

						clientX.add(x);
						clientY.add(y);
						pinselGroessenListe.add(pinselGroesse);

						// zeichne auf Canvas
						surface.setFillStyle(KnownColor.BLACK).fillShape(new ShapeBuilder().drawCircle(event.getX(), event.getY(), pinselGroesse).build());
					}

				}
				else {
					clean.setVisible(false);
				}
			}
		});

		flowPanel.add(clean);
		flowPanel.add(surface);
		initWidget(flowPanel);
		setStyleName(CLASSNAME);
	}

	public void updateFromUIDL(final UIDL uidl, ApplicationConnection client) {

		if(client.updateComponent(this, uidl, true)) {
			return;
		}

		// Save the client side identifier (paintable id) for the widget
		// Save reference to server connection object to be able to send
		// user interaction later

		zeichner = uidl.getBooleanAttribute("zeichner");
		refresh = uidl.getBooleanAttribute("refresh");
		pinselGroesse = uidl.getIntAttribute("pinselgroesse");
		

		try {
			xLis = uidl.getIntArrayVariable("xListe");
			yLis = uidl.getIntArrayVariable("yListe");
			pinselGroesseLis = uidl.getIntArrayVariable("pinsel");

			// surface.clear();
			// surface.fillBackground(KnownColor.CORNFLOWER_BLUE).setFillStyle(KnownColor.ALICE_BLUE);

			// if(zeichner){
			surface.clear();
			surface.fillBackground(KnownColor.CORNFLOWER_BLUE).setFillStyle(KnownColor.ALICE_BLUE);
			// }

			for(int i = 0; i < xLis.length; i++) {
				surface.setFillStyle(KnownColor.BLACK).fillShape(new ShapeBuilder().drawCircle(xLis[i], yLis[i], pinselGroesseLis[i]).build());
			}

			if(refresh) {
				cleanVars();
			}
		}

		catch(NumberFormatException e) {
			// ARRAY GELEERT
			e.printStackTrace();
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

	public void cleanVars() {
		clientX.clear();
		clientY.clear();
		pinselGroessenListe.clear();

		int[] xListe = { -100 };
		int[] yListe = { -100 };
		int[] pinselClear = { 7 };

		xLis = xListe;
		yLis = yListe;
		pinselGroesseLis = pinselClear;

		surface.clear();
		surface.fillBackground(KnownColor.CORNFLOWER_BLUE).setFillStyle(KnownColor.ALICE_BLUE);

	}

	private boolean randKollision(int x, int y) {
		if(pinselGroesse > 20){
			if(x <= 370 && x >= 27 && y <= 450 && y >= 27) {
				return false;
			}
			else {
				mausMomentanDown = false;
				return true;
			}
		}
		else{			
			if(x <= 390 && x >= 7 && y <= 470 && y >= 7) {
				return false;
			}
			else {
				mausMomentanDown = false;
				return true;
			}
		}
	}
	
	
//	private boolean randKollision(int x, int y) {
//		if(x <= 390 && x >= 7 && y <= 470 && y >= 7) {
//			return false;
//		}
//		else {
//			mausMomentanDown = false;
//			return true;
//		}
//	}

}

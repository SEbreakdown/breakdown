package de.se.tinf11b3.breakdown.widgetset.client.canvas;

import gwt.g2d.client.graphics.KnownColor;
import gwt.g2d.client.graphics.Surface;

import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

// TODO extend any GWT Widget
public class CanvasWidget extends Surface {

    public static final String CLASSNAME = "canvas";
//    Surface surface = new Surface();
    
    public CanvasWidget() {
//    	fillBackground(KnownColor.BROWN).setFillStyle(KnownColor.ALICE_BLUE);
//        xsetText("Canvas sets the text via CanvasConnector using CanvasState");
        setStyleName(CLASSNAME);
    }

}
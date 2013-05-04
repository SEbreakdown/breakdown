package de.se.tinf11b3.breakdown.widgetset.client.canvas;

import gwt.g2d.client.graphics.Color;
import gwt.g2d.client.graphics.KnownColor;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Widget;

import com.vaadin.client.ui.AbstractComponentConnector;
import com.vaadin.shared.ui.Connect;

import de.se.tinf11b3.breakdown.Canvas;
import de.se.tinf11b3.breakdown.widgetset.client.canvas.CanvasWidget;
import de.se.tinf11b3.breakdown.widgetset.client.canvas.CanvasServerRpc;
import com.vaadin.client.communication.RpcProxy;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.vaadin.shared.MouseEventDetails;
import com.vaadin.client.MouseEventDetailsBuilder;
import de.se.tinf11b3.breakdown.widgetset.client.canvas.CanvasClientRpc;
import de.se.tinf11b3.breakdown.widgetset.client.canvas.CanvasState;
import com.vaadin.client.communication.StateChangeEvent;

@Connect(Canvas.class)
public class CanvasConnector extends AbstractComponentConnector {

    CanvasServerRpc rpc = RpcProxy
            .create(CanvasServerRpc.class, this);
	
    public CanvasConnector() {    
        registerRpc(CanvasClientRpc.class, new CanvasClientRpc() {
            public void alert(String message) {
            	// TODO Do something useful
                Window.alert(message);
            }
        });

		// TODO ServerRpc usage example, do something useful instead
        getWidget().addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                final MouseEventDetails mouseDetails = MouseEventDetailsBuilder
                        .buildMouseEventDetails(event.getNativeEvent(),
                                getWidget().getElement());
                rpc.clicked(mouseDetails);
            }
        });

    }

    @Override
    protected Widget createWidget() {
    	return GWT.create(CanvasWidget.class);
    }

    @Override
    public CanvasWidget getWidget() {
        return (CanvasWidget) super.getWidget();
    }

    @Override
    public CanvasState getState() {
        return (CanvasState) super.getState();
    }

    @Override
    public void onStateChanged(StateChangeEvent stateChangeEvent) {
        super.onStateChanged(stateChangeEvent);
		
		// TODO do something useful
        final String text = getState().text;
//        getWidget().setText(text);
    }

}


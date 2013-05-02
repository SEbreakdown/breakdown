package de.se.tinf11b3.breakdown.widgetset.client.canvas;

import com.vaadin.shared.MouseEventDetails;
import com.vaadin.shared.communication.ServerRpc;

public interface CanvasServerRpc extends ServerRpc {

    // TODO example API
    public void clicked(MouseEventDetails mouseDetails);

}

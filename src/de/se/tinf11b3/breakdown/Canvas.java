package de.se.tinf11b3.breakdown;

import de.se.tinf11b3.breakdown.widgetset.client.canvas.CanvasClientRpc;
import de.se.tinf11b3.breakdown.widgetset.client.canvas.CanvasServerRpc;
import com.vaadin.shared.MouseEventDetails;
import de.se.tinf11b3.breakdown.widgetset.client.canvas.CanvasState;

public class Canvas extends com.vaadin.ui.AbstractComponent {

    private CanvasServerRpc rpc = new CanvasServerRpc() {
        private int clickCount = 0;
        
        public void clicked(MouseEventDetails mouseDetails) {
            // nag every 5:th click using RPC
            if (++clickCount % 5 == 0) {
                getRpcProxy(CanvasClientRpc.class).alert(
                        "Ok, that's enough!");
            }
            // update shared state
            getState().text = "You have clicked " + clickCount + " times";
        }
    };  

    public Canvas() {
        registerRpc(rpc);
    }

    @Override
    public CanvasState getState() {
        return (CanvasState) super.getState();
    }
}

package de.se.tinf11b3.breakdown.widgetset;

import java.util.ArrayList;
import java.util.Map;

import com.vaadin.server.PaintException;
import com.vaadin.server.PaintTarget;
import com.vaadin.ui.AbstractComponent;


/**
 * Server side component for the VDrawCanvas widget.
 */
@com.vaadin.ui.ClientWidget(de.se.tinf11b3.breakdown.widgetset.client.ui.VDrawCanvas.class)
public class DrawCanvas extends AbstractComponent {

	private boolean zeichner = true;

	public boolean isZeichner() {
		return zeichner;
	}

	/** Aktuelle x Koordinate */
	private String x = "";

	/** Aktuelle y Koordinate */
	private String y = "";

	/** Alle x Koordinaten */
	private static String[] xListe = { "-100" };

	/** Alle y Koordinaten */
	private static String[] yListe = { "-100" };

	private static String[] clientXList = { "-100" };
	private static String[] clientYList = { "-100" };
	private static String[] pinselGroesseListe = { "7" };

	private static boolean refresh = false;

	private static int pinselGroesse = 7;


	public DrawCanvas() {
	}

	/**
	 * Setzt die Serialisierten Variablen und Atrribute
	 */
	@Override
	public void paintContent(PaintTarget target) throws PaintException {
		super.paintContent(target);
		// Paint any component specific content by setting attributes
		// These attributes can be read in updateFromUIDL in the widget.
		// target.addAttribute("clicks", clicks);
		target.addAttribute("x", x);
		target.addAttribute("y", y);
		target.addAttribute("zeichner", zeichner);
		target.addAttribute("refresh", refresh);
		target.addAttribute("clientX", clientXList);
		target.addAttribute("clientY", clientYList);
		target.addAttribute("pinselgroesse", pinselGroesse);

		// We could also set variables in which values can be returned
		// but declaring variables here is not required
		target.addVariable(this, "xListe", xListe);
		target.addVariable(this, "yListe", yListe);
		target.addVariable(this, "pinsel", pinselGroesseListe);

		requestRepaint();
	}

	/**
	 * Empfang die Variablen�nderungen vom Client
	 * 
	 * {@inheritDoc}
	 */
	@Override
	public void changeVariables(Object source, Map<String, Object> variables) {
		super.changeVariables(source, variables);

		// // Variables set by the widget are returned in the "variables" map.
		//

		// Koordinatenarray wurde empfangen
		if(variables.containsKey("clientY")) {
			// System.out.println("Server: Habe Koordinatenarray empfangen");

			// Hole Object und fuege es in die Integer Arrayliste ein
			Object[] xObject = (Object[]) variables.get("clientX");
			ArrayList<String> x = new ArrayList<String>();

			for(Object temp : xObject) {
				x.add(String.valueOf(temp));
			}

			// Hole Object und fuege es in die Integer Arrayliste ein
			Object[] yObject = (Object[]) variables.get("clientY");
			ArrayList<String> y = new ArrayList<String>();

			for(Object temp : yObject) {
				y.add(String.valueOf(temp));
			}

			// Hole Object und fuege es in die Integer Arrayliste ein
			Object[] pinselGroesseObject = (Object[]) variables.get("pinsel");
			ArrayList<String> pinselGroes = new ArrayList<String>();

			for(Object temp : pinselGroesseObject) {
				pinselGroes.add(String.valueOf(temp));
			}

			String[] xListe = new String[x.size()];
			String[] yListe = new String[y.size()];
			String[] pinselGroesListe = new String[pinselGroes.size()];

			// Arrayliste in Array zurueckwandeln
			x.toArray(xListe);
			y.toArray(yListe);
			pinselGroes.toArray(pinselGroesListe);

			// Neues Array Global abspeichern
			DrawCanvas.xListe = xListe;
			DrawCanvas.yListe = yListe;
			DrawCanvas.pinselGroesseListe = pinselGroesListe;
		}

		// Aktualisiere nun alle Clients
		if(variables.containsKey("zeichne")) {
			refresh = false;
			// new PushThread(userVerwaltung);
			userVerwaltung.benachrichtigeAlleBenutzer();
		}

		// Loeschen eingeleitet
		if(variables.containsKey("del")) {
			// System.out.println("del");

			String[] xListe = { "-100" };
			String[] yListe = { "-100" };
			String[] pinselGroesseListe = { "7" };

			// Neues Array Global abspeichern
			DrawCanvas.xListe = xListe;
			DrawCanvas.yListe = yListe;
			DrawCanvas.clientXList = xListe;
			DrawCanvas.clientYList = yListe;
			DrawCanvas.pinselGroesseListe = pinselGroesseListe;

			// new PushThread(userVerwaltung);
			userVerwaltung.benachrichtigeAlleBenutzer();
		}

	}

	public void clearVars() {
		refresh = true;

		String[] xListe = { "-100" };
		String[] yListe = { "-100" };
		String[] pinselGroesseListe = { "7" };
		
		// Neues Array Global abspeichern
		DrawCanvas.xListe = xListe;
		DrawCanvas.yListe = yListe;
		DrawCanvas.clientXList = xListe;
		DrawCanvas.clientYList = yListe;
		DrawCanvas.pinselGroesseListe = pinselGroesseListe;

		// for(DrawCanvas temp : SpielFenster.getCanvasListe()) {
		// temp.requestRepaint();
		// }

		// new PushThread(userVerwaltung);
		userVerwaltung.benachrichtigeAlleBenutzer();
		// System.out.println("Clean vars");

		try {
			Thread.sleep(200);
		}
		catch(InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		refresh = false;
	}

	public static void close() {
		String[] xListe = { "-100" };
		String[] yListe = { "-100" };
		String[] pinselGroesseListe = { "7" };

		// Neues Array Global abspeichern
		DrawCanvas.xListe = xListe;
		DrawCanvas.yListe = yListe;
		DrawCanvas.clientXList = xListe;
		DrawCanvas.clientYList = yListe;
		DrawCanvas.pinselGroesseListe = pinselGroesseListe;
		
		// new PushThread(userVerwaltung,
		// SpielFenster.getGeratenesWortLabelListe(),
		// SpielFenster.getWoerterVerlauf());
	}

	public void setZeichner(boolean zeichner) {
		this.zeichner = zeichner;
	}

	public static int getPinselGroesse() {
		return pinselGroesse;
	}

	public static void setPinselGroesse(int pinselGroesse) {
		DrawCanvas.pinselGroesse = pinselGroesse;
	}

}

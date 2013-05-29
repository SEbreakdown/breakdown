package de.se.tinf11b3.breakdown.gui;

import sun.font.SunFontManager.FamilyDescription;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.terminal.ThemeResource;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.VerticalLayout;

public class Hilfe extends CustomComponent {

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	@AutoGenerated
	private AbsoluteLayout mainLayout;

	@AutoGenerated
	private VerticalLayout verticalLayout_1;

	@AutoGenerated
	private Button button_hauptmenue;

	@AutoGenerated
	private TextArea textArea_1;

	@AutoGenerated
	private Label label_1;

	private Hauptmenue hauptmenue;
	
	/**
	 * The constructor should first build the main layout, set the
	 * composition root and then do any custom initialization.
	 *
	 * The constructor will not be automatically regenerated by the
	 * visual editor.
	 */
	public Hilfe(final Hauptmenue hauptmenue) {
		this.hauptmenue = hauptmenue;
		buildMainLayout();
		setCompositionRoot(mainLayout);

		button_hauptmenue.addStyleName("button-hauptmenue");

		
		button_hauptmenue.addListener(new ClickListener() {
			
			public void buttonClick(ClickEvent event) {
				getWindow().setContent(hauptmenue);
			}
		});
		
		
		
		
		// TODO add user code here
	}

	@AutoGenerated
	private AbsoluteLayout buildMainLayout() {
		// common part: create layout
		mainLayout = new AbsoluteLayout();
		mainLayout.setImmediate(false);
		mainLayout.setWidth("100%");
		mainLayout.setHeight("100%");
		mainLayout.setMargin(false);
		
		// top-level component properties
		setWidth("100.0%");
		setHeight("100.0%");
		
		// verticalLayout_1
		verticalLayout_1 = buildVerticalLayout_1();
		mainLayout.addComponent(verticalLayout_1, "top:7.5%;left:7.5%;");
		
		return mainLayout;
	}

	@AutoGenerated
	private VerticalLayout buildVerticalLayout_1() {
		// common part: create layout
		verticalLayout_1 = new VerticalLayout();
		verticalLayout_1.setImmediate(false);
		verticalLayout_1.setWidth("400px");
		verticalLayout_1.setHeight("500px");
		verticalLayout_1.setMargin(false);
		
		// label_1
		label_1 = new Label();
		label_1.setIcon(new ThemeResource("Spiel.png"));
		label_1.setImmediate(false);
		label_1.setWidth("-1px");
		label_1.setHeight("-1px");
		label_1.setValue("");
		verticalLayout_1.addComponent(label_1);
		
		// textArea_1
		textArea_1 = new TextArea();
		textArea_1.setImmediate(false);
		textArea_1.setWidth("100.0%");
		textArea_1.setHeight("200px");
		textArea_1.setValue("Bevor ein neues Spiel gestartet werden kann, muss ein Schwierigkeitsgrad gewählt werden.\n\nSpielverlauf:\nDer gelbe Balken unten kann vom Spieler nach rechts und links bewegt werden. Sinn des Spiels ist mit dem Ball alle Blöcke abzuschießen. Ein getroffener Block verschwindet und der Ball prallt physikalisch korrekt ab. Wird der Ball nicht mit dem Balken nach oben abgelenkt, verliert der Spieler ein (von anfangs drei) Leben.\n\nSteuerung:\nDer gelbe Balken wird mit der Maus nach rechts und links bewegt.");
		textArea_1.addStyleName("schriftgroesse");
		textArea_1.setReadOnly(true);
		verticalLayout_1.addComponent(textArea_1);
		
		// button_hauptmenue
		button_hauptmenue = new Button();
		button_hauptmenue.setCaption("zurueck zum Hauptmenue");
		button_hauptmenue.setImmediate(true);
		button_hauptmenue.setWidth("200px");
		button_hauptmenue.setHeight("-1px");
		verticalLayout_1.addComponent(button_hauptmenue);
		
		return verticalLayout_1;
	}

}

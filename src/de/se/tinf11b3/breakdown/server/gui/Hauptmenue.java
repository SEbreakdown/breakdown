package de.se.tinf11b3.breakdown.server.gui;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.VerticalLayout;

import de.se.tinf11b3.breakdown.server.spielverwaltung.Spielverwaltung;

public class Hauptmenue extends CustomComponent {

	@AutoGenerated
	private AbsoluteLayout mainLayout;

	@AutoGenerated
	private VerticalLayout verticalLayout_1;

	@AutoGenerated
	private Button button_highscore;

	@AutoGenerated
	private Button button_hilfe;

	@AutoGenerated
	private Button button_start;

	private Schwierigkeitsgrad schwierigkeitsgrad;
	private Hilfe hilfe = new Hilfe(this);
	private Highscore highscore;

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	/**
	 * The constructor should first build the main layout, set the composition
	 * root and then do any custom initialization.
	 * 
	 * The constructor will not be automatically regenerated by the visual
	 * editor.
	 */
	public Hauptmenue(Spielverwaltung spielverwaltung) {
		buildMainLayout();
		setCompositionRoot(mainLayout);
		highscore = new Highscore(this, spielverwaltung);
		
		schwierigkeitsgrad = new Schwierigkeitsgrad(this,spielverwaltung);

		// button_start.addStyleName("button-start");
		button_start.setDebugId("button-start");

		button_start.addListener(new ClickListener() {

			public void buttonClick(ClickEvent event) {
				getWindow().setContent(schwierigkeitsgrad);
			}
		});

		button_hilfe.addListener(new ClickListener() {

			public void buttonClick(ClickEvent event) {
				getWindow().setContent(hilfe);
			}
		});

		button_highscore.addListener(new ClickListener() {

			public void buttonClick(ClickEvent event) {
				highscore.refreshScore();
				getWindow().setContent(highscore);
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
		mainLayout.addComponent(verticalLayout_1, "top:20.0%;left:20.0%;");

		return mainLayout;
	}

	@AutoGenerated
	private VerticalLayout buildVerticalLayout_1() {
		// common part: create layout
		verticalLayout_1 = new VerticalLayout();
		verticalLayout_1.setImmediate(false);
		verticalLayout_1.setWidth("240px");
		verticalLayout_1.setHeight("140px");
		verticalLayout_1.setMargin(false);

		// button_start
		button_start = new Button();
		button_start.setCaption("Spiel starten");
		button_start.setImmediate(true);
		button_start.setWidth("100.0%");
		button_start.setHeight("-1px");
		verticalLayout_1.addComponent(button_start);
		verticalLayout_1.setComponentAlignment(button_start, new Alignment(48));

		// button_hilfe
		button_hilfe = new Button();
		button_hilfe.setCaption("Hilfe anzeigen");
		button_hilfe.setImmediate(true);
		button_hilfe.setWidth("100.0%");
		button_hilfe.setHeight("-1px");
		verticalLayout_1.addComponent(button_hilfe);
		verticalLayout_1.setComponentAlignment(button_hilfe, new Alignment(48));

		// button_highscore
		button_highscore = new Button();
		button_highscore.setCaption("Highscoreliste anzeigen");
		button_highscore.setImmediate(true);
		button_highscore.setWidth("100.0%");
		button_highscore.setHeight("-1px");
		verticalLayout_1.addComponent(button_highscore);
		verticalLayout_1.setComponentAlignment(button_highscore, new Alignment(48));

		return verticalLayout_1;
	}

}

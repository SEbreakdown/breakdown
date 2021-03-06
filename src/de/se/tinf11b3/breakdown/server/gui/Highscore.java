package de.se.tinf11b3.breakdown.server.gui;


 
import java.util.ArrayList;


import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Table;
import com.vaadin.ui.VerticalLayout;

import de.se.tinf11b3.breakdown.server.highscore.HighscoreEntry;
import de.se.tinf11b3.breakdown.server.spielverwaltung.Spielverwaltung;

public class Highscore extends CustomComponent {

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	
	private AbsoluteLayout mainLayout;
	private VerticalLayout verticalLayout_1;
	private Button button_hauptmenue;
	private Button button_highscore;
	private Table table_1;
	private Hauptmenue hauptmenue;
	private Spielverwaltung spielverwaltung;
	
	/**
	 * The constructor should first build the main layout, set the
	 * composition root and then do any custom initialization.
	 *
	 * The constructor will not be automatically regenerated by the
	 * visual editor.
	 */
	public Highscore(final Hauptmenue hauptmenue, Spielverwaltung spielverwaltung) {
		this.hauptmenue = hauptmenue;
		this.spielverwaltung = spielverwaltung;
		buildMainLayout();
		setCompositionRoot(mainLayout);
		
		refreshScore();    
		
		
		button_hauptmenue.addListener(new ClickListener() {
			public void buttonClick(ClickEvent event) {
				getWindow().setContent(hauptmenue);
			}
		});
		
		button_highscore.addListener(new ClickListener() {
			public void buttonClick(ClickEvent event) {
				refreshScore();
			}
		});
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
		
		
		//table_1
		table_1 = new Table();
		table_1.setImmediate(false);
		table_1.setWidth("-1px");
		table_1.setHeight("-1px");
		table_1.addContainerProperty("Punkte", String.class, null);
		table_1.addContainerProperty("Name", String.class,  null);
		verticalLayout_1.addComponent(table_1);
				
		
		// button_hauptmenue
		button_hauptmenue = new Button();
		button_hauptmenue.setCaption("zurueck zum Hauptmenue");
		button_hauptmenue.setImmediate(true);
		button_hauptmenue.setWidth("200px");
		button_hauptmenue.setHeight("-1px");
		verticalLayout_1.addComponent(button_hauptmenue);		
		
		button_highscore = new Button();
		button_highscore.setCaption("Highscore");
		button_highscore.setImmediate(true);
		button_highscore.setWidth("200px");
		button_highscore.setHeight("-1px");
		verticalLayout_1.addComponent(button_highscore);
		
		
		return verticalLayout_1;
	}

	public void refreshScore() {
		ArrayList<HighscoreEntry> highscoreEntries = getHighscore();
		table_1.removeAllItems();
		for (int i=0; i<highscoreEntries.size(); i++){
			table_1.addItem(new Object[] {highscoreEntries.get(i).getScore(), highscoreEntries.get(i).getName()}, new Integer(i));
		}
		table_1.requestRepaint();
	}
	
	// liest die aktuelle Highscoreliste und erstellt Array für Punkte und Name
	private ArrayList<HighscoreEntry> getHighscore(){
		return spielverwaltung.getHighscorehandler().getEntrylist();
	}

	

}
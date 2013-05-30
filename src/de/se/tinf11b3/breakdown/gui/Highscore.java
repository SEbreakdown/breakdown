package de.se.tinf11b3.breakdown.gui;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Table;
import com.vaadin.ui.VerticalLayout;

public class Highscore extends CustomComponent {

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	@AutoGenerated
	private AbsoluteLayout mainLayout;

	@AutoGenerated
	private VerticalLayout verticalLayout_1;

	@AutoGenerated
	private Button button_hauptmenue;

	@AutoGenerated
	private Table table_1;

	private Hauptmenue hauptmenue;
	
	/**
	 * The constructor should first build the main layout, set the
	 * composition root and then do any custom initialization.
	 *
	 * The constructor will not be automatically regenerated by the
	 * visual editor.
	 */
	public Highscore(final Hauptmenue hauptmenue) {
		this.hauptmenue = hauptmenue;
		buildMainLayout();
		setCompositionRoot(mainLayout);
		
		
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
		
		// table_1
		table_1 = new Table();
		table_1.setImmediate(false);
		table_1.setWidth("-1px");
		table_1.setHeight("-1px");
		table_1.addContainerProperty("Punkte",  String.class,  null);
		table_1.addContainerProperty("Name",  String.class,  null);
		table_1.addItem(new Object[] {
				"500","Dennis"}, new Integer(1));
		table_1.addItem(new Object[] {
				"400","Michael"}, new Integer(2));
		table_1.addItem(new Object[] {
				"300","Julian"}, new Integer(3));
		table_1.addItem(new Object[] {
				"200","Steffen"}, new Integer(4));
		table_1.addItem(new Object[] {
				"100","Lukas"}, new Integer(5));
		verticalLayout_1.addComponent(table_1);
		
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
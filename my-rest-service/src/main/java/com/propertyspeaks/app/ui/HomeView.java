package com.propertyspeaks.app.ui;

import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Main;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.html.Section;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;


@PageTitle("List of Certificates Of Occupancy")
@Route(value = "", layout = MainLayout.class)
public class HomeView extends Main {
	
	
	public HomeView() {
	add(new Section(new Paragraph("This is HomePage."),
			new Span("Know your Resources")));
	add(new Section(
			new H2(new RouterLink("Calling a REST service using a DTO class for results", InMemoryDTOView.class)),
			new Paragraph(
					"The first example uses a Data Transfer Object (DTO) class that we've created. Using a DTO is the standard way of calling REST services in Java, and this approach works well with Vaadin components as well.")));

}
	
	
}

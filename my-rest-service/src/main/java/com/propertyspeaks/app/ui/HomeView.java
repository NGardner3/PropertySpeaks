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
	
	String testString = "25105 Dartmouth";
	
	
	public HomeView() {
	add(new Section(new Paragraph("This is HomePage."),
			new Span("Know your Resources")));
	add(new Section(
			new H2(new RouterLink("Calling a REST service using a DTO class for results", InMemoryDTOView.class)),
			new Paragraph(
					"The first example uses a Data Transfer Object (DTO) class that we've created. Using a DTO is the standard way of calling REST services in Java, and this approach works well with Vaadin components as well.")));

	add(new Section(new H2(new RouterLink("Calling a REST service with pure JSON results", InMemoryJSONView.class)),
			new Paragraph(
					"The second example does not use a DTO, but raw JSON instead using the Jackson library included with Spring. This approach works well when the received data is dynamic in nature, or you don't want to create a DTO.")));

	
	}
	
	boolean b = testinput(testString);
	
	
	public boolean testinput(String testString) {
		boolean test;
		int test2;
		String test3;
		test = testString.contains("");
		test2 = testString.indexOf("", 1);
		String x = "x";
		test3 =	testString.replaceFirst(" ", x );
		int idx = test3.indexOf(x);
		System.out.println("The First logged Index# I Need is" + idx );
		String str_num = test3.substring(0,idx++);
		System.out.println("The str_num# found " + str_num );
		
		
		String str_address= test3.substring(idx++);
		System.out.println("The str_address found " + str_address );
		String address= str_num.concat(" ").concat(str_address);
		
		
	
		System.out.println(test3.substring(0,(--idx)-1));
		System.out.println(test3.substring(idx++));
		System.out.println("Reverse engineered String " + address);
		return test;
		
	}
	
	
}

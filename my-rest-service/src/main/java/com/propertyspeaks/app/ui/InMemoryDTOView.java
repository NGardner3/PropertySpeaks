package com.propertyspeaks.app.ui;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.propertyspeaks.app.data.AttributesDTO;
import com.propertyspeaks.app.data.GlobalFieldDTO;
import com.propertyspeaks.app.data.RestClientService;
import com.propertyspeaks.app.data.RestResponse;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Main;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("In-Memory DTO | Vaadin REST Examples")
@Route(value = "in-memory-dto", layout = MainLayout.class)
@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
@ResponseBody
public class InMemoryDTOView extends Main {

	
	public InMemoryDTOView(@Autowired RestClientService service) {
		// First example uses a Data Transfer Object (DTO) class that we've created. The
		// Vaadin Grid works well with entity classes, so this is quite straightforward:
		final Grid<AttributesDTO> attributesGrid = new Grid<AttributesDTO>(AttributesDTO.class);

		// Fetch all entities and show
		final Button fetchPropertyRecords = new Button("Fetch all property attributes",
				e -> attributesGrid.setItems(service.getAllRecords()));
		 fetchPropertyRecords.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

		add( fetchPropertyRecords , attributesGrid);

	}

}

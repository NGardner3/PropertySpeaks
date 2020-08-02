package com.propertyspeaks.app.data;


import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.RequestHeadersSpec;

import com.fasterxml.jackson.databind.JsonNode;

@Service
public class RestClientService implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3783811171602096499L;
	/**
	 * The port changes depending on where we deploy the app
	 */
	@Value("${PORT:8080}")
	private String serverPort;
	

	/**
	 * Returns parsed {@link CommentDTO} objects from the REST service.
	 *
	 * Useful when the response data has a known structure.
	 */
	public Collection<AttributesDTO> getAllRecords() {

		System.out.println("Fetching all Comment objects through REST..");

		// Fetch from 3rd party API; configure fetch
		final RequestHeadersSpec<?> spec = WebClient.create().get()
				.uri("https://gis.detroitmi.gov/arcgis/rest/services/OpenData/CertificateOfCompliance/FeatureServer/0/query?where=1%3D1&outFields=*&outSR=4326&f=json");

		// do fetch and map result
		final List<AttributesDTO> records = spec.retrieve().toEntityList(AttributesDTO.class).block().getBody();

		System.out.println(String.format("...received %d items.", records.size()));

		return records;
	}
	
	public List<JsonNode> getAllPosts() {

		System.out.println("Fetching all Post objects through REST..");

		// Fetch from 3rd party API; configure fetch
		final RequestHeadersSpec<?> spec = WebClient.create().get().uri("https://gis.detroitmi.gov/arcgis/rest/services/OpenData/CertificateOfCompliance/FeatureServer/0/query?where=1%3D1&outFields=*&outSR=4326&f=json");

		// do fetch and map result
		final List<JsonNode> posts = spec.retrieve().toEntityList(JsonNode.class).block().getBody();

		System.out.println(String.format("...received %d items.", posts.size()));

		return posts;

	}
	/**
	 * Fetches the total number of items available through the REST API
	 */
	public int fetchCount() {

		System.out.println("fetching count...");

		// We use a local provider for this bigger data set.
		// The API has two methods, 'data' and 'count'.
		final String url = String.format("http://localhost:" + serverPort + "/count");

		final RequestHeadersSpec<?> spec = WebClient.create().get().uri(url);
		final Integer response = spec.retrieve().toEntity(Integer.class).block().getBody();

		System.out.println("...count is " + response);
		return response;

	}

}

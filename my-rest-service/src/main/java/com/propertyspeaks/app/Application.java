package com.propertyspeaks.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.propertyspeaks.app.data.AttributesDTO;
import com.propertyspeaks.app.data.GlobalFieldDTO;

/**
 * The entry point of the Spring Boot application.
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {
	
	private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    @Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	/*
	 * @Bean public CommandLineRunner run(RestTemplate restTemplate) throws
	 * Exception { return args -> { GlobalFieldDTO attributes =
	 * restTemplate.getForObject(
	 * "https://gis.detroitmi.gov/arcgis/rest/services/OpenData/CertificateOfOccupancy/FeatureServer/0/query?where=1%3D1&outFields=*&outSR=4326&f=json",
	 * GlobalFieldDTO.class); log.info(attributes.toString()); }; }
	 */
}

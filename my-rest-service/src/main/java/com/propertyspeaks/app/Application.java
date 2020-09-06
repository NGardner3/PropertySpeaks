package com.propertyspeaks.app;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


import com.googlecode.gentyref.TypeToken;
import com.jayway.jsonpath.JsonPath;
import com.propertyspeaks.app.data.Attributes;
import com.propertyspeaks.app.data.FeatureDTO;
import com.propertyspeaks.app.webJson.IStackJsonParser;
import com.propertyspeaks.app.webJson.JsonpJsonParser;
import com.propertyspeaks.app.webJson.QueryResultBean;
import com.propertyspeaks.app.webJson.StackQuery;

import net.minidev.json.JSONArray;

import static java.lang.System.*;




/**
 * The entry point of the Spring Boot application.
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {
	private static long count;

	  static String testString;	
	
	private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) throws IOException {
        SpringApplication.run(Application.class, args);
      
        
        IStackJsonParser parser= new JsonpJsonParser();
   

	try (FileInputStream in = new FileInputStream("JSON File.js")) {
		List<Attributes> results = parser.parseJson(in);
//			   count = results.stream().count();
//			  System.out.println("The Number of Records:"+" "+ count );
		for(Attributes att:results) {
		   out.println(att.getStreet_name());
		}
	
	}catch (IOException e) {
		e.printStackTrace();
	}
  }

	
	

    }



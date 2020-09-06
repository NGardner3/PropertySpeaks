package com.propertyspeaks.app.webJson;



import static java.lang.System.out;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonValue;

import com.jayway.jsonpath.JsonPath;
import com.propertyspeaks.app.data.Attributes;
import com.propertyspeaks.app.data.FeatureDTO;
import com.propertyspeaks.app.data.GeometryDTO;







public class JsonpJsonParser implements IStackJsonParser {
	
	@Override
	public List<Attributes> parseJson(InputStream in ) {
		JsonReader reader = Json.createReader(in);
		JsonObject json = reader.readObject();
		reader.close();
		
		//parse the json object, return something
		List<Attributes> results = new ArrayList<Attributes>();
		JsonArray features = json.getJsonArray("features");
		for (JsonValue feature : features) {
			if (feature instanceof JsonObject) {
				System.out.println("Printing JsonValue feature "+""+ feature);
			 
				Attributes result = createBean((JsonObject)feature);
				results.add(result);
			}
		}
		return results;
	}
	
	
	public Attributes createBean(JsonObject json) {
		QueryResultBean bean = new QueryResultBean();
		 JsonArray array= json.getJsonArray("features");
		List<Attributes> features = new ArrayList<Attributes>();
		for(int i=0; i<features.size(); i++) {
			features.add((Attributes) array.getJsonObject(i));
		}
		 Attributes attributes = new Attributes();
		
		
       
        JsonObject ownerJson = json.getJsonObject("attributes");
        attributes.setRecord_id(ownerJson.getString("record_id", null));
        attributes.setStreet_num(ownerJson.getString("street_num", null));
        attributes.setStreet_dir(ownerJson.getString("street_dir", null));
   	    attributes.setStreet_name(ownerJson.getString("street_name", null));
	    attributes.setStreet_type(ownerJson.getString("street_type", null));  
	    attributes.setTask(ownerJson.getString("task", null));
	    attributes.setStatus(ownerJson.getString("status", null));
	    attributes.setRecord_status_date(ownerJson.getString("record_status_date", null)); 
	    attributes.setOid(ownerJson.getInt("oid"));
	    
	    GeometryDTO geometry= new GeometryDTO();
	    
	    geometry.setX(json.getInt("x", 0));
	    geometry.setY(json.getInt("y", 0));
	    
	    attributes.setGeometry(geometry);
	    
	   
	    
	    
	    
//	    JsonObject Json = json.getJsonObject("geometry");
//	    Optional.ofNullable(Json.getInt("x"));
//	    geometry.setY(Json.getInt("y"));
	    
	   
	    
	    
//        GeometryDTO geometry = new GeometryDTO();
//        JsonObject ownerJson2 = json.getJsonObject("geometry");
//	    geometry.setX(ownerJson2.getInt("x"));
//	    geometry.setY(ownerJson2.getInt("y"));
//
//	    
//
//	    
//      bean.setGeometry(geometry);

	    return attributes;
		
		
	}
	
	
	
	
	}
	

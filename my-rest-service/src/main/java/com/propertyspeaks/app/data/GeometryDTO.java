package com.propertyspeaks.app.data;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


public class GeometryDTO {
	private int x;
	private Number y;
	
	
	//private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public GeometryDTO() {
		
	}
	
	public int getX() {
	return x;
	}

	

	public void setX(int x) {
	this.x =  x;
	}

	public Number getY() {
	return y;
	}

	public void setY(Number y) {
	this.y =  y;
	}

	@Override
	public String toString() {
		return "GeometryDTO [x=" + x + ", y=" + y + "]";
	}

//	public Map<String, Object> getAdditionalProperties() {
//	return this.additionalProperties;
//	}
//
//	public void setAdditionalProperty(String name, Object value) {
//	this.additionalProperties.put(name, value);
//	}
	
	

	
	

}

package com.propertyspeaks.app.data;

import java.util.HashMap;
import java.util.Map;

public class GeometryDTO {
	private Double x;
	private Double y;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public Double getX() {
	return x;
	}

	public void setX(Double x) {
	this.x = x;
	}

	public Double getY() {
	return y;
	}

	public void setY(Double y) {
	this.y = y;
	}

	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	}
	
	

	@Override
	public String toString() {
		return "GeometryDTO [x=" + x + ", y=" + y + ", additionalProperties=" + additionalProperties + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((additionalProperties == null) ? 0 : additionalProperties.hashCode());
		result = prime * result + ((x == null) ? 0 : x.hashCode());
		result = prime * result + ((y == null) ? 0 : y.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GeometryDTO other = (GeometryDTO) obj;
		if (additionalProperties == null) {
			if (other.additionalProperties != null)
				return false;
		} else if (!additionalProperties.equals(other.additionalProperties))
			return false;
		if (x == null) {
			if (other.x != null)
				return false;
		} else if (!x.equals(other.x))
			return false;
		if (y == null) {
			if (other.y != null)
				return false;
		} else if (!y.equals(other.y))
			return false;
		return true;
	}

	

}

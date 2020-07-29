package com.propertyspeaks.app.data;

import java.util.HashMap;
import java.util.Map;


import org.apache.commons.lang3.builder.ToStringBuilder;

public class FeatureDTO {
	
	private AttributesDTO attributes;
	private GeometryDTO geometry;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public AttributesDTO getAttributes() {
	return attributes;
	}

	public void setAttributes(AttributesDTO attributes) {
	this.attributes = attributes;
	}

	public GeometryDTO getGeometry() {
	return geometry;
	}

	public void setGeometry(GeometryDTO geometry) {
	this.geometry = geometry;
	}

	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
	return new ToStringBuilder(this).append("attributes", attributes).append("geometry", geometry).append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((additionalProperties == null) ? 0 : additionalProperties.hashCode());
		result = prime * result + ((attributes == null) ? 0 : attributes.hashCode());
		result = prime * result + ((geometry == null) ? 0 : geometry.hashCode());
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
		FeatureDTO other = (FeatureDTO) obj;
		if (additionalProperties == null) {
			if (other.additionalProperties != null)
				return false;
		} else if (!additionalProperties.equals(other.additionalProperties))
			return false;
		if (attributes == null) {
			if (other.attributes != null)
				return false;
		} else if (!attributes.equals(other.attributes))
			return false;
		if (geometry == null) {
			if (other.geometry != null)
				return false;
		} else if (!geometry.equals(other.geometry))
			return false;
		return true;
	}

	


}
	

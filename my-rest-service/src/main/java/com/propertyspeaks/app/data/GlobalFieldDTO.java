package com.propertyspeaks.app.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class GlobalFieldDTO {

	private String objectIdFieldName;
	private String globalIdFieldName;
	private String geometryType;
	private SpatialReferenceDTO spatialReference;
	private List<FeatureDTO> features = null;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public String getObjectIdFieldName() {
	return objectIdFieldName;
	}

	public void setObjectIdFieldName(String objectIdFieldName) {
	this.objectIdFieldName = objectIdFieldName;
	}

	public String getGlobalIdFieldName() {
	return globalIdFieldName;
	}

	public void setGlobalIdFieldName(String globalIdFieldName) {
	this.globalIdFieldName = globalIdFieldName;
	}

	public String getGeometryType() {
	return geometryType;
	}

	public void setGeometryType(String geometryType) {
	this.geometryType = geometryType;
	}

	public SpatialReferenceDTO getSpatialReference() {
	return spatialReference;
	}

	public void setSpatialReference(SpatialReferenceDTO spatialReference) {
	this.spatialReference = spatialReference;
	}

	public List<FeatureDTO> getFeatures() {
	return features;
	}

	public void setFeatures(List<FeatureDTO> features) {
	this.features = features;
	}

	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
	return new ToStringBuilder(this).append("objectIdFieldName", objectIdFieldName).append("globalIdFieldName", globalIdFieldName).append("geometryType", geometryType).append("spatialReference", spatialReference).append("features", features).append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((additionalProperties == null) ? 0 : additionalProperties.hashCode());
		result = prime * result + ((geometryType == null) ? 0 : geometryType.hashCode());
		result = prime * result + ((globalIdFieldName == null) ? 0 : globalIdFieldName.hashCode());
		result = prime * result + ((objectIdFieldName == null) ? 0 : objectIdFieldName.hashCode());
		result = prime * result + ((spatialReference == null) ? 0 : spatialReference.hashCode());
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
		GlobalFieldDTO other = (GlobalFieldDTO) obj;
		if (additionalProperties == null) {
			if (other.additionalProperties != null)
				return false;
		} else if (!additionalProperties.equals(other.additionalProperties))
			return false;
		if (geometryType == null) {
			if (other.geometryType != null)
				return false;
		} else if (!geometryType.equals(other.geometryType))
			return false;
		if (globalIdFieldName == null) {
			if (other.globalIdFieldName != null)
				return false;
		} else if (!globalIdFieldName.equals(other.globalIdFieldName))
			return false;
		if (objectIdFieldName == null) {
			if (other.objectIdFieldName != null)
				return false;
		} else if (!objectIdFieldName.equals(other.objectIdFieldName))
			return false;
		if (spatialReference == null) {
			if (other.spatialReference != null)
				return false;
		} else if (!spatialReference.equals(other.spatialReference))
			return false;
		return true;
	}

}
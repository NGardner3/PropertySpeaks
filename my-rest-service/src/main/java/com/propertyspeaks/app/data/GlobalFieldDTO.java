package com.propertyspeaks.app.data;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class GlobalFieldDTO {

	private String objectIdFieldName;
	private String globalIdFieldName;
	private String geometryType;
	private SpatialReferenceDTO spatialReference;
	private  FeatureDTO features [];
	

	public GlobalFieldDTO(@JsonProperty("features") FeatureDTO features[]) {
		this.features = features;
	}
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

	public FeatureDTO[] getFeatures() {
	return features;
	}

	public void setFeatures(FeatureDTO[] features) {
	this.features = features;
	}

	

	@Override
	public String toString() {
		return "GlobalFieldDTO [objectIdFieldName=" + objectIdFieldName + ", globalIdFieldName=" + globalIdFieldName
				+ ", geometryType=" + geometryType + ", spatialReference=" + spatialReference + ", features="
				+ Arrays.toString(features) + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
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
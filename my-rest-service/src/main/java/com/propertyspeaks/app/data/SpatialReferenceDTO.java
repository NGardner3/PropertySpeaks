package com.propertyspeaks.app.data;


import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class SpatialReferenceDTO {
	private Integer wkid;
	private Integer latestWkid;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	
	
	public SpatialReferenceDTO() {
	
	}

	public Integer getWkid() {
	return wkid;
	}

	public void setWkid(Integer wkid) {
	this.wkid = wkid;
	}

	public Integer getLatestWkid() {
	return latestWkid;
	}

	public void setLatestWkid(Integer latestWkid) {
	this.latestWkid = latestWkid;
	}

	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((additionalProperties == null) ? 0 : additionalProperties.hashCode());
		result = prime * result + ((latestWkid == null) ? 0 : latestWkid.hashCode());
		result = prime * result + ((wkid == null) ? 0 : wkid.hashCode());
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
		SpatialReferenceDTO other = (SpatialReferenceDTO) obj;
		if (additionalProperties == null) {
			if (other.additionalProperties != null)
				return false;
		} else if (!additionalProperties.equals(other.additionalProperties))
			return false;
		if (latestWkid == null) {
			if (other.latestWkid != null)
				return false;
		} else if (!latestWkid.equals(other.latestWkid))
			return false;
		if (wkid == null) {
			if (other.wkid != null)
				return false;
		} else if (!wkid.equals(other.wkid))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SpatialReferenceDTO [wkid=" + wkid + ", latestWkid=" + latestWkid + ", additionalProperties="
				+ additionalProperties + "]";
	}

	
}

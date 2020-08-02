package com.propertyspeaks.app.data;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class AttributesDTO {

	@JsonProperty("street_num ")
	private String streetNum;
	@JsonProperty("street_dir ")
	private String streetDir;
	@JsonProperty("street_name")
	private String streetName;
	@JsonProperty("street_type ")
	private String streetType;
	@JsonProperty("description")
	private String description;
	@JsonProperty("status")
	private String status;
	@JsonProperty("date)status")
	private String dateStatus;
	@JsonProperty("parcel)id")
	private String parcelId;
	@JsonProperty("oid")
	private Integer oid;
	

	public String getStreetNum() {
	return streetNum;
	}

	public void setStreetNum(String streetNum) {
	this.streetNum = streetNum;
	}

	public String getStreetDir() {
	return streetDir;
	}

	public void setStreetDir(String streetDir) {
	this.streetDir = streetDir;
	}

	public String getStreetName() {
	return streetName;
	}

	public void setStreetName(String streetName) {
	this.streetName = streetName;
	}

	public String getStreetType() {
	return streetType;
	}

	public void setStreetType(String streetType) {
	this.streetType = streetType;
	}

	public String getDescription() {
	return description;
	}

	public void setDescription(String description) {
	this.description = description;
	}

	public String getStatus() {
	return status;
	}

	public void setStatus(String status) {
	this.status = status;
	}

	public String getDateStatus() {
	return dateStatus;
	}

	public void setDateStatus(String dateStatus) {
	this.dateStatus = dateStatus;
	}

	public String getParcelId() {
	return parcelId;
	}

	public void setParcelId(String parcelId) {
	this.parcelId = parcelId;
	}

	public Integer getOid() {
	return oid;
	}

	public void setOid(Integer oid) {
	this.oid = oid;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
	
		result = prime * result + ((dateStatus == null) ? 0 : dateStatus.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((oid == null) ? 0 : oid.hashCode());
		result = prime * result + ((parcelId == null) ? 0 : parcelId.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((streetDir == null) ? 0 : streetDir.hashCode());
		result = prime * result + ((streetName == null) ? 0 : streetName.hashCode());
		result = prime * result + ((streetNum == null) ? 0 : streetNum.hashCode());
		result = prime * result + ((streetType == null) ? 0 : streetType.hashCode());
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
		AttributesDTO other = (AttributesDTO) obj;
		
		if (dateStatus == null) {
			if (other.dateStatus != null)
				return false;
		} else if (!dateStatus.equals(other.dateStatus))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (oid == null) {
			if (other.oid != null)
				return false;
		} else if (!oid.equals(other.oid))
			return false;
		if (parcelId == null) {
			if (other.parcelId != null)
				return false;
		} else if (!parcelId.equals(other.parcelId))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (streetDir == null) {
			if (other.streetDir != null)
				return false;
		} else if (!streetDir.equals(other.streetDir))
			return false;
		if (streetName == null) {
			if (other.streetName != null)
				return false;
		} else if (!streetName.equals(other.streetName))
			return false;
		if (streetNum == null) {
			if (other.streetNum != null)
				return false;
		} else if (!streetNum.equals(other.streetNum))
			return false;
		if (streetType == null) {
			if (other.streetType != null)
				return false;
		} else if (!streetType.equals(other.streetType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AttributesDTO [streetNum=" + streetNum + ", streetDir=" + streetDir + ", streetName=" + streetName
				+ ", streetType=" + streetType + ", description=" + description + ", status=" + status + ", dateStatus="
				+ dateStatus + ", parcelId=" + parcelId + ", oid=" + oid + "]";
	}
	
	
}

package com.propertyspeaks.app.data;




public class Attributes {
	
   private String record_id;
   private String street_num;
   private String street_dir;
   private String street_name;
   private String street_type;
   private String task;
   private String status;
   private String record_status_date;
   private String parcel_id;
   private int oid;

	
   public Attributes() {};
	
  
	private GeometryDTO geometry;

	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getStreetNum() {
		return street_num;
	}
	public void setStreetNum(String streetNum) {
		this.street_num = streetNum;
	}

	public String getStreet_name() {
		return street_name;
	}
	public void setStreet_name(String street_name) {
		this.street_name = street_name;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

	public String getStreet_num() {
		return street_num;
	}
	public void setStreet_num(String street_num) {
		this.street_num = street_num;
	}
	
	
	public String getStreet_type() {
		return street_type;
	}


	public void setStreet_type(String street_type) {
		this.street_type = street_type;
	}




	public String getRecord_id() {
		return record_id;
	}




	public void setRecord_id(String record_id) {
		this.record_id = record_id;
	}




	public String getStreet_dir() {
		return street_dir;
	}




	public void setStreet_dir(String street_dir) {
		this.street_dir = street_dir;
	}




	public String getTask() {
		return task;
	}




	public void setTask(String task) {
		this.task = task;
	}




	public String getRecord_status_date() {
		return record_status_date;
	}




	public void setRecord_status_date(String record_status_date) {
		this.record_status_date = record_status_date;
	}




	public String getParcel_id() {
		return parcel_id;
	}




	public void setParcel_id(String parcel_id) {
		this.parcel_id = parcel_id;
	}
	public GeometryDTO getGeometry() {
		return geometry;
	}
	public void setGeometry(GeometryDTO geometry) {
		this.geometry = geometry;
	}


	


	
	
	
}

package com.propertyspeaks.app.data;




public class Attributes {
	
    private transient String record_id;
    
    
	private String street_num;
	
 
	private transient String street_dir;
	

	private String street_name;

   
	private String street_type;
	
  
	private transient String task;
	
    
	private String status;
	
	private  transient String record_status_date;
	
	private transient String parcel_id;
	

	private int oid;
	

	public Attributes(String record_id, String street_num, String street_dir, String street_name, String street_type,
			String task, String status, String record_status_date, String parcel_id, int oid) {
		super();
		this.record_id = record_id;
		this.street_num = street_num;
		this.street_dir = street_dir;
		this.street_name = street_name;
		this.street_type = street_type;
		this.task = task;
		this.status = status;
		this.record_status_date = record_status_date;
		this.parcel_id = parcel_id;
		this.oid = oid;
		
	}
	public String getRecord_id() {
		return record_id;
	}
	public void setRecord_id(String record_id) {
		this.record_id = record_id;
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
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public Attributes() {
	
	}
	public String getStreetNum() {
		return street_num;
	}
	public void setStreetNum(String streetNum) {
		this.street_num = streetNum;
	}
	public String getStreet_dir() {
		return street_dir;
	}
	public void setStreet_dir(String street_dir) {
		this.street_dir = street_dir;
	}
	public String getStreet_name() {
		return street_name;
	}
	public void setStreet_name(String street_name) {
		this.street_name = street_name;
	}
	public String getStreet_type() {
		return street_type;
	}
	public void setStreet_type(String street_type) {
		this.street_type = street_type;
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
	

	@Override
	public String toString() {
		return "Attributes [street_num=" + street_num + ", street_dir=" + street_dir + ", street_name=" + street_name
				+ ", street_type=" + street_type + ", status=" + status + "]";
	}
	
	
	
}

package com.propertyspeaks.app.webJson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPInputStream;

import org.springframework.cglib.beans.BulkBean;

import net.bytebuddy.asm.Advice.This;

public class StackQuery {
	private static final String BASE_URL = "https://gis.detroitmi.gov/arcgis/rest/services/OpenData/CertificateOfOccupancy/FeatureServer/0/query?";
	private static final String PARAM_WHERE="where=";
	private static final String PARAM_OUTFIELDS="&outFields=";
	private static final String PARAM_OUTSR="&outSR=";
	private static final String PARAM_F="&f=";
	private static final String PARAM_RESULTOFFSET="&resultOffset=";
	private static final String PARAM_RESULTRECORDCOUNT="&resultRecordCount";
	
	private String where = "1%3D1";
	private String outfields="*"; 
	private String outSR = "4326";
	private String f = "json";
	private String resultOffset;
	private String resultRecordCount;
	
	
	public URL buildUrl() throws MalformedURLException{
		StringBuilder urlString = new StringBuilder();
		urlString.append(BASE_URL);
		urlString.append(PARAM_WHERE).append(this.where);
		urlString.append(PARAM_OUTFIELDS).append(this.outfields);
		urlString.append(PARAM_OUTSR).append(this.outSR);
		urlString.append(PARAM_F).append(this.f);
//		urlString.append(PARAM_RESULTOFFSET).append(offset);
//		urlString.append(PARAM_RESULTRECORDCOUNT).append(recordCount);
		
		URL url = new URL(urlString.toString());
		return url;
	}
	
	public String execute() throws IOException {
		// create a URL
//		resultOffset = offset;
//		resultRecordCount = recordCount;
		URL url = buildUrl();
		
		URLConnection connection = url.openConnection();
		 InputStream in = connection.getInputStream();
		
		 if ("gzip".equals(connection.getContentEncoding())) {
				in = new GZIPInputStream(in);
			}
		  StringBuilder sb = new StringBuilder();
		  try ( BufferedReader reader = new BufferedReader(
					new InputStreamReader(in, StandardCharsets.UTF_8)) ) {
				char[] buffer = new char[2048];
	
				int size = 0;
				while ((size = reader.read(buffer)) > 0) {
		
					sb.append(buffer);
					
				}
		    
		
			}
	
	
	//get information back

	return sb.toString();
	}	 
		//connect to a server
		//need to convert InputStream bytes into text
//		    StringBuilder sb = new StringBuilder();
//		    try ( BufferedReader reader = new BufferedReader(
//					new InputStreamReader(url.openStream(), StandardCharsets.UTF_8)) ) {
//		    	char[] buffer = new char[2048];
//				int size = 0;
//				while ((size = reader.read(buffer))>0) {
//					sb.append(buffer, 0, size);
//					}
//		
//		
//		//get information back
//		
//		//return data
//		return sb.toString();
//	}
//	}

	
	public String getResultOffset() {
		return resultOffset;
	}

	public void setResultOffset(String resultOffset) {
		this.resultOffset = resultOffset;
	}

	public String getResultRecordCount() {
		return resultRecordCount;
	}

	public void setResultRecordCount(String resultRecordCount) {
		this.resultRecordCount = resultRecordCount;
	}

	public String getWhere() {
		return where;
	}
	public void setWhere(String where) {
		this.where = where;
	}
	public String getOutfields() {
		return outfields;
	}
	public void setOutfields(String outfields) {
		this.outfields = outfields;
	}
	public String getOutSR() {
		return outSR;
	}
	public void setOutSR(String outSR) {
		this.outSR = outSR;
	}
	public String getF() {
		return f;
	}
	public void setF(String f) {
		this.f = f;
	}

	
	

}

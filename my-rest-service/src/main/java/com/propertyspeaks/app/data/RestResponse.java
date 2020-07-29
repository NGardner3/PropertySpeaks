package com.propertyspeaks.app.data;

import java.util.ArrayList;

import com.helger.commons.string.StringParser;

public class RestResponse {
	private ArrayList<FeatureDTO> features;
	private SpatialReferenceDTO spatialReference;
	
	public RestResponse() {
		
	}

	public ArrayList<FeatureDTO> getFeatures() {
		return features;
	}

	public void setFeatures(ArrayList<FeatureDTO> features) {
		this.features = features;
	}

	public SpatialReferenceDTO getSpatialReference() {
		return spatialReference;
	}

	public void setSpatialReference(SpatialReferenceDTO spatialReference) {
		this.spatialReference = spatialReference;
	}
	
	

}

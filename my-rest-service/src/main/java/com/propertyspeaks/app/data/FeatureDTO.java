package com.propertyspeaks.app.data;

import java.util.Optional;

public class FeatureDTO {
	
	private Attributes attributes;
	private Optional<GeometryDTO> geometry;
	

	public FeatureDTO(Attributes attributes ,Optional<GeometryDTO> geometry2) {
		this.attributes = attributes;
		this.geometry = geometry2;
	}
	
 
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
	

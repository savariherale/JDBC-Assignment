package com.savari.entity;

public class Place {
	int Placeid;
    String placeName;
    
    public Place() {}
    
	public Place(int placeid, String placeName) {
		Placeid = placeid;
		this.placeName = placeName;
	}
	
	@Override
	public String toString() {
		return "Place [Placeid=" + Placeid + ", placeName=" + placeName + "]";
	}

	public int getPlaceid() {
		return Placeid;
	}

	public String getPlaceName() {
		return placeName;
	}
        
}

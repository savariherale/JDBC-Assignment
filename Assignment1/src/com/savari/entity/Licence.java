package com.savari.entity;

public class Licence {
	int licenceid;
    String licenceType;
    
    public Licence() {}
    
	public Licence(int licenceid, String licenceType) {
		this.licenceid = licenceid;
		this.licenceType = licenceType;
	}

	@Override
	public String toString() {
		return "Licence [licenceid=" + licenceid + ", licenceType=" + licenceType + "]";
	}

	public int getLicenceid() {
		return licenceid;
	}

	public String getLicenceType() {
		return licenceType;
	}

}

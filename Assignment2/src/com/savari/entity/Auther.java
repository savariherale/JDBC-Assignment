package com.savari.entity;

public class Auther {
	int Autherid;
    String auther_name;
    String qualification;
    
    public Auther() {}
    
	public Auther(int autherid, String auther_name, String qualification) {
		Autherid = autherid;
		this.auther_name = auther_name;
		this.qualification = qualification;
	}

	@Override
	public String toString() {
		return "Auther [Autherid=" + Autherid + ", auther_name=" + auther_name + ", qualification=" + qualification
				+ "]";
	}

	public int getAutherid() {
		return Autherid;
	}

	public String getAuther_name() {
		return auther_name;
	}

	public String getQualification() {
		return qualification;
	}

}

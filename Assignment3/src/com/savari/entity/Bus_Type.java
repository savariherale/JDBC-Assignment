package com.savari.entity;

public class Bus_Type {
	int Bus_typeid;
    String bus_type;
    
    public Bus_Type() {}
    
	public Bus_Type(int bus_typeid, String bus_type) {
		Bus_typeid = bus_typeid;
		this.bus_type = bus_type;
	}

	@Override
	public String toString() {
		return "Bus_Type [Bus_typeid=" + Bus_typeid + ", bus_type=" + bus_type + "]";
	}

	public int getBus_typeid() {
		return Bus_typeid;
	}

	public String getBus_type() {
		return bus_type;
	}

}

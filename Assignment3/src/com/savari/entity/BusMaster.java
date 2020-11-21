package com.savari.entity;

public class BusMaster {
	int BusMasterid;
	int fkbus_typeid;
    String bus_number;
    
    public BusMaster() {}
    
	public BusMaster(int busMasterid, int fkbus_typeid, String bus_number) {
		BusMasterid = busMasterid;
		this.fkbus_typeid = fkbus_typeid;
		this.bus_number = bus_number;
	}

	@Override
	public String toString() {
		return "BusMaster [BusMasterid=" + BusMasterid + ", fkbus_typeid=" + fkbus_typeid + ", bus_number=" + bus_number
				+ "]";
	}

	public int getBusMasterid() {
		return BusMasterid;
	}

	public int getFkbus_typeid() {
		return fkbus_typeid;
	}

	public String getBus_number() {
		return bus_number;
	}

}

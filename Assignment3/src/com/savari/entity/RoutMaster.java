package com.savari.entity;

public class RoutMaster {
	int Routid;
	int fkBusMasterid; 
	int fkDriverid;
	int fkplaceidFrom;
	int fkplaceidTo;
	int fkbustype;
	
	public RoutMaster() {}
	
	public RoutMaster(int routid, int fkBusMasterid, int fkDriverid, int fkplaceidFrom, int fkplaceidTo) {
		Routid = routid;
		this.fkBusMasterid = fkBusMasterid;
		this.fkDriverid = fkDriverid;
		this.fkplaceidFrom = fkplaceidFrom;
		this.fkplaceidTo = fkplaceidTo;
	}

	@Override
	public String toString() {
		return "RoutMaster [Routid=" + Routid + ", fkBusMasterid=" + fkBusMasterid + ", fkDriverid=" + fkDriverid
				+ ", fkplaceidFrom=" + fkplaceidFrom + ", fkplaceidTo=" + fkplaceidTo + "]";
	}

	public int getRoutid() {
		return Routid;
	}

	public int getFkBusMasterid() {
		return fkBusMasterid;
	}

	public int getFkDriverid() {
		return fkDriverid;
	}

	public int getFkplaceidFrom() {
		return fkplaceidFrom;
	}

	public int getFkplaceidTo() {
		return fkplaceidTo;
	}	
}

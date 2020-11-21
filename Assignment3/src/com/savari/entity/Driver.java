package com.savari.entity;

public class Driver {
	int Driverid;
    String join_Date;
    String driver_name ;
    int experience ;
    
    public Driver() {}
    
	public Driver(int driverid, String join_Date, String driver_name, int experience) {
		Driverid = driverid;
		this.join_Date = join_Date;
		this.driver_name = driver_name;
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Driver [Driverid=" + Driverid + ", join_Date=" + join_Date + ", driver_name=" + driver_name
				+ ", experience=" + experience + "]";
	}

	public int getDriverid() {
		return Driverid;
	}

	public String getJoin_Date() {
		return join_Date;
	}

	public String getDriver_name() {
		return driver_name;
	}

	public int getExperience() {
		return experience;
	}

}

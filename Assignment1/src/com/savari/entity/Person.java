package com.savari.entity;

public class Person {
	int personid;
    String person_name;
    String address; 
    String city; 
	int contactno ;
	int fklicenceid;
	
	public Person() {}

	public Person(int personid, String person_name, String address, String city, int contactno, int fklicenceid) {
		super();
		this.personid = personid;
		this.person_name = person_name;
		this.address = address;
		this.city = city;
		this.contactno = contactno;
		this.fklicenceid = fklicenceid;
	}

	@Override
	public String toString() {
		return "User [personid=" + personid + ", person_name=" + person_name + ", address=" + address + ", city=" + city
				+ ", contactno=" + contactno + ", fklicenceid=" + fklicenceid + "]";
	}

	public int getPersonid() {
		return personid;
	}

	public String getPerson_name() {
		return person_name;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public int getContactno() {
		return contactno;
	}

	public int getFklicenceid() {
		return fklicenceid;
	}

}

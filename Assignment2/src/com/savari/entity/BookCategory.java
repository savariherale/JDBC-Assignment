package com.savari.entity;

public class BookCategory {
	int Categoryid ; 
    String catagoryName ;
    
    public BookCategory() {}
    
	public BookCategory(int categoryid, String catagoryName) {
		super();
		Categoryid = categoryid;
		this.catagoryName = catagoryName;
	}
	
	@Override
	public String toString() {
		return "Auther [Categoryid=" + Categoryid + ", catagoryName=" + catagoryName + "]";
	}

	public int getCategoryid() {
		return Categoryid;
	}

	public String getCatagoryName() {
		return catagoryName;
	}
}

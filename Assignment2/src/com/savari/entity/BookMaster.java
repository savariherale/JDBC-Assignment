package com.savari.entity;

public class BookMaster {
	int Bookid;
    String record_date;
    String bookname;
    int fkcatagotyid;
    int fkauther_id;
    float price;
    
    public BookMaster() {}
    
	public BookMaster(int bookid, String record_date, String bookname, int fkcatagotyid, int fkauther_id, float price) {
		Bookid = bookid;
		this.record_date = record_date;
		this.bookname = bookname;
		this.fkcatagotyid = fkcatagotyid;
		this.fkauther_id = fkauther_id;
		this.price = price;
	}

	@Override
	public String toString() {
		return "BookMaster [Bookid=" + Bookid + ", record_date=" + record_date + ", bookname=" + bookname
				+ ", fkcatagotyid=" + fkcatagotyid + ", fkauther_id=" + fkauther_id + ", price=" + price + "]";
	}

	public int getBookid() {
		return Bookid;
	}

	public String getRecord_date() {
		return record_date;
	}

	public String getBookname() {
		return bookname;
	}

	public int getFkcatagotyid() {
		return fkcatagotyid;
	}

	public int getFkauther_id() {
		return fkauther_id;
	}

	public float getPrice() {
		return price;
	}

}

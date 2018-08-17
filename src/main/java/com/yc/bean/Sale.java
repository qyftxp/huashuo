package com.yc.bean;

public class Sale {
	private int Sid ;
	private String Sname ;
	private int Sstatus ;
	
	
	
	
	
	
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public int getSstatus() {
		return Sstatus;
	}
	public void setSstatus(int sstatus) {
		Sstatus = sstatus;
	}
	@Override
	public String toString() {
		return "Sale [Sid=" + Sid + ", Sname=" + Sname + ", Sstatus=" + Sstatus + "]";
	}
	
	
}

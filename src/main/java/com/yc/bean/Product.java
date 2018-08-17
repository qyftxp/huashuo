package com.yc.bean;

import java.io.Serializable;

public class Product implements Serializable {
	private static final long serialVersionUID = -197123173441739350L;
	private Integer Pid;
	private Integer Tid;
	private Integer Seid;
	private String Pname;
	private String Pdetails;
	private String Pparameter;
	private Double Pprice;
	private Integer Pcount;
	private Integer Pstatus;

	public Integer getPid() {
		return Pid;
	}

	public void setPid(Integer pid) {
		Pid = pid;
	}

	public Integer getTid() {
		return Tid;
	}

	public void setTid(Integer tid) {
		Tid = tid;
	}

	public Integer getSeid() {
		return Seid;
	}

	public void setSeid(Integer seid) {
		Seid = seid;
	}

	public String getPname() {
		return Pname;
	}

	public void setPname(String pname) {
		Pname = pname;
	}

	public String getPdetails() {
		return Pdetails;
	}

	public void setPdetails(String pdetails) {
		Pdetails = pdetails;
	}

	public String getPparameter() {
		return Pparameter;
	}

	public void setPparameter(String pparameter) {
		Pparameter = pparameter;
	}

	public Double getPprice() {
		return Pprice;
	}

	public void setPprice(Double pprice) {
		Pprice = pprice;
	}

	public Integer getPcount() {
		return Pcount;
	}

	public void setPcount(Integer pcount) {
		Pcount = pcount;
	}

	public Integer getPstatus() {
		return Pstatus;
	}

	public void setPstatus(Integer pstatus) {
		Pstatus = pstatus;
	}

	@Override
	public String toString() {
		return "Product [Pid=" + Pid + ", Tid=" + Tid + ", Seid=" + Seid
				+ ", Pname=" + Pname + ", Pdetails=" + Pdetails
				+ ", Pparameter=" + Pparameter + ", Pprice=" + Pprice
				+ ", Pcount=" + Pcount + ", Pstatus=" + Pstatus + "]";
	}
}

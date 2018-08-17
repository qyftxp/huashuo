package com.yc.bean;

import java.io.Serializable;
import java.util.Date;

public class Bill implements Serializable {
	private static final long serialVersionUID = -5769715334668557L;
	private String Bid;
	private Integer Cid;
	private Date Btime;
	private Double Btotalprice;
	private Integer Btotalsize;

	public String getBid() {
		return Bid;
	}

	public void setBid(String bid) {
		Bid = bid;
	}

	public Integer getCid() {
		return Cid;
	}

	public void setCid(Integer cid) {
		Cid = cid;
	}

	public Date getBtime() {
		return Btime;
	}

	public void setBtime(Date btime) {
		Btime = btime;
	}

	public Double getBtotalprice() {
		return Btotalprice;
	}

	public void setBtotalprice(Double btotalprice) {
		Btotalprice = btotalprice;
	}

	public Integer getBtotalsize() {
		return Btotalsize;
	}

	public void setBtotalsize(Integer btotalsize) {
		Btotalsize = btotalsize;
	}

	@Override
	public String toString() {
		return "Bill [Bid=" + Bid + ", Cid=" + Cid + ", Btime=" + Btime
				+ ", Btotalprice=" + Btotalprice + ", Btotalsize=" + Btotalsize
				+ "]";
	}
}

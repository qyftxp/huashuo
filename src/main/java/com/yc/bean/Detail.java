package com.yc.bean;

import java.io.Serializable;

public class Detail implements Serializable {
	private static final long serialVersionUID = 7560257365556383683L;
	private String Did;
	private String Bid;
	private Integer Pid;
	private Integer Dcount;
	private Double Dprice;

	public String getDid() {
		return Did;
	}

	public void setDid(String did) {
		Did = did;
	}

	public String getBid() {
		return Bid;
	}

	public void setBid(String bid) {
		Bid = bid;
	}

	public Integer getPid() {
		return Pid;
	}

	public void setPid(Integer pid) {
		Pid = pid;
	}

	public Integer getDcount() {
		return Dcount;
	}

	public void setDcount(Integer dcount) {
		Dcount = dcount;
	}

	public Double getDprice() {
		return Dprice;
	}

	public void setDprice(Double dprice) {
		Dprice = dprice;
	}

	@Override
	public String toString() {
		return "Detail [Did=" + Did + ", Bid=" + Bid + ", Pid=" + Pid
				+ ", Dcount=" + Dcount + ", Dprice=" + Dprice + "]";
	}
}

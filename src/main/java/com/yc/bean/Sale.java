package com.yc.bean;

import java.io.Serializable;

public class Sale implements Serializable {
	private static final long serialVersionUID = -8077946737245970258L;
	private Integer Sid;
	private String Sname;
	private Integer Sstatus;

	public Integer getSid() {
		return Sid;
	}

	public void setSid(Integer sid) {
		Sid = sid;
	}

	public String getSname() {
		return Sname;
	}

	public void setSname(String sname) {
		Sname = sname;
	}

	public Integer getSstatus() {
		return Sstatus;
	}

	public void setSstatus(Integer sstatus) {
		Sstatus = sstatus;
	}

	@Override
	public String toString() {
		return "Sale [Sid=" + Sid + ", Sname=" + Sname + ", Sstatus=" + Sstatus
				+ "]";
	}
}

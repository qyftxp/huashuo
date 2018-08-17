package com.yc.bean;

import java.io.Serializable;

public class Type implements Serializable{
	private static final long serialVersionUID = 7980563819083544716L;
	private Integer Tid;
	private Integer Sid;
	private String Tname;
	private Integer Tstatus;

	public Integer getTid() {
		return Tid;
	}

	public void setTid(Integer tid) {
		Tid = tid;
	}

	public Integer getSid() {
		return Sid;
	}

	public void setSid(Integer sid) {
		Sid = sid;
	}

	public String getTname() {
		return Tname;
	}

	public void setTname(String tname) {
		Tname = tname;
	}

	public Integer getTstatus() {
		return Tstatus;
	}

	public void setTstatus(Integer tstatus) {
		Tstatus = tstatus;
	}

	@Override
	public String toString() {
		return "Type [Tid=" + Tid + ", Sid=" + Sid + ", Tname=" + Tname
				+ ", Tstatus=" + Tstatus + "]";
	}
}

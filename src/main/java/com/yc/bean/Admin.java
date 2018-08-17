package com.yc.bean;

import java.io.Serializable;

public class Admin implements Serializable {
	private static final long serialVersionUID = 371525309521087732L;
	private Integer Aid;
	private String Aname;
	private String Apwd;

	public Integer getAid() {
		return Aid;
	}

	public void setAid(Integer aid) {
		Aid = aid;
	}

	public String getAname() {
		return Aname;
	}

	public void setAname(String aname) {
		Aname = aname;
	}

	public String getApwd() {
		return Apwd;
	}

	public void setApwd(String apwd) {
		Apwd = apwd;
	}

	@Override
	public String toString() {
		return "Admin [Aid=" + Aid + ", Aname=" + Aname + ", Apwd=" + Apwd
				+ "]";
	}
}

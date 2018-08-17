package com.yc.bean;

import java.io.Serializable;

public class Operator implements Serializable {
	private static final long serialVersionUID = 580890132314580004L;
	private Integer Oid;
	private String Oname;
	private String Opwd;

	public Integer getOid() {
		return Oid;
	}

	public void setOid(Integer oid) {
		Oid = oid;
	}

	public String getOname() {
		return Oname;
	}

	public void setOname(String oname) {
		Oname = oname;
	}

	public String getOpwd() {
		return Opwd;
	}

	public void setOpwd(String opwd) {
		Opwd = opwd;
	}

	@Override
	public String toString() {
		return "Operator [Oid=" + Oid + ", Oname=" + Oname + ", Opwd=" + Opwd
				+ "]";
	}
}

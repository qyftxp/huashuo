package com.yc.bean;

import java.io.Serializable;

public class Series implements Serializable {
	private static final long serialVersionUID = -2143473694925412850L;
	private Integer Seid;
	private Integer Tid;
	private String Sename;
	private Integer Sestatus;

	public Integer getSeid() {
		return Seid;
	}

	public void setSeid(Integer seid) {
		Seid = seid;
	}

	public Integer getTid() {
		return Tid;
	}

	public void setTid(Integer tid) {
		Tid = tid;
	}

	public String getSename() {
		return Sename;
	}

	public void setSename(String sename) {
		Sename = sename;
	}

	public Integer getSestatus() {
		return Sestatus;
	}

	public void setSestatus(Integer sestatus) {
		Sestatus = sestatus;
	}

	@Override
	public String toString() {
		return "Series [Seid=" + Seid + ", Tid=" + Tid + ", Sename=" + Sename
				+ ", Sestatus=" + Sestatus + "]";
	}
}

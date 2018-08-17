package com.yc.bean;

import java.io.Serializable;
import java.util.Date;

public class Customer implements Serializable {
	private static final long serialVersionUID = -7768033346974053310L;
	private Integer Cid;
	private String Cname;
	private String Cpwd;
	private String Ctel;
	private Date Cbirthday;

	public Integer getCid() {
		return Cid;
	}

	public void setCid(Integer cid) {
		Cid = cid;
	}

	public String getCname() {
		return Cname;
	}

	public void setCname(String cname) {
		Cname = cname;
	}

	public String getCpwd() {
		return Cpwd;
	}

	public void setCpwd(String cpwd) {
		Cpwd = cpwd;
	}

	public String getCtel() {
		return Ctel;
	}

	public void setCtel(String ctel) {
		Ctel = ctel;
	}

	public Date getCbirthday() {
		return Cbirthday;
	}

	public void setCbirthday(Date cbirthday) {
		Cbirthday = cbirthday;
	}

	@Override
	public String toString() {
		return "Customer [Cid=" + Cid + ", Cname=" + Cname + ", Cpwd=" + Cpwd
				+ ", Ctel=" + Ctel + ", Cbirthday=" + Cbirthday + "]";
	}
}

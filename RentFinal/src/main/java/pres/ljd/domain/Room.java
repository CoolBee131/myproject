package pres.ljd.domain;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Room implements Serializable{
	private Integer id ;
	private String rname ;
	private String tenant ;
	private Integer phonenum ;
	private Date checkindate ;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public String getTenant() {
		return tenant;
	}

	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

	public Integer getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(Integer phonenum) {
		this.phonenum = phonenum;
	}

	public Date getCheckindate() {
		return checkindate;
	}

	public void setCheckindate(Date checkindate) {
		this.checkindate = checkindate;
	}

	@Override
	public String toString() {
		return "Room{" +
				"id=" + id +
				", rname='" + rname + '\'' +
				", tenant='" + tenant + '\'' +
				", phonenum=" + phonenum +
				", checkindate=" + checkindate +
				'}';
	}
}

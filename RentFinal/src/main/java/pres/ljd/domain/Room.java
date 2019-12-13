package pres.ljd.domain;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Room implements Serializable{
	private Integer id ;
	private String rname ;
	private String tenant ;
	private String phonenum ;
	private Date date ;

	public Room() {}

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

	public String getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Room{" +
				"id=" + id +
				", rname='" + rname + '\'' +
				", tenant='" + tenant + '\'' +
				", phonenum=" + phonenum +
				", date=" + date +
				'}';
	}
}

package pres.ljd.domain;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class MonthRent implements Serializable {
	private Integer rid ;
	private Date month ;
	private Double rent ;
	private Integer wpn ;
	private Integer epn ;
	private Date date ;

	public MonthRent() {}
	public MonthRent(Integer rid, Date month, Double rent, Integer wpn, Integer epn, Date date) {
		this.rid = rid ;
		this.month =  month ;
		this.rent = rent ;
		this.wpn = wpn ;
		this.epn = epn ;
		this.date = date ;
	}

	public Integer getRid() {
		return rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	public Date getMonth() {
		return month;
	}

	public void setMonth(Date month) {
		this.month = month;
	}

	public Double getRent() {
		return rent;
	}

	public void setRent(Double rent) {
		this.rent = rent;
	}

	public Integer getWpn() {
		return wpn;
	}

	public void setWpn(Integer wpn) {
		this.wpn = wpn;
	}

	public Integer getEpn() {
		return epn;
	}

	public void setEpn(Integer epn) {
		this.epn = epn;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "MonthRentService{" +
				"month=" + month +
				", rent=" + rent +
				", wpn=" + wpn +
				", epn=" + epn +
				", date=" + date +
				'}';
	}
}

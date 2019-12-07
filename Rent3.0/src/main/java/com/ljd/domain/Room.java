package com.ljd.domain;


import java.util.List;

public class Room {
    private Integer id ;
    private String rname ;
    private String tenant ;
    private Integer phonenum ;
    private List<MonthRent> monthRents ;

    public Room() {}

    public Room(Integer id , String rname , String tenant , Integer phonenum) {
        this.id = id ;
        this.rname = rname ;
        this.tenant = tenant ;
        this.phonenum = phonenum ;

    }
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

    public List<MonthRent> getMonthRents() {
        return monthRents;
    }

    public void setMonthRents(List<MonthRent> monthRents) {
        this.monthRents = monthRents;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", rname='" + rname + '\'' +
                ", tenant='" + tenant + '\'' +
                ", phonenum=" + phonenum +
                '}';
    }
}

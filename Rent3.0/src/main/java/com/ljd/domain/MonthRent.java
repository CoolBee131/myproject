package com.ljd.domain;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class MonthRent {
    private Integer id ;
    private Integer rid ;
    private Date month ;
    private Double rent ;
    private Integer wpn ;
    private Integer epn ;
    private Room room ;

    public MonthRent(){}
    public MonthRent(Integer id , Integer rid , Date month , Double rent , Integer wpn , Integer epn){
        this.id = id ;
        this.rid = rid ;
        this.rent = rent ;
        this.month = month ;
        this.wpn = wpn ;
        this.epn = epn ;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "MonthRent{" +
                "id=" + id +
                ", month=" + new SimpleDateFormat("yyyy-MM").format(month) +
                ", rent=" + rent +
                ", wpn=" + wpn +
                ", epn=" + epn +
                '}';
    }
}

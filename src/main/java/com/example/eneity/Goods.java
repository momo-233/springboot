package com.example.eneity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Goods)实体类
 *
 * @author long
 * @since 2022-03-28 14:28:13
 */
public class Goods implements Serializable {
    private static final long serialVersionUID = -87555338846040546L;

    private Integer gdid;
    private Integer tid;
    private String gdcode;
    private String gdname;
    private Object gdprice;
    private Integer gdquantity;
    private Integer gdsaleqty;
    private String gdcity;
    private Object gdinfo;
    private Date gdaddtime;
    private Object gdhot;
    private String gdimage;

    private Goodstype goodstype;

    public Goodstype getGoodstype() {
        return goodstype;
    }

    public void setGoodstype(Goodstype goodstype) {
        this.goodstype = goodstype;
    }

    public Integer getGdid() {
        return gdid;
    }

    public void setGdid(Integer gdid) {
        this.gdid = gdid;
    }


    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }


    public String getGdcode() {
        return gdcode;
    }

    public void setGdcode(String gdcode) {
        this.gdcode = gdcode;
    }


    public String getGdname() {
        return gdname;
    }

    public void setGdname(String gdname) {
        this.gdname = gdname;
    }


    public Object getGdprice() {
        return gdprice;
    }

    public void setGdprice(Object gdprice) {
        this.gdprice = gdprice;
    }


    public Integer getGdquantity() {
        return gdquantity;
    }

    public void setGdquantity(Integer gdquantity) {
        this.gdquantity = gdquantity;
    }


    public Integer getGdsaleqty() {
        return gdsaleqty;
    }

    public void setGdsaleqty(Integer gdsaleqty) {
        this.gdsaleqty = gdsaleqty;
    }


    public String getGdcity() {
        return gdcity;
    }

    public void setGdcity(String gdcity) {
        this.gdcity = gdcity;
    }


    public Object getGdinfo() {
        return gdinfo;
    }

    public void setGdinfo(Object gdinfo) {
        this.gdinfo = gdinfo;
    }


    public Date getGdaddtime() {
        return gdaddtime;
    }

    public void setGdaddtime(Date gdaddtime) {
        this.gdaddtime = gdaddtime;
    }


    public Object getGdhot() {
        return gdhot;
    }

    public void setGdhot(Object gdhot) {
        this.gdhot = gdhot;
    }


    public String getGdimage() {
        return gdimage;
    }

    public void setGdimage(String gdimage) {
        this.gdimage = gdimage;
    }

    @Override
    public String toString() {
    
        return "Goods{" +
                 "gdid=" + gdid+","+     
                 "tid=" + tid+","+     
                 "gdcode='" + gdcode +"'"+","+     
                 "gdname='" + gdname +"'"+","+     
                 "gdprice=" + gdprice+","+     
                 "gdquantity=" + gdquantity+","+     
                 "gdsaleqty=" + gdsaleqty+","+     
                 "gdcity='" + gdcity +"'"+","+     
                 "gdinfo=" + gdinfo+","+     
                 "gdaddtime=" + gdaddtime+","+     
                 "gdhot=" + gdhot+","+     
                 "gdimage='" + gdimage +"'"     
              +"}"; 
    }

}
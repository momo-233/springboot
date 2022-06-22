package com.example.eneity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.io.Serializable;

/**
 * (Orderdetail)实体类
 *
 * @author long
 * @since 2022-05-24 18:29:16
 */
public class Orderdetail implements Serializable {
    private static final long serialVersionUID = 934916071857437805L;

    private Integer odid;
    private Integer oid;
    private Integer gdid;
    private Integer odnum;
    private String devalution;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date odtime;

    private Goods goods;

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public Integer getOdid() {
        return odid;
    }

    public void setOdid(Integer odid) {
        this.odid = odid;
    }


    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }


    public Integer getGdid() {
        return gdid;
    }

    public void setGdid(Integer gdid) {
        this.gdid = gdid;
    }


    public Integer getOdnum() {
        return odnum;
    }

    public void setOdnum(Integer odnum) {
        this.odnum = odnum;
    }


    public String getDevalution() {
        return devalution;
    }

    public void setDevalution(String devalution) {
        this.devalution = devalution;
    }


    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    public Date getOdtime() {
        return odtime;
    }

    public void setOdtime(Date odtime) {
        this.odtime = odtime;
    }

    @Override
    public String toString() {
    
        return "Orderdetail{" +
                 "odid=" + odid+","+     
                 "oid=" + oid+","+     
                 "gdid=" + gdid+","+     
                 "odnum=" + odnum+","+     
                 "devalution='" + devalution +"'"+","+     
                 "odtime=" + odtime     
              +"}"; 
    }

}
package com.example.eneity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.io.Serializable;

/**
 * (Adminuser)实体类
 *
 * @author long
 * @since 2022-05-24 20:35:21
 */
public class Adminuser implements Serializable {
    private static final long serialVersionUID = -80348957913173783L;

    private Integer aduid;
    private String aduname;
    private String adupwd;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date adlogintime;


    public Integer getAduid() {
        return aduid;
    }

    public void setAduid(Integer aduid) {
        this.aduid = aduid;
    }


    public String getAduname() {
        return aduname;
    }

    public void setAduname(String aduname) {
        this.aduname = aduname;
    }


    public String getAdupwd() {
        return adupwd;
    }

    public void setAdupwd(String adupwd) {
        this.adupwd = adupwd;
    }


    public Date getAdlogintime() {
        return adlogintime;
    }

    public void setAdlogintime(Date adlogintime) {
        this.adlogintime = adlogintime;
    }

    @Override
    public String toString() {
    
        return "Adminuser{" +
                 "aduid=" + aduid+","+     
                 "aduname='" + aduname +"'"+","+     
                 "adupwd='" + adupwd +"'"+","+     
                 "adlogintime=" + adlogintime     
              +"}"; 
    }

}
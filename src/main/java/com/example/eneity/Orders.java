package com.example.eneity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.io.Serializable;

/**
 * (Orders)实体类
 *
 * @author long
 * @since 2022-05-23 21:12:44
 */
public class Orders implements Serializable {
    private static final long serialVersionUID = -57036715713077538L;

    private Integer oid;
    private Integer uid;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date otime;
    private Object ototal;

    private Users users;

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }


    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }


    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    public Date getOtime() {
        return otime;
    }

    public void setOtime(Date otime) {
        this.otime = otime;
    }


    public Object getOtotal() {
        return ototal;
    }

    public void setOtotal(Object ototal) {
        this.ototal = ototal;
    }

    @Override
    public String toString() {
    
        return "Orders{" +
                 "oid=" + oid+","+     
                 "uid=" + uid+","+     
                 "otime=" + otime+","+     
                 "ototal=" + ototal     
              +"}"; 
    }

}
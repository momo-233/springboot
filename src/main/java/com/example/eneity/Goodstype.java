package com.example.eneity;

import java.io.Serializable;

/**
 * (Goodstype)实体类
 *
 * @author long
 * @since 2022-04-04 14:36:14
 */
public class Goodstype implements Serializable {
    private static final long serialVersionUID = 849370134430325500L;

    private Integer tid;
    private String tname;


    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }


    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    @Override
    public String toString() {
    
        return "Goodstype{" +
                 "tid=" + tid+","+     
                 "tname='" + tname +"'"     
              +"}"; 
    }

}
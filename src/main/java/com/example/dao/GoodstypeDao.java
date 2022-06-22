package com.example.dao;

import com.example.eneity.Goodstype;
import io.swagger.annotations.Api;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

@Mapper
public interface GoodstypeDao {

    @Select("select * from goodstype where tid = #{tid}")
    Goodstype queryBytID(Integer tid);


    @Select("select * from goodstype")
    ArrayList<Goodstype> queryAll(Goodstype goodstype);


    @Delete("delete from goodstype where tid = #{id}")
    int deleteById(Integer id);


    @Update("UPDATE goodstype SET " +
            "tName = #{goodstype.tname}" +
            "WHERE tID = #{goodstype.tid}")
    int update(@Param("goodstype") Goodstype goodstype);


    @Insert("INSERT INTO goodstype(tname)" +
            "VALUES" +
            "(#{goodstype.tname})")
    int insert(@Param("goodstype") Goodstype goodstype);
}

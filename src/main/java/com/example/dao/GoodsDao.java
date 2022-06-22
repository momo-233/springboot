package com.example.dao;

import com.example.eneity.Goods;
import com.example.eneity.Goodstype;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

@Mapper
public interface GoodsDao {

    @Results({
            @Result(column = "tID",property = "goodstype",javaType = Goodstype.class,
                    one = @One(select = "com.example.dao.GoodstypeDao.queryBytID"))
    })
    @Select("select * from goods")
    ArrayList<Goods> queryAll();

    @Delete("delete from goods where gdID = #{id}")
    int deleteByID(Integer id);

    @Select("select * from goods where gdID = #{id}")
    Goods findById(Integer id);

    @Update("UPDATE goods SET " +
            "tId = #{goods.tid}," +
            "gdCode = #{goods.gdcode}, " +
            "gdName = #{goods.gdname}," +
            "gdPrice = #{goods.gdprice}," +
            "gdQuantity = #{goods.gdquantity}, " +
            "gdCity = #{goods.gdcity}, " +
            "gdInfo = #{goods.gdinfo}, " +
            "gdHot =  #{goods.gdhot} " +
            "WHERE gdID =  #{goods.gdid}")
    int update(@Param("goods") Goods goods);

    /*
    *INSERT INTO table_name
      ( field1, field2,...fieldN )
      VALUES
      ( value1, value2,...valueN );
    */

    @Insert("INSERT INTO goods(tid,gdcode,gdname,gdprice,gdquantity,gdcity,gdinfo,gdhot) " +
            "VALUES " +
            "(#{goods.tid},#{goods.gdcode},#{goods.gdname},#{goods.gdprice},#{goods.gdquantity},#{goods.gdcity},#{goods.gdinfo},#{goods.gdhot})")
    int addGoods(@Param("goods") Goods goods);

}

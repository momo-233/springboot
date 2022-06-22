package com.example.dao;

import com.example.eneity.Goods;
import com.example.eneity.Users;
import org.apache.ibatis.annotations.*;
import java.util.ArrayList;
import java.util.List;

@Mapper
public interface UsersDao {

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    Users queryById(Integer uid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Users> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param users 实例对象
     * @return 对象列表
     */
    List<Users> queryAll(Users users);

    /**
     * 新增数据
     *
     * @param users 实例对象
     * @return 影响行数
     */
    int insert(Users users);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Users> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Users> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Users> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Users> entities);

    /**
     * 修改数据
     *
     * @param users 实例对象
     * @return 影响行数
     */
    int update(Users users);

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 影响行数
     */
    int deleteById(Integer uid);



    // @Insert("INSERT INTO users(uname,upwd,usex,ubirth,ucity,uphone,uemail,uqq,ucredit) " +
    //         "VALUES " +
    //         "(#{users.uname},#{users.upwd},#{users.usex},#{users.ubirth},#{users.ucity},#{users.uphone},#{users.uemail},#{users.uqq},#{users.ucredit})")
    // int addUsers(@Param("users") Users users);
    //
    // @Delete("delete from users where uID = #{id}")
    // int deleteByID(Integer id);
    //
    // @Update("UPDATE users SET " +
    //         "uName = #{users.uname}," +
    //         "uPwd = #{users.upwd}, " +
    //         "uSex = #{users.usex}," +
    //         "uBirth = #{users.ubirth}," +
    //         "uCity = #{users.ucity}, " +
    //         "uPhone = #{users.uphone}, " +
    //         "uEmail = #{users.uemail}, " +
    //         "uQQ = #{users.uqq} " +
    //         "uCredit = #{users.ucredit} " +
    //         "WHERE gdID =  #{users.gdid}")
    // int update(@Param("users") Users users);
    //
    // @Select("select * from users")
    // ArrayList<Users> queryAll();
    //
    // @Select("select * from users where uID = #{id}")
    // Users findById(Integer id);
}

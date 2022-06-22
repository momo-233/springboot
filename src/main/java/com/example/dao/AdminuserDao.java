package com.example.dao;

import com.example.eneity.Adminuser;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
/**
 * (Adminuser)表数据库访问层
 *
 * @author long
 * @since 2022-05-24 19:31:10
 */
@Mapper
public interface AdminuserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param aduid 主键
     * @return 实例对象
     */
    Adminuser queryById(Integer aduid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Adminuser> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param adminuser 实例对象
     * @return 对象列表
     */
    List<Adminuser> queryAll(Adminuser adminuser);

    /**
     * 新增数据
     *
     * @param adminuser 实例对象
     * @return 影响行数
     */
    int insert(Adminuser adminuser);

    /**
     * 修改数据
     *
     * @param adminuser 实例对象
     * @return 影响行数
     */
    int update(Adminuser adminuser);

    /**
     * 通过主键删除数据
     *
     * @param aduid 主键
     * @return 影响行数
     */
    int deleteById(Integer aduid);

}
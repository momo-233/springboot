package com.example.service;


import com.example.eneity.Adminuser;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * (Adminuser)表服务接口
 *
 * @author long
 * @since 2022-05-24 19:31:10
 */
public interface AdminuserService {

    /**
     * 通过ID查询单条数据
     *
     * @param aduid 主键
     * @return 实例对象
     */
    Adminuser queryById(Integer aduid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Adminuser> queryAllByLimit(int offset, int limit);

    /**
     * 通过实体作为筛选条件查询
     *
     * @return 对象列表
     */
    PageInfo<Adminuser> queryAll(Integer pageNum, Integer pageSize);

    List<Adminuser> query(Adminuser adminuser);
    /**
     * 新增数据
     *
     * @param adminuser 实例对象
     * @return 实例对象
     */
    Adminuser insert(Adminuser adminuser);

    /**
     * 修改数据
     *
     * @param adminuser 实例对象
     * @return 实例对象
     */
    Adminuser update(Adminuser adminuser);

    /**
     * 通过主键删除数据
     *
     * @param aduid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer aduid);


}
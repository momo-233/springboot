package com.example.service;

import com.example.eneity.Orders;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * (Orders)表服务接口
 *
 * @author long
 * @since 2022-05-23 21:12:44
 */
public interface OrdersService {

    /**
     * 通过ID查询单条数据
     *
     * @param oid 主键
     * @return 实例对象
     */
    Orders queryById(Integer oid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Orders> queryAllByLimit(int offset, int limit);
    
    /**
     * 通过实体作为筛选条件查询
     *
     * @return 对象列表
     */
    PageInfo<Orders> queryAll(Integer pageNum, Integer pageSize);
    /**
     * 新增数据
     *
     * @param orders 实例对象
     * @return 实例对象
     */
    Orders insert(Orders orders);

    /**
     * 修改数据
     *
     * @param orders 实例对象
     * @return 实例对象
     */
    Orders update(Orders orders);

    /**
     * 通过主键删除数据
     *
     * @param oid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer oid);
    
    
}
package com.example.service;

import com.example.eneity.Orderdetail;
import java.util.List;

/**
 * (Orderdetail)表服务接口
 *
 * @author long
 * @since 2022-05-24 18:29:16
 */
public interface OrderdetailService {

    /**
     * 通过ID查询单条数据
     *
     * @param odid 主键
     * @return 实例对象
     */
    Orderdetail queryById(Integer odid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Orderdetail> queryAllByLimit(int offset, int limit);
    
    /**
     * 通过实体作为筛选条件查询
     * @param orderdetail 实体
     * @return 对象列表
     */
    List<Orderdetail> queryAll(Orderdetail orderdetail);
    /**
     * 新增数据
     *
     * @param orderdetail 实例对象
     * @return 实例对象
     */
    Orderdetail insert(Orderdetail orderdetail);

    /**
     * 修改数据
     *
     * @param orderdetail 实例对象
     * @return 实例对象
     */
    Orderdetail update(Orderdetail orderdetail);

    /**
     * 通过主键删除数据
     *
     * @param odid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer odid);
    
    
}
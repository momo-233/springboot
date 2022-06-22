package com.example.service.impl;

import com.example.eneity.Orderdetail;
import com.example.dao.OrderdetailDao;
import com.example.service.OrderdetailService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * (Orderdetail)表服务实现类
 *
 * @author long
 * @since 2022-05-24 18:29:16
 */
@Service("orderdetailService")
public class OrderdetailServiceImpl implements OrderdetailService {
    @Resource
    private OrderdetailDao orderdetailDao;

    /**
     * 通过ID查询单条数据
     *
     * @param odid 主键
     * @return 实例对象
     */
    @Override
    public Orderdetail queryById(Integer odid) {
        return this.orderdetailDao.queryById(odid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Orderdetail> queryAllByLimit(int offset, int limit) {
        return this.orderdetailDao.queryAllByLimit(offset, limit);
    }
    /**
     * 通过实体作为筛选条件查询
     * @param orderdetail 实体
     * @return 对象列表
     */
    @Override
    public List<Orderdetail> queryAll(Orderdetail orderdetail) {
        return this.orderdetailDao.queryAll(orderdetail);
    }

    /**
     * 新增数据
     *
     * @param orderdetail 实例对象
     * @return 实例对象
     */
    @Override
    public Orderdetail insert(Orderdetail orderdetail) {
                
        this.orderdetailDao.insert(orderdetail);
        return orderdetail;
    }

    /**
     * 修改数据
     *
     * @param orderdetail 实例对象
     * @return 实例对象
     */
    @Override
    public Orderdetail update(Orderdetail orderdetail) {
        this.orderdetailDao.update(orderdetail);
        return this.queryById(orderdetail.getOdid());
    }

    /**
     * 通过主键删除数据
     *
     * @param odid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer odid) {
        return this.orderdetailDao.deleteById(odid) > 0;
    }
    
    }
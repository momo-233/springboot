package com.example.service.impl;

import com.example.dao.AdminuserDao;
import com.example.eneity.Adminuser;
import com.example.service.AdminuserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * (Adminuser)表服务实现类
 *
 * @author long
 * @since 2022-05-24 19:31:10
 */
@Service("adminuserService")
public class AdminuserServiceImpl implements AdminuserService {
    @Resource
    private AdminuserDao adminuserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param aduid 主键
     * @return 实例对象
     */
    @Override
    public Adminuser queryById(Integer aduid) {
        return this.adminuserDao.queryById(aduid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Adminuser> queryAllByLimit(int offset, int limit) {
        return this.adminuserDao.queryAllByLimit(offset, limit);
    }
    /**
     * 通过实体作为筛选条件查询
     *
     * @return 对象列表
     */
    @Override
    public PageInfo<Adminuser> queryAll(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        Adminuser adminuser = new Adminuser();
        List<Adminuser> list = adminuserDao.queryAll(adminuser);

        PageInfo<Adminuser> pageInfo = new PageInfo<>(list);

        return pageInfo;
    }


    @Override
    public List<Adminuser> query(Adminuser adminuser) {
        return adminuserDao.queryAll(adminuser);
    }

    /**
     * 新增数据
     *
     * @param adminuser 实例对象
     * @return 实例对象
     */
    @Override
    public Adminuser insert(Adminuser adminuser) {

        this.adminuserDao.insert(adminuser);
        return adminuser;
    }

    /**
     * 修改数据
     *
     * @param adminuser 实例对象
     * @return 实例对象
     */
    @Override
    public Adminuser update(Adminuser adminuser) {
        this.adminuserDao.update(adminuser);
        return this.queryById(adminuser.getAduid());
    }

    /**
     * 通过主键删除数据
     *
     * @param aduid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer aduid) {
        return this.adminuserDao.deleteById(aduid) > 0;
    }

    }
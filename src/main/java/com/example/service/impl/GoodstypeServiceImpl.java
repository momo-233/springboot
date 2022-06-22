package com.example.service.impl;

import com.example.dao.GoodstypeDao;
import com.example.eneity.Goodstype;
import com.example.eneity.Users;
import com.example.service.GoodstypeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class GoodstypeServiceImpl implements GoodstypeService {
    @Resource
    GoodstypeDao goodstypeDao;

    @Override
    public ArrayList<Goodstype> query() {
        Goodstype goodstype = new Goodstype();
        return goodstypeDao.queryAll(goodstype);
    }

    @Override
    public PageInfo<Goodstype> queryAll(Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        Goodstype goodstype = new Goodstype();
        List<Goodstype> list = goodstypeDao.queryAll(goodstype);

        PageInfo<Goodstype> pageInfo = new PageInfo<>(list);

        return pageInfo;
    }

    @Override
    public Goodstype queryBytID(Integer tid) {
        return goodstypeDao.queryBytID(tid);
    }

    @Override
    public int deleteById(Integer id) {
        return goodstypeDao.deleteById(id);
    }

    @Override
    public int update(Goodstype goodstype) {
        return goodstypeDao.update(goodstype);
    }

    @Override
    public int insert(Goodstype goodstype) {
        return goodstypeDao.insert(goodstype);
    }
}

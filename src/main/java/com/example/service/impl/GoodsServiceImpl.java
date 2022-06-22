package com.example.service.impl;

import com.example.dao.GoodsDao;
import com.example.eneity.Goods;
import com.example.service.GoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.CacheNamespace;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Resource
    GoodsDao goodsDao;

    @Cacheable(cacheNames = "goods")
    @Override
    public PageInfo<Goods> queryAll(Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Goods> list = goodsDao.queryAll();
        PageInfo<Goods> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public int deleteByID(Integer id) {
        return goodsDao.deleteByID(id);
    }

    @Override
    public Goods findById(Integer id) {
        return goodsDao.findById(id);
    }

    @Override
    public int update(Goods goods) {
        return goodsDao.update(goods);
    }

    @Override
    public int addGoods(Goods goods) {
        return goodsDao.addGoods(goods);
    }

}


package com.example.service;

import com.example.eneity.Goods;
import com.github.pagehelper.PageInfo;

import java.util.ArrayList;

public interface GoodsService {
    PageInfo<Goods> queryAll(Integer pageNum,Integer pageSize);

    int deleteByID(Integer id);

    Goods findById(Integer id);

    int update(Goods goods);

    int addGoods(Goods goods);
}

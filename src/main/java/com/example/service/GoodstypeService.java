package com.example.service;

import com.example.eneity.Goodstype;
import com.github.pagehelper.PageInfo;

import java.util.ArrayList;

public interface GoodstypeService {

    ArrayList<Goodstype> query();

    PageInfo<Goodstype> queryAll(Integer pageNum, Integer pageSize);

    Goodstype queryBytID(Integer tid);

    int deleteById(Integer id);

    int update(Goodstype goodstype);

    int insert(Goodstype goodstype);
}

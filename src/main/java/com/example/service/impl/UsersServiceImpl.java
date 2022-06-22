package com.example.service.impl;

import com.example.dao.UsersDao;
import com.example.eneity.Goods;
import com.example.eneity.Users;
import com.example.service.UsersService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {
    @Resource
    UsersDao usersDao;

    @Override
    public int addUsers(Users users) {
        return usersDao.insert(users);
    }

    @Override
    public int deleteByID(Integer id) {
        return usersDao.deleteById(id);
    }

    @Override
    public int update(Users users) {
        return usersDao.update(users);
    }

    @Override
    public PageInfo<Users> queryAll(Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        Users users = new Users();
        List<Users> list = usersDao.queryAll(users);

        PageInfo<Users> pageInfo = new PageInfo<>(list);

        return pageInfo;
    }

    @Override
    public Users findById(Integer id) {
        return usersDao.queryById(id);
    }
}

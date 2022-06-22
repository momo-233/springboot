package com.example.service;

import com.example.eneity.Users;
import com.github.pagehelper.PageInfo;

import java.util.ArrayList;

public interface UsersService {
    int addUsers(Users users);

    int deleteByID(Integer id);

    int update(Users users);

    PageInfo<Users> queryAll(Integer pageNum,Integer pageSize);

    Users findById(Integer id);
}

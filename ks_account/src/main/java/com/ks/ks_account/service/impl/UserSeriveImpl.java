package com.ks.ks_account.service.impl;

import com.ks.ks_account.dao.UserDao;
import com.ks.ks_account.entity.User;
import com.ks.ks_account.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSeriveImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}

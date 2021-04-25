package com.ks.ks_account;

import com.ks.ks_account.dao.UserDao;
import com.ks.ks_account.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class KsAccountApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void saveUser() {
        User user = new User();
        user.setUsername("hx4");
        user.setPassword("ss1111");
        User save = userDao.save(user);
        System.out.println();
    }

    @Test
    void updUser() {
        Optional<User> optionalUser = userDao.findUserByUsername("hx2");
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            user.setUsername("hx3");
            userDao.save(user);
        }
    }

    @Test
    void findAllUsers() {
        List<User> all = userDao.findAll();
        System.out.println(all);
        System.out.println(all);
    }

}

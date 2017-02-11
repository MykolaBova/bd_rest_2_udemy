package ua.org.myko.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.org.myko.system.dao.UserDao;
import ua.org.myko.system.model.User;
import ua.org.myko.system.service.UserService;

import java.util.List;

/**
 * Created by Le on 4/27/2016.
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public List<User> findAllUsers() {
        return userDao.findAll();
    }

    public User findByUserName(String userName) {
        return userDao.findByUserName(userName);
    }

    public User save(User user) {
        return userDao.save(user);
    }


}

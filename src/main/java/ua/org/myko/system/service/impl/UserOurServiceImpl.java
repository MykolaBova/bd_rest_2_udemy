package ua.org.myko.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.org.myko.system.dao.UserDao;
import ua.org.myko.system.model.UserOur;
import ua.org.myko.system.service.UserOurService;

import java.util.List;

/**
 * Created by Le on 4/27/2016.
 */

@Service
public class UserOurServiceImpl implements UserOurService {

    @Autowired
    private UserDao userDao;

    public List<UserOur> findAllUsers() {
        return userDao.findAll();
    }

    public UserOur findByUserName(String userName) {
        return userDao.findByUserName(userName);
    }

    public UserOur save(UserOur userOur) {
        return userDao.save(userOur);
    }


}

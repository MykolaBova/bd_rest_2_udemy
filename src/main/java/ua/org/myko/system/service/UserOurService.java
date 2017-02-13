package ua.org.myko.system.service;


import ua.org.myko.system.model.UserOur;

import java.util.List;

/**
 * Created by Le on 4/27/2016.
 */
public interface UserOurService {

    List<UserOur> findAllUsers();

    UserOur findByUserName(String userName);

    UserOur save(UserOur userOur);


}

package ua.org.myko.system.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ua.org.myko.system.model.UserOur;
import ua.org.myko.system.service.UserOurService;

import java.util.List;

/**
 * Created by Le on 4/27/2016.
 */

@RestController
@RequestMapping("/rest")
public class UserResource {

    @Autowired
    private UserOurService userOurService;

    @RequestMapping("/user/users")
    public List<UserOur> findAllUsers() {
        return userOurService.findAllUsers();
    }


    @RequestMapping(value = "/user/userName", method = RequestMethod.POST)
    public UserOur findByUserName(@RequestBody String userName) {
        System.out.println(userName);
        System.out.println(userOurService.findByUserName(userName));
        return userOurService.findByUserName(userName);
    }

    @RequestMapping(value = "/user/update", method = RequestMethod.POST)
    public UserOur updateUser(@RequestBody UserOur userOur) {
        return userOurService.save(userOur);
    }
}

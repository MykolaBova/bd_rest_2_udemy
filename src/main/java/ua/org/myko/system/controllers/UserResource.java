package ua.org.myko.system.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ua.org.myko.system.model.User;
import ua.org.myko.system.service.UserService;

import java.util.List;

/**
 * Created by Le on 4/27/2016.
 */

@RestController
@RequestMapping("/rest")
public class UserResource {

    @Autowired
    private UserService userService;

    @RequestMapping("/user/users")
    public List<User> findAllUsers() {
        return userService.findAllUsers();
    }


    @RequestMapping(value = "/user/userName", method = RequestMethod.POST)
    public User findByUserName(@RequestBody String userName) {
        System.out.println(userName);
        System.out.println(userService.findByUserName(userName));
        return userService.findByUserName(userName);
    }

    @RequestMapping(value = "/user/update", method = RequestMethod.POST)
    public User updateUser(@RequestBody User user) {
        return userService.save(user);
    }
}

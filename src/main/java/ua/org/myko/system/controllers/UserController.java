package ua.org.myko.system.controllers;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ua.org.myko.system.model.UserOur;
import ua.org.myko.system.service.UserOurService;

import javax.servlet.ServletException;
import java.util.Date;
import java.util.Map;

/**
 * Created by Le on 4/28/2016.
 */

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserOurService userOurService;

    @RequestMapping(value="login", method = RequestMethod.POST)
    public String login(@RequestBody Map<String, String> json) throws
            ServletException {
        if(json.get("username") == null || json.get("password") ==null) {
            throw new ServletException("Please fill in username and password");
        }

        String userName = json.get("username");
        String password = json.get("password");

        UserOur userOur = userOurService.findByUserName(userName);
        if (userOur ==null) {
            throw new ServletException("User name not found.");
        }

        String pwd = userOur.getPassword();

        if(!password.equals(pwd)) {
            throw new ServletException("Invalid login. Please check your name and password");
        }

        return Jwts.builder().setSubject(userName).claim("roles", "user").setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, "secretkey").compact();
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public UserOur registerUser(@RequestBody UserOur userOur) {
        return userOurService.save(userOur);
    }


}

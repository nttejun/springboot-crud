package com.wj.controller;

import com.wj.domain.User;
import com.wj.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class UserController {

    private static Logger logger = LoggerFactory.getLogger("UserController.class");

    @Autowired
    UserService userService;

    @RequestMapping(value = "/user/{userAlias}", method = RequestMethod.GET)
    public String getUser(Model model, @PathVariable String userAlias) {
        User user = userService.getUser(userAlias);
        model.addAttribute("user", user);
        return "user/findUser";
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String listUser(Model model) {
        List<User> users = userService.listUser();
        model.addAttribute("users", users);
        return "user/listUser";
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String insertUserInfo(@RequestBody User user) {
        userService.insertUserInfo(user);
        return "user/listUser";
    }

    @RequestMapping(value = "/user", method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteUser(@RequestBody User user) {
        String resultCode = userService.deleteUser(user);
        if (resultCode != "0000") {
            return new ResponseEntity<Void>(HttpStatus.NOT_MODIFIED);
        }
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @RequestMapping(value= "/user", method = RequestMethod.PUT)
    public ResponseEntity<Void> updateUser(@RequestBody User user){
        String resultCode = userService.updateUser(user);
        if(resultCode != "0000") {
            return new ResponseEntity<Void>(HttpStatus.NOT_MODIFIED);
        }
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @RequestMapping(value="/user/page/{jsp}", method = RequestMethod.GET)
    public String userRedirect(@PathVariable String jsp){
        return "/user/"+jsp;
    }

    @RequestMapping(value = "/user/member", method = RequestMethod.POST)
    public String loginUserMemberCheck(HttpServletRequest request, Model model){
        String userid = request.getParameter("userid");
        String password = request.getParameter("password");

        User userIsMember = null;
        userIsMember = userService.loginUserMemberCheck(userid, password);

        if(userIsMember == null) return "/home";

        model.addAttribute("user", userIsMember);
        return "user/listUser";
    }
}


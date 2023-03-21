package spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import spring.service.UserService;
import spring.service.imp.UserServiceImpl;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    public void saveUser(){
        userService.saveUser();
    }

}

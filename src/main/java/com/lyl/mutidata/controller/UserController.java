package com.lyl.mutidata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lyl.mutidata.model.Role;
import com.lyl.mutidata.model.User;
import com.lyl.mutidata.service.RoleService;
import com.lyl.mutidata.service.UserService;

/**
 * Created by zhou on 2017/1/3.
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;

    @ResponseBody
    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public User GetUser(@RequestParam("id") Integer id) {
        User user = userService.findById(id);
        return user;
    }
    
    @ResponseBody
    @RequestMapping(value = "/find1", method = RequestMethod.GET)
    public User GetUserByName(@RequestParam("name") String name) {
        User user = userService.findByName(name);
        return user;
    }
    @ResponseBody
    @RequestMapping(value = "/find2", method = RequestMethod.GET)
    public Role GetRole(@RequestParam("id") Integer id) {
        Role role = roleService.findById(id);
        return role;
    }
    
    @ResponseBody
    @RequestMapping(value = "/find3", method = RequestMethod.GET)
    public Role GetRoleByName(@RequestParam("name") String name) {
    	Role role = roleService.findByName(name);
        return role;
    }
}

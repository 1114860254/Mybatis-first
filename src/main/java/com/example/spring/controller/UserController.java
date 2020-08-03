package com.example.spring.controller;

import com.example.spring.entity.User;
import com.example.spring.service.RoleService;
import com.example.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;

    /**
     * 用户列表页面
     * @param model
     * @return
     */
    @RequestMapping(value="/list",method=RequestMethod.GET)
    public ModelAndView list(ModelAndView model){
        Map<String, Object> queryMap = new HashMap<String, Object>();
        model.addObject("roleList", roleService.findList(queryMap));
        model.setViewName("user/list");
        return model;
    }
    /**
     * 用户部分的增删查改
     * @param para
     * @return
     */
    @RequestMapping("/findByUsername")
    public List<User> findByName(@RequestBody Map<String,Object> para) {
        String userName =  para.get("userName").toString();
        return userService.findAllByUserName(userName);
    }

    @RequestMapping("/pageList")
    public List<User> findAllUser(@RequestParam(name = "pageNum")  Integer pageNum,@RequestParam(name = "pageSize")Integer pageSize) {
        return userService.pageList(1,10,null);
    }

    //@RequestMapping("/saveUser")
    @GetMapping("/saveUser")
    public Integer saveUser(User user) {
   //     System.out.println("------------------------------");
        try {
            userService.saveUser(user);
        }catch (Exception e){
            e.printStackTrace();
            return 1;
        }
        return 0;
    }

    @RequestMapping("/delUser")
    public Integer deleteUser(
            @RequestParam(value = "id") Integer id) {
        try {
            userService.delUser(id);
        }catch (Exception e){
            e.printStackTrace();
            return 1;
        }
        return 0;
    }
    @RequestMapping("/all")
    public List<User> findAll(){
        return userService.findAll();
    }

}


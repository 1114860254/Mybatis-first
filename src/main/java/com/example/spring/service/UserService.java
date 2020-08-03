package com.example.spring.service;

import com.example.spring.entity.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    /**
     * 添加/更新用户
     * @param user
     */
    void saveUser(User user);

    /**
     * 删除用户
     * @param id
     */
    Integer delUser(Integer id);

    /**
     * 查询单个用户
     * @param id
     */
    User  getUser(Integer id);
    List<User> findAll();

    List<User> pageList(Integer pageNum, Integer pageSize, Map<String,Object> para);

    List<User> findAllByUserName(String userName);
}

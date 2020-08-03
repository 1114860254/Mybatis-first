package com.example.spring.service.impl;

import com.example.spring.dao.UserDao;
import com.example.spring.dao.UserMapper;
import com.example.spring.entity.User;
import com.example.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void saveUser(User user) {
        if(user.getId()==null){
            userMapper.addUser(user);
        }else{
            userMapper.updateUser(user);
        }
    }

    @Override
    public Integer delUser(Integer id) {
    return userMapper.deleteById(id);
    }

    @Override
    public User getUser(Integer id) {
        return userMapper.getById(id);
    }

    @Override
    public List<User> pageList(Integer pageNum, Integer pageSize, Map<String, Object> para) {
        return null;
    }

    @Override
    public List<User> findAllByUserName(String userName) {
        return  userMapper.findAllByUserName(userName);
    }
    @Override
    public List<User> findAll(){
        return userMapper.findAll();
    }
}

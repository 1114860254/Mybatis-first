package com.example.spring.dao;

import com.example.spring.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> findAllByUserName(String userName);
    Integer deleteById(Integer id);
    void addUser(User user);
    void updateUser(User user);
    User getById(Integer id);
    List<User> findAll();

}

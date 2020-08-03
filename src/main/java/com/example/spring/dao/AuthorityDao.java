package com.example.spring.dao;

import com.example.spring.entity.Authority;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface AuthorityDao {
    public int add(Authority authority);
    public int deleteByRoleId(Long roleId);
    public List<Authority> findListByRoleId(Long roleId);
}

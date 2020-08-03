package com.example.spring.service.impl;

import com.example.spring.dao.RoleDao;
import com.example.spring.dao.RoleMapper;
import com.example.spring.entity.Role;
import com.example.spring.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 *
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;

    public int add(Role role) {
        // TODO Auto-generated method stub
        return roleMapper.add(role);
    }

    public int edit(Role role) {
        // TODO Auto-generated method stub
        return roleMapper.edit(role);
    }

    public int delete(Integer id) {
        // TODO Auto-generated method stub
        return roleMapper.delete(id);
    }

    public List<Role> findList(Map<String, Object> queryMap) {
        // TODO Auto-generated method stub
        return roleMapper.findList(queryMap);
    }

    public int getTotal(Map<String, Object> queryMap) {
        // TODO Auto-generated method stub
        return roleMapper.getTotal(queryMap);
    }

    public Role find(Long id) {
        // TODO Auto-generated method stub
        return roleMapper.find(id);
    }

}

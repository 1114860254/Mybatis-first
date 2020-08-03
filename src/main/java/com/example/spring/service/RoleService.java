package com.example.spring.service;

import com.example.spring.entity.Role;

import java.util.List;
import java.util.Map;

public interface RoleService {
    public int add(Role role);
    public int edit(Role role);
    public int delete(Integer id);
    public List<Role> findList(Map<String, Object> queryMap);
    public int getTotal(Map<String, Object> queryMap);
    public Role find(Long id);
}

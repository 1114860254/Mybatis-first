package com.example.spring.service.impl;


import com.example.spring.dao.AuthorityMapper;
import com.example.spring.entity.Authority;
import com.example.spring.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AuthorityServiceImpl implements AuthorityService {
    @Autowired
    private AuthorityMapper authorityMapper;

    public int add(Authority authority) {
        // TODO Auto-generated method stub
        return authorityMapper.add(authority);
    }

    public int deleteByRoleId(Long roleId) {
        // TODO Auto-generated method stub
        return authorityMapper.deleteByRoleId(roleId);
    }

    public List<Authority> findListByRoleId(Long roleId) {
        // TODO Auto-generated method stub
        return authorityMapper.findListByRoleId(roleId);
    }
}

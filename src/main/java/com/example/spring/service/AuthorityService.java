package com.example.spring.service;

import com.example.spring.entity.Authority;

import java.util.List;

public interface AuthorityService {
    public int add(Authority authority);
    public int deleteByRoleId(Long roleId);
    public List<Authority> findListByRoleId(Long roleId);
}

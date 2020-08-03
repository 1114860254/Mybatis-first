package com.example.spring.service.impl;

/**
 * 菜单管理实现类
 */
import java.util.List;
import java.util.Map;

import com.example.spring.dao.MenuDao;
import com.example.spring.dao.MenuMapper;
import com.example.spring.entity.Menu;
import com.example.spring.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuMapper menuMapper;

    public int add(Menu menu) {
        // TODO Auto-generated method stub
        return menuMapper.add(menu);
    }

    public List<Menu> findList(Map<String, Object> queryMap) {
        // TODO Auto-generated method stub
        return menuMapper.findList(queryMap);
    }

    public List<Menu> findTopList() {
        // TODO Auto-generated method stub
        return menuMapper.findTopList();
    }

    public int getTotal(Map<String, Object> queryMap) {
        // TODO Auto-generated method stub
        return menuMapper.getTotal(queryMap);
    }

    public int edit(Menu menu) {
        // TODO Auto-generated method stub
        return menuMapper.edit(menu);
    }

    public int delete(Long id) {
        // TODO Auto-generated method stub
        return menuMapper.delete(id);
    }

    public List<Menu> findChildernList(Long parentId) {
        // TODO Auto-generated method stub
        return menuMapper.findChildernList(parentId);
    }

    public List<Menu> findListByIds(String ids) {
        // TODO Auto-generated method stub
        return menuMapper.findListByIds(ids);
    }

}


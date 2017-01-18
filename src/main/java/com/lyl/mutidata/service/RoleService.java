package com.lyl.mutidata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lyl.mutidata.common.datasource.DatabaseContextHolder;
import com.lyl.mutidata.common.datasource.DatabaseType;
import com.lyl.mutidata.mapper.RoleMapper;
import com.lyl.mutidata.model.Role;


/**
 * Created by zhou on 2017/1/3.
 */
@Service("roleService")
public class RoleService {
    @Autowired
    private RoleMapper roleMapper;

    public Role findById(Integer id) {
    	DatabaseContextHolder.setDatabaseType(DatabaseType.dataserver);
        Role role = roleMapper.findById(id);
        return role;
    }

    public Role findByName(String name) {
    	DatabaseContextHolder.setDatabaseType(DatabaseType.dataserver);
    	Role role = roleMapper.findByName(name);
        return role;
    }

}

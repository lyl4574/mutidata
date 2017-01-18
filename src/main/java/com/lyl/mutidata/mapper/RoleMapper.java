package com.lyl.mutidata.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.lyl.mutidata.model.Role;

/**
 * Created by zhou on 2017/1/3.
 */
@Mapper
public interface RoleMapper {

    Role findById(Integer id);

    Role findByName(String name);

}

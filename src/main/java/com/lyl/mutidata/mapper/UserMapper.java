package com.lyl.mutidata.mapper;

import com.lyl.mutidata.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * Created by zhou on 2017/1/3.
 */
@Mapper
public interface UserMapper {

    User findById(Integer id);

    User findByName(String name);

    List<User> findUsers(RowBounds rowbounds);

}

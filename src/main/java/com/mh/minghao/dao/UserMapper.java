package com.mh.minghao.dao;

import com.mh.minghao.entity.User;
import com.mh.minghao.util.PageUtil;
import com.mh.minghao.util.OrderUtil;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    Integer insertOne(@Param("user") User user);

    Integer updateOne(@Param("user") User user);

    List<User> select(@Param("user") User user, @Param("orderUtil") OrderUtil orderUtil, @Param("pageUtil") PageUtil pageUtil);

    User selectOne(@Param("user_id") Integer user_id);

    User selectByLogin(@Param("user_name") String user_name, @Param("user_password") String user_password);

    Integer selectTotal(@Param("user") User user);
}

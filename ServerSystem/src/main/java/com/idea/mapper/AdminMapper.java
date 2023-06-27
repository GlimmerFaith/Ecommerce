package com.idea.mapper;

import com.idea.entity.AdminParam;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户持久层接口
 */
@Mapper
public interface AdminMapper {
    /**
     *插入用户数据
     * @param admin
     * @return  受影响行数
     */
    Integer insert(AdminParam admin);

    /**
     * 根据用户名查询
     * @param username
     * @return
     */
    AdminParam findByUsername(String username);

    AdminParam deleteByUsername(String username);

    AdminParam updateByUsername(String username);


}

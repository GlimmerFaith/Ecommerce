package com.idea.service.impl;

import com.idea.entity.AdminParam;
import com.idea.mapper.AdminMapper;
import com.idea.service.IAdminService;
import com.idea.service.exception.InsertException;
import com.idea.service.exception.UsernameTakenException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class AdminService implements IAdminService {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public void register(AdminParam admin) {
        String username = admin.getUsername();
        AdminParam result =  adminMapper.findByUsername(username);
        if(result != null){
            throw new UsernameTakenException("用户名被占用");
        }

        Integer rows = adminMapper.insert(admin);
        if(rows != 1){
            throw new InsertException("注册异常");
        }

        //补全数据
        admin.setStatus(1);
        Date date = new Date();
        admin.setCreateTime(date);


    }
}

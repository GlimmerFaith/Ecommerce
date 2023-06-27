package com.idea.mapper;

import com.idea.entity.AdminParam;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AdminMapperTest {
    @Autowired
    private AdminMapper adminMapper;

    @Test
    public void insert(){
        AdminParam admin = new AdminParam();
        admin.setUsername("user");
        admin.setPassword("123");
        System.out.println(adminMapper.insert(admin));
    }

    @Test
    public void findByUsername(){
        System.out.println(adminMapper.findByUsername("admin"));
    }

    @Test
    private void deleteByUsername(){
        System.out.println(adminMapper.deleteByUsername("user111"));
    }

    @Test
    public void updateByUsername(){
        adminMapper.updateByUsername("user111");
    }
}

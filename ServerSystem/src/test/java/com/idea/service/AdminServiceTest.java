package com.idea.service;

import com.idea.entity.AdminParam;
import com.idea.service.exception.ServiceException;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AdminServiceTest {
    @Autowired
    private IAdminService adminService;

    @Test
    public void register(){
        try {
            AdminParam admin = new AdminParam();
            admin.setUsername("user111");
            admin.setPassword("123");
            adminService.register(admin);
            System.out.println("OK");
        } catch (ServiceException e) {
            System.out.println(e.getClass().getSimpleName());
            System.out.println(e.getMessage());
        }
    }


}

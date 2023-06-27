package com.idea.controller;

import com.idea.entity.AdminParam;
import com.idea.service.exception.InsertException;
import com.idea.service.exception.UsernameTakenException;
import com.idea.service.impl.AdminService;
import com.idea.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin")
public class AdminController {
    @Autowired
    private AdminService adminService;



    @RequestMapping(value = "register", method = RequestMethod.POST)
    public JsonResult<Void> register(AdminParam admin) {
        JsonResult<Void> result = new JsonResult<>();
        try {
            adminService.register(admin);
            result.setState(200);
            result.setMessage("注册成功");
        }catch (UsernameTakenException e){
            result.setState(4000);
            result.setMessage("用户名被占用");
        }catch (InsertException e){
            result.setState(5000);
            result.setMessage("注册异常");
        }
        return result;
    }

}

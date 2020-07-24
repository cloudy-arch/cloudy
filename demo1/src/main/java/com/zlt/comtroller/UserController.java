package com.zlt.comtroller;

import com.zlt.domain.User;
import com.zlt.service.UserService;

import java.util.List;
@RestController
@RequestMapping("user")
public class UserController {
    @AutoWired  //自动注入
    UserService userService;
    //返回json数据，List<User>


    @RequestMapping(value="queryUsers",method={RequestMethod.GET})

    public List<User> queryUsers(){
        return userService.queryUsers();
    }
}

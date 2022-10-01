package com.test.service.impl;

import com.test.dao.IUsersDao;
import com.test.dao.impl.UsersDao;
import com.test.pojo.Users;
import com.test.service.IUsersService;

import java.util.List;
import java.util.Map;

public class UsersService implements IUsersService {

    private IUsersDao usersDao=new UsersDao();
    @Override
    public int addUsers(Users user) {
        //1.验证手机

        //2.验证邮箱

        //3.调用dao层做添加
        return usersDao.addUsers(user);
    }

    @Override
    public List<Map<String,Object>> queryUsers() {
        return usersDao.queryUsers();
    }
}

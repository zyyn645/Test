package com.test.dao.impl;

import com.test.dao.IUsersDao;
import com.test.pojo.Users;
import com.test.service.IUsersService;
import com.test.util.DbHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UsersDao implements IUsersDao {
    @Override
    public int addUsers(Users user) {
        //添加用户到数据库
        String sql="insert into user values(?,?,?)";
        List<Object> paramList=new ArrayList<Object>();
        paramList.add(user.getId());
        paramList.add(user.getName());
        paramList.add(user.getAge());

        DbHelper dbHelper=new DbHelper();
        return dbHelper.executeUpdate(sql,paramList);
    }

    public List<Map<String,Object>> queryUsers(){
        String sql="select * from user";
        DbHelper dbHelper=new DbHelper();
        return dbHelper.executeQuery(sql,null);
    }
}

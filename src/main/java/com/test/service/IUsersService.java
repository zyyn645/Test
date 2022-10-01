package com.test.service;

import com.test.pojo.Users;

import java.util.List;
import java.util.Map;

public interface IUsersService {

    public int addUsers(Users user);
    public List<Map<String,Object>> queryUsers();
}

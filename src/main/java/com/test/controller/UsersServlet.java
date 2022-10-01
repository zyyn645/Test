package com.test.controller;

import com.test.dao.impl.UsersDao;
import com.test.pojo.Users;
import com.test.service.IUsersService;
import com.test.service.impl.UsersService;
import com.test.util.DbHelper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@WebServlet("/usersServlet")
public class UsersServlet extends HttpServlet {
    private IUsersService usersService=new UsersService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        //2.调用service层做添加用户的 逻辑处理
        List<Map<String,Object>> list = usersService.queryUsers();
        //转发到jsp页面输出
        response.getWriter().print(list);
        request.setAttribute("list",list);
        request.getRequestDispatcher("showUsers.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doPost(request,response);
    }
}

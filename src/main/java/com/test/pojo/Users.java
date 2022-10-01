package com.test.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  //自动生成get和set方法  toString方法
@NoArgsConstructor  //自动生成无参构造函数
@AllArgsConstructor //自动生成带所有参数的构造函数
public class Users {

    private int id;
    private String name;
    private int age;


}

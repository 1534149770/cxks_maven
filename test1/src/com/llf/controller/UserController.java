package com.llf.controller;

import com.llf.serviceImpl.UserServiceImpl;

import java.util.Date;

public class UserController {
    public void test(){
        UserServiceImpl us = new UserServiceImpl();
        us.register("llf","123456",new Date());
    }
}

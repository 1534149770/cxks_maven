package com.llf.service;

import java.util.Date;

public interface UserService{
    void selectAll();
    void register(String name, String password, Date birthday);
}

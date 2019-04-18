package com.ysf.service;

import com.ysf.po.User;

public interface UserService {

    User checkUser(String username, String password);
}

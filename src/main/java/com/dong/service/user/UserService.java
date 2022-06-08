package com.dong.service.user;
import com.dong.pojo.User;

import java.util.List;

public interface UserService {
    //用户登录
    public User login(String userCode,String userPassword);



}

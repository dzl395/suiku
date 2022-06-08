package com.dong.dao.user;
import com.dong.pojo.User;

import java.sql.Connection;
import java.sql.SQLException;


//登录 判断 的接口
  public abstract interface UserDao {
    //得到要登录的用户信息
    public abstract   User getLoginInfo(Connection conn,String userCode) throws SQLException;

}

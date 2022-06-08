package com.dong.dao.user;

import com.dong.dao.BaseDao;
import com.dong.pojo.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//登录 判断 的实现类
public class UserDaoImpl implements UserDao {

    //得到要登录的用户信息
    public User getLoginInfo(Connection conn, String userCode) throws SQLException {
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        User user = null;

        //如果连数据库都没连接就无需判断了
        if(conn!=null){
            //编写sql语句
            String sql = "select * from shuiku_user where userCode = ?";
            //存放参数
            Object[] params = {userCode};
            //使用预处理对象调用  操作数据库的公共类 的执行 sql查询语句
            rs = BaseDao.executeQuery(conn, sql, preparedStatement, params,rs);
            //遍历结果集  封装到一个用户中
            if(rs.next()){
                user = new User();
                user.setId(rs.getInt("id"));
                user.setUserCode(rs.getString("userCode"));
                user.setUserName(rs.getString("userName"));
                user.setUserPassword(rs.getString("userPassword"));

            }
            //调用  操作数据库的公共类 的执行 释放资源
            BaseDao.closeResource(null,preparedStatement,rs);
        }
        //返回一个用户


        return user;
    }


}

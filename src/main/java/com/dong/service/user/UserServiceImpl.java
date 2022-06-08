package com.dong.service.user;

import com.dong.dao.BaseDao;
import com.dong.dao.user.UserDao;
import com.dong.dao.user.UserDaoImpl;
import com.dong.pojo.User;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

//用户登录的业务层实现类
public class UserServiceImpl implements UserService {
    //业务层肯定是调用dao层的
    private UserDao userDao;
    public UserServiceImpl(){
        userDao =new UserDaoImpl();
    }

    @Override
    //(String userCode, String passWord)两个参数对应是的首页传来的值
    //用户登录
    public User login(String userCode, String passWord) {
        Connection conn = null;
        User user = null;

        try {
            //调用 dao层操作数据库的公共类方法 获取数据库的连接
            conn = BaseDao.getConnection();
            //得到连接后 开始查询 通过业务层调用具体的数据库操作
            user = userDao.getLoginInfo(conn, userCode);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //关闭资源
            BaseDao.closeResource(conn,null,null);
        }
        return user;
    }

}
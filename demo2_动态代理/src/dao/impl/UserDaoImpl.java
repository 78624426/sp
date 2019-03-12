package dao.impl;

import dao.UserDao;

public class UserDaoImpl implements UserDao {

    @Override
    public void add() {
        System.out.println("添加用户");
    }

    @Override
    public void update() {
        System.out.println("修改用户");
    }
}

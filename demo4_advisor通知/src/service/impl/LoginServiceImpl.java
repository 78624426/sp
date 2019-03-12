package service.impl;

import service.LoginService;

public class LoginServiceImpl implements LoginService{
    @Override
    public boolean login(String user, String pass) {
        System.out.println("用户登录....");
        return true;
    }

    @Override
    public boolean logout() {
        System.out.println("退出登录...");
        return false;
    }
}

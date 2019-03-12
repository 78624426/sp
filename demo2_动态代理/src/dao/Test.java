package dao;

import dao.impl.UserDaoImpl;
import dao.proxy.JdkProxy;

public class Test {
    public static void main(String[] args) {
        JdkProxy jp = new JdkProxy(new UserDaoImpl());
        UserDao proxy = jp.createProxy();
        proxy.add();
    }
}

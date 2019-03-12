package dao.proxy;

import dao.UserDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxy implements InvocationHandler{
    UserDao dao;

    public JdkProxy(UserDao dao) {
        this.dao = dao;
    }

    public UserDao createProxy(){
        /*
        * 参数1：类加载器，通过类加载器产生一个老板类（proxy类）
        * 参数2：获取target类所实现的所有接口
        * 参数3：指定一个对象并赋值给该方法内部的一个变量a,该变量实现了一个接口InvocationHandler
        * {
        * InvocationHandler a = this;
        * UserDao proxy = new UserDao(){
        *   void add(){
        *       a.invoke(proxy,add方法,add方法的参数);
        *   }
        *   void update(){
        *       a.invoke(proxy,update方法，update参数);
        *   }
        * }
        * return proxy;
        * }
        * */
        UserDao proxy = (UserDao) Proxy.newProxyInstance(dao.getClass().getClassLoader(),dao.getClass().getInterfaces(),this);
        return proxy;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName()+"访问了数据库---日志记录");
        Object o = method.invoke(dao,args);
        System.out.println("秘书访问结束");
        return o;
    }
}

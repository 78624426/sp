package test1;

import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Date;

public class UtilAop implements MethodInterceptor{
    public <T>T getProxy(Class<?>c){
        if(c.getInterfaces().length>0){
            return (T)Enhancer.create(c,c.getInterfaces(),this);
        }
        return (T)Enhancer.create(c,this);
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy proxy) throws Throwable {
        System.out.println(method.getName()+"执行了操作--"+new Date());
        return proxy.invokeSuper(o,objects);
    }

}

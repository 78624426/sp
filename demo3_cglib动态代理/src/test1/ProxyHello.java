package test1;

import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.test.context.TestExecutionListeners;

import java.lang.reflect.Method;
import java.util.Date;

public class ProxyHello implements MethodInterceptor{
    Hello hello = (Hello) Enhancer.create(Hello.class,this);
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println(method.getName()+"执行了操作--"+new Date());
        return methodProxy.invokeSuper(o,args);
    }

    @Test
    public void show(){
        hello.sayHello();
    }
}

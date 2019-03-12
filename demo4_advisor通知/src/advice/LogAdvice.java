package advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;

public class LogAdvice implements MethodBeforeAdvice{
    /*参数1：要代理的方法
    参数2：方法的参数
    参数3：秘书类
    *
    * */
    @Override
    public void before(Method method, Object[] args, Object o) throws Throwable {
        System.out.println(method.getName()+" execute at"+new Date()+",param:"+ Arrays.toString(args));
    }
}

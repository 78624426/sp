package advice;

import org.aspectj.lang.annotation.AfterReturning;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class GoodByeAdvice implements AfterReturningAdvice {
    /*参数1：方法返回值
    参数2：针对哪个方法的通知
    参数3：方法参数
    参数4：是哪一个对象的方法
    *
    * */
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("xxxxxx");
    }
}

package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.LoginService;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
        LoginService proxy = (LoginService) ac.getBean("loginProxy");
        proxy.login("admin","123");
        proxy.logout();
    }
}

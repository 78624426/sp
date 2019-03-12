package test;

import bean.Boy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext bf = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
        Boy b = (Boy)bf.getBean("boy");
        System.out.println(b);
    }
}

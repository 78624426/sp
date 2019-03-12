package test1;

public class Test {
    public static void main(String[] args) {
        UtilAop util = new UtilAop();
        util.<Hello>getProxy(Hello.class).sayHello();
    }
}

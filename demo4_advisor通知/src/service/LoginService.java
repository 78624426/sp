package service;

public interface LoginService {
    boolean login(String user,String pass);
    boolean logout();
}

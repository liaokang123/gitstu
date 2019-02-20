package dao;

import vo.User;

public interface LoginDao {

    User getUser(String username,String pass);
}

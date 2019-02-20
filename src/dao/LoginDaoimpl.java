package dao;

import vo.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDaoimpl implements LoginDao{
    private Connection connection=null;
    private PreparedStatement preparedStatement=null;
    private ResultSet resultSet=null;


    @Override
    public User getUser(String name, String password) {
       String sql="select*from userinfo where username=? and pass=?";
    }
}

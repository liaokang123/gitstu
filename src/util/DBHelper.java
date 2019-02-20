package util;

import java.sql.*;

public class DBHelper {
    private static String URL="jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
    private static String NAME="root";
    private static String PWD="root";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(URL, NAME, PWD);
        return connection;

    }
    public static  void close(Connection connection) throws SQLException {
        if (connection!=null){
            connection.close();
        }
    }
    public static  void close(PreparedStatement preparedStatement) throws SQLException {
        if (preparedStatement!=null){
            preparedStatement.close();
        }
    }
    public static  void close(ResultSet resultSet) throws SQLException {
        if (resultSet!=null){
            resultSet.close();
        }
    }


}

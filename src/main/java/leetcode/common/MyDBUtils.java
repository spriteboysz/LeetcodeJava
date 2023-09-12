package leetcode.common;

import java.sql.*;

/**
 * Author: Deean
 * Date: 2023-08-30 22:54
 * FileName: src/main/java/leetcode/common/MyDBUtils
 * Description:
 */

public class MyDBUtils {
    private static final String URL = "jdbc:mysql://localhost:3306";
    private static final String USER = "root";
    private static final String PASSWORD = "www.huawei.com";

    public static final ThreadLocal<Connection> local = new ThreadLocal<>();

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("数据库驱动加载失败");
            e.printStackTrace();
        }
    }

    public static Connection getConnection(String db) {
        String url = URL + "/" + db;
        Connection connection = local.get();
        try {
            if (connection == null) {
                connection = DriverManager.getConnection(url, USER, PASSWORD);
                local.set(connection);
            }
        } catch (SQLException e) {
            System.out.println("数据库连接获取失败");
            e.printStackTrace();
        }
        return connection;
    }

    public static Connection getConnection() {
        return getConnection("library");
    }

    public static void close(ResultSet resultSet, Statement statement, Connection connection) {
        try {
            if (resultSet != null && !resultSet.isClosed()) {
                resultSet.close();
            }
            if (statement != null && !statement.isClosed()) {
                statement.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            System.out.println("数据库连接关闭失败");
            e.printStackTrace();
        }
    }

    public static void close(Statement statement, Connection connection) {
        close(null, statement, connection);
    }

    public static void close(Connection connection) {
        close(null, connection);
    }

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = getConnection();
            String sql = "select * from students";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                String stuNum = resultSet.getString("stu_num");
                String stuName = resultSet.getString("stu_name");
                System.out.println(stuNum + "\t" + stuName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(resultSet, statement, connection);
            close(connection);
        }

    }
}

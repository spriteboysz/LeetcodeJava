package leetcode.common;

import java.sql.*;

/**
 * Author: Deean
 * Date: 2023-08-27 22:30
 * FileName: src/leetcode/editor/cn/leetcode.common
 * Description:
 */

public class MySQL {
    // MySQL数据库连接参数
    private static final String URL = "jdbc:mysql://localhost:3306/";
    private static final String USER = "root";
    private static final String PASSWORD = "www.huawei.com";

    // 反映射注册数据库驱动
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("数据库驱动加载失败");
            e.printStackTrace();
        }
    }

    // 建立连接
    public static Connection getConnection(String db) {
        String url = URL + db;
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("数据库连接获取失败");
            e.printStackTrace();
        }
        return connection;
    }

    public static void close(ResultSet rs, Statement statement, Connection connection) {
        try {
            if (rs != null && !rs.isClosed()) {
                rs.close();
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

    public static void main(String[] args) {
        Connection conn = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            conn = getConnection("p1757");
            System.out.println(conn);
            statement = conn.createStatement();
            String sql = "select * from products";
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int id = resultSet.getInt("product_id");
                String low_fats = resultSet.getString("low_fats");
                String recyclable = resultSet.getString("recyclable");
                System.out.println(id + "\t" + low_fats + "\t" + recyclable);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(resultSet, statement, conn);
            close(statement, conn);
        }
    }
}

package leetcode.editor.cn.common;

import java.sql.*;

import static leetcode.editor.cn.common.MySQL.close;
import static leetcode.editor.cn.common.MySQL.getConnection;

/**
 * Author: Deean
 * Date: 2023-08-28 23:08
 * FileName: src/leetcode/editor/cn/common
 * Description:
 */

public class EmployeeDAO {

    private static Connection connection;
    private static Statement statement;
    private static PreparedStatement preparedStatement;
    private static ResultSet resultSet;

    public static String insert(Employee employee) {
        int flag = 0;
        try {
            connection = getConnection("P0570");
            String sql = "insert into employee(id, name, department, managerId) values(?,?,?,?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate(sql);
            preparedStatement.setInt(1, employee.getId());
            preparedStatement.setString(2, employee.getName());
            preparedStatement.setString(3, employee.getDepartment());
            preparedStatement.setInt(4, employee.getManagerId());
            flag = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("插入操作异常");
        } finally {
            close(preparedStatement, connection);
        }
        return flag > 0 ? "Insert Success" : "Insert Fail";
    }

    public static Employee query(int id) {
        Employee employee = null;
        try {
            connection = getConnection("P0570");
            String sql = "select * from employee where id = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                int qid = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String department = resultSet.getString("department");
                //int managerId = resultSet.getInt("managerId");
                employee = new Employee(qid, name, department, 0);
            }
        } catch (SQLException e) {
            System.out.println("基于ID查询操作异常");
        } finally {
            close(resultSet, preparedStatement, connection);
        }
        return employee;
    }

    public static void main(String[] args) {
        Employee employee = query(101);
        System.out.println(employee);
    }
}

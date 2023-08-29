package leetcode.editor.cn.common;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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
            preparedStatement.setInt(1, employee.getId());
            preparedStatement.setString(2, employee.getName());
            preparedStatement.setString(3, employee.getDepartment());
            preparedStatement.setInt(4, employee.getManagerId());
            flag = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("插入操作异常");
            e.printStackTrace();
        } finally {
            close(preparedStatement, connection);
        }
        return flag > 0 ? "Insert Success" : "Insert Fail";
    }

    public static String delete(int id) {
        int flag = 0;
        try {
            connection = getConnection("P0570");
            String sql = "delete from employee where id = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            flag = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("删除操作异常");
            e.printStackTrace();
        } finally {
            close(preparedStatement, connection);
        }
        return flag > 0 ? "Delete Success" : "Delete Fail";
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
                int iid = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String department = resultSet.getString("department");
                int managerId = 0;
                if (resultSet.getObject("managerId") != null) {
                    managerId = resultSet.getInt("managerId");
                }
                employee = new Employee(iid, name, department, managerId);
            }
        } catch (SQLException e) {
            System.out.println("基于ID查询操作异常");
            e.printStackTrace();
        } finally {
            close(resultSet, preparedStatement, connection);
        }
        return employee;
    }

    public static List<Employee> query() {
        List<Employee> employeeList = new ArrayList<>();
        try {
            connection = getConnection("P0570");
            statement = connection.createStatement();
            String sql = "select * from employee";
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Employee employee;
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String department = resultSet.getString("department");
                int managerId = 0;
                if (resultSet.getObject("managerId") != null) {
                    managerId = resultSet.getInt("managerId");
                }
                employee = new Employee(id, name, department, managerId);
                employeeList.add(employee);
            }
        } catch (SQLException e) {
            System.out.println("查询操作异常");
            e.printStackTrace();
        } finally {
            close(resultSet, statement, connection);
        }
        return employeeList;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(107, "Deean", "B", 102);
        String ret = insert(e1);
        System.out.println(ret);

        Employee e2 = query(107);
        System.out.println(e2);

        ret = delete(107);
        System.out.println(ret);

        Employee e3 = query(107);
        System.out.println(e3);

        List<Employee> employeeList = query();
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }
}

package common;

/**
 * Author: Deean
 * Date: 2023-08-28 23:04
 * FileName: src/leetcode/editor/cn/common
 * Description:
 */

public class Employee {
    private int id;
    private String name;
    private String department;
    private int managerId;

    @Override
    public String toString() {
        return id + "\t" + name + "\t" + department + "\t" + managerId;
    }

    public Employee() {
    }

    public Employee(int id, String name, String department, int managerId) {
        setId(id);
        setName(name);
        setDepartment(department);
        setManagerId(managerId);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println(employee);
    }
}

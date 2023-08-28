package leetcode.editor.cn.common;

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
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", managerId=" + managerId +
                '}';
    }

    public Employee() {
    }

    public Employee(int id, String name, String department, int managerId) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.managerId = managerId;
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
}

import leetcode.editor.cn.common.Employee;
import leetcode.editor.cn.common.EmployeeDAO;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Author: Deean
 * Date: 2023-08-29 07:36
 * FileName: src/leetcode/editor/cn/test
 * Description:
 */

public class EmployeeDAOTest {
    @Test
    public void testQuery() {
        Employee employee = EmployeeDAO.query(101);
        assertEquals(101, employee.getId());
    }
}

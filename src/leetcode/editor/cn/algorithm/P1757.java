package leetcode.editor.cn.algorithm;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static leetcode.editor.cn.common.MySQL.getConnection;

/**
 * Author: Deean
 * Date: 2023-08-27 23:24
 * FileName: src/leetcode/editor/cn/algorithm
 * Description:
 */

public class P1757 {
    // code beginning
    class Solution {
        public void find_products(Connection connection) throws SQLException {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from products");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("product_id");
                String str = resultSet.getString("low_fats");
                System.out.println(id + "\t" + str);
            }
        }
    }

    public static void main(String[] args) throws SQLException {
        Solution s = new P1757().new Solution();
        Connection conn = getConnection("P1757");
        s.find_products(conn);
    }
}

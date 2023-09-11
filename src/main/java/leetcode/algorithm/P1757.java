package leetcode.algorithm;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



/**
 * Author: Deean
 * Date: 2023-08-27 23:24
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description:
 */

public class P1757 {
    // code beginning
    class Solution {
        public List<Integer> find_products(Connection connection) throws SQLException {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from products");
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Integer> ids = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("product_id");
                String low_fats = resultSet.getString("low_fats");
                String recyclable = resultSet.getString("recyclable");
                if (low_fats.equals("Y") && recyclable.equals("Y")) {
                    ids.add(id);
                }
            }
            return ids;
        }
    }

    public static void main(String[] args) throws SQLException {
        Solution s = new P1757().new Solution();
        // Connection conn = getConnection("P1757");
        //Object ans = s.find_products(conn);
        //System.out.println(ans.toString());
    }
}

package algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-31 17:52
 * LastEditTime: 2022-07-31 17:52
 * Description: 118. 杨辉三角
 */

public class P0118 {
    // code beginning
    class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> triangle = new ArrayList<>();
            for (int i = 0; i < numRows; i++) {
                List<Integer> row = new ArrayList<>();
                for (int j = 0; j <= i; j++) {
                    if (j == 0 || j == i) {
                        row.add(1);
                    } else {
                        row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
                    }
                }
                triangle.add(row);
            }
            return triangle;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0118().new Solution();
        Object ans = s.generate(5);
        System.out.println(ans);
    }
}
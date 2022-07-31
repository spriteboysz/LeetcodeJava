package leetcode.editor.cn.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-31 22:00
 * LastEditTime: 2022-07-31 22:00
 * Description: 119. 杨辉三角 II
 */

public class P0119 {
    // code beginning
    class Solution {
        public List<Integer> getRow(int rowIndex) {
            List<List<Integer>> triangle = new ArrayList<>();
            for (int i = 0; i <= rowIndex; i++) {
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
            return triangle.get(triangle.size() - 1);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0119().new Solution();
        Object ans = s.getRow(3);
        System.out.println(ans);
    }
}
package algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-06-29 23:24
 * LastEditTime: 2022-06-29 23:24
 * Description: 2194. Excel 表中某个范围内的单元格
 */

public class P2194 {
    // code beginning
    class Solution {
        public List<String> cellsInRange(String s) {
            List<String> cells = new ArrayList<>();
            char[] ch = s.toCharArray();
            for (char c = ch[0]; c <= ch[3]; c++) {
                for (int i = ch[1] - '0'; i <= ch[4] - '0'; i++) {
                    cells.add(String.valueOf(c) + i);
                }
            }
            return cells;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2194().new Solution();
        Object ans = s.cellsInRange("A1:F2");
        System.out.println(ans);
    }
}
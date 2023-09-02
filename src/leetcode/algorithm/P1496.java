package leetcode.algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2022-08-11 23:37
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 1496. 判断路径是否相交
 */

public class P1496 {
    // code beginning
    class Solution {
        public boolean isPathCrossing(String path) {
            Set<String> set = new HashSet<>();
            int x = 0, y = 0;
            set.add(x + "," + y);
            for (char c : path.toCharArray()) {
                switch (c) {
                    case 'N' -> y += 1;
                    case 'S' -> y -= 1;
                    case 'E' -> x += 1;
                    case 'W' -> x -= 1;
                }
                if (set.contains(x + "," + y)) return true;
                set.add(x + "," + y);
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1496().new Solution();
        Object ans = s.isPathCrossing("NESWW");
        System.out.println(ans);
    }
}
package algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-08-28 10:48
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 1560. 圆形赛道上经过次数最多的扇区
 */

public class P1560 {
    // code beginning
    class Solution {
        public List<Integer> mostVisited(int n, int[] rounds) {
            List<Integer> most = new ArrayList<>();
            int start = rounds[0], end = rounds[rounds.length - 1];
            if (start <= end) {
                for (int i = start; i <= end; i++) {
                    most.add(i);
                }
            } else {
                for (int i = 1; i <= end; i++) {
                    most.add(i);
                }
                for (int i = start; i <= n; i++) {
                    most.add(i);
                }
            }
            return most;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1560().new Solution();
        Object ans = s.mostVisited(2, new int[]{2, 1, 2, 1, 2, 1, 2, 1, 2});
        System.out.println(ans);
    }
}
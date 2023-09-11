package leetcode.algorithm;

import java.util.*;

/**
 * Author: Deean
 * Date: 2023-09-10 23:04
 * FileName: src/leetcode/algorithm
 * Description:1817. 查找用户活跃分钟数
 */

public class P1817 {
    // code beginning
    class Solution {
        public int[] findingUsersActiveMinutes(int[][] logs, int k) {
            Map<Integer, Set<Integer>> map = new HashMap<>();
            for (int[] log : logs) {
                int id = log[0], time = log[1];
                map.putIfAbsent(id, new HashSet<>());
                map.get(id).add(time);
            }
            int[] ans = new int[k];
            for (Set<Integer> minutes : map.values()) {
                int active = minutes.size();
                ans[active - 1]++;
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1817().new Solution();
        var ans = s.findingUsersActiveMinutes(new int[][]{{0, 5}, {1, 2}, {0, 2}, {0, 5}, {1, 3}}, 5);
        System.out.println(Arrays.toString(ans));
    }
}

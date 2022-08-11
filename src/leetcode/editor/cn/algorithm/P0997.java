package leetcode.editor.cn.algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2022-08-11 00:05
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 997. 找到小镇的法官
 */

public class P0997 {
    // code beginning
    class Solution {
        public int findJudge(int n, int[][] trust) {
            if (trust.length == 0) {
                return n == 1 ? 1 : -1;
            }
            Map<Integer, Set<Integer>> map = new HashMap<>();
            Set<Integer> trusting = new HashSet<>();
            for (int[] t : trust) {
                Set<Integer> set = map.getOrDefault(t[1], new HashSet<>());
                set.add(t[0]);
                map.put(t[1], set);
                trusting.add(t[0]);
            }
            System.out.println(map);
            for (Map.Entry<Integer, Set<Integer>> entry : map.entrySet()) {
                int key = entry.getKey();
                Set<Integer> set = entry.getValue();
                if (!trusting.contains(key) && set.size() == n - 1) return key;
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0997().new Solution();
        Object ans = s.findJudge(3, new int[][]{{1, 3}, {2, 3}, {3, 1}});
        System.out.println(ans);
        ans = s.findJudge(3, new int[][]{{1, 3}, {2, 3}});
        System.out.println(ans);
        ans = s.findJudge(1, new int[][]{});
        System.out.println(ans);
    }
}
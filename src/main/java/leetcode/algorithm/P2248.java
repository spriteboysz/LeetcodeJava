package leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-16 23:52
 * LastEditTime: 2022-07-16 23:52
 * Description: 2248. 多个数组求交集
 */

public class P2248 {
    // code beginning
    class Solution {
        public List<Integer> intersection(int[][] nums) {
            int[] count = new int[1005];
            for (int[] arr : nums) {
                for (int num : arr) {
                    count[num]++;
                }
            }

            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < 1005; i++) {
                if (count[i] == nums.length) list.add(i);
            }
            return list;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2248().new Solution();
        Object ans = s.intersection(new int[][]{{1, 2, 3}, {4, 5, 6}});
        System.out.println(ans);
    }
}
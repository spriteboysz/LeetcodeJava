package leetcode.editor.cn.algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2023-02-26 16:52
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 2441. 与对应负数同时存在的最大正整数
 */

public class P2441 {
    // code beginning
    class Solution {
        public int findMaxK(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for (int num : nums) {
                set.add(num);
            }

            Arrays.sort(nums);
            for (int num : nums) {
                if (num >= 0) {
                    return -1;
                } else {
                    if (set.contains(-num)) {
                        return -num;
                    }
                }
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2441().new Solution();
        Object ans = s.findMaxK(new int[]{-1, 10, 6, 7, -7, 1});
        System.out.println(ans);
    }
}

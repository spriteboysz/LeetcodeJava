package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-01 23:37
 * LastEditTime: 2022-07-01 23:37
 * Description: 2176. 统计数组中相等且可以被整除的数对
 */

public class P2176 {
    // code beginning
    class Solution {
        public int countPairs(int[] nums, int k) {
            int count = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] == nums[j] && (i * j) % k == 0) count++;
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2176().new Solution();
        Object ans = s.countPairs(new int[]{1, 2, 3, 4}, 1);
        System.out.println(ans);
    }
}
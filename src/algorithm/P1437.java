package algorithm;

/**
 * Author: Deean
 * Date: 2022-08-11 22:52
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 1437. 是否所有 1 都至少相隔 k 个元素
 */

public class P1437 {
    // code beginning
    class Solution {
        public boolean kLengthApart(int[] nums, int k) {
            int count = k;
            for (int num : nums) {
                if (num == 1) {
                    if (count < k) return false;
                    count = 0;
                } else {
                    count++;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1437().new Solution();
        Object ans = s.kLengthApart(new int[]{1, 0, 0, 1, 0, 1}, 2);
        System.out.println(ans);
        ans = s.kLengthApart(new int[]{1, 1, 1, 1, 1, 1, 1}, 0);
        System.out.println(ans);
    }
}
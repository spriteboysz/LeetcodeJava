package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-02 19:20
 * FileName: src/leetcode/algorithm
 * Description:2717. 半有序排列
 */

public class P2717 {
    // code beginning
    class Solution {
        public int semiOrderedPermutation(int[] nums) {
            int n = nums.length, p = 0, q = 0;
            for (int i = 0; i < n; i++) {
                if (nums[i] == 1) p = i;
                else if (nums[i] == n) q = i; // 注意 n>=2
            }
            return p + n - 1 - q - (p > q ? 1 : 0);
        }
    }

    public static void main(String[] args) {
        Solution s = new P2717().new Solution();
        Object ans = s.semiOrderedPermutation(new int[]{2, 1, 4, 3});
        System.out.println(ans);
    }
}

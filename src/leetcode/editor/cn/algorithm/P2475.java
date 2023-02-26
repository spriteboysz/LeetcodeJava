package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2023-02-26 15:58
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 2475. 数组中不等三元组的数目
 */

public class P2475 {
    // code beginning
    class Solution {
        public int unequalTriplets(int[] nums) {
            int[] cnt = new int[1001];
            for (int num : nums) {
                cnt[num] += 1;
            }

            int ans = 0, left = 0, right = nums.length;
            for (int i = 1; i <= 1000; i++) {
                if (cnt[i] == 0) continue;
                right -= cnt[i];
                ans += left * cnt[i] * right;
                left += cnt[i];
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2475().new Solution();
        Object ans = s.unequalTriplets(new int[]{4, 4, 2, 4, 3});
        System.out.println(ans);
    }
}

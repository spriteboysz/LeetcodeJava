package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-02-26 16:24
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description:
 */

public class P2455 {
    // code beginning
    class Solution {
        public int averageValue(int[] nums) {
            int sum = 0, cnt = 0;
            for (int num : nums) {
                if (num % 6 == 0) {
                    sum += num;
                    cnt += 1;
                }
            }
            return cnt == 0 ? 0 : sum / cnt;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2455().new Solution();
        Object ans = s.averageValue(new int[]{1, 3, 6, 10, 12, 15});
        System.out.println(ans);
    }
}

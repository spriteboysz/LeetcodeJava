package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2024-06-12 22:43
 * FileName: src/main/java/leetcode/algorithm
 * Description: 3028. 边界上的蚂蚁
 */

public class P3028 {
    // code beginning
    class Solution {
        public int returnToBoundaryCount(int[] nums) {
            int cnt = 0, acc = 0;
            for (int num : nums) {
                acc += num;
                if (acc == 0) {
                    cnt += 1;
                }
            }
            return cnt;
        }
    }

    public static void main(String[] args) {
        Solution s = new P3028().new Solution();
        var ans = s.returnToBoundaryCount(new int[]{2, 3, -5});
        System.out.println(ans);
    }
}

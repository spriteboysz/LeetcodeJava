package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-17 21:42
 * FileName: src/main/java/leetcode/algorithm
 * Description:453. 最小操作次数使数组元素相等
 */

public class P0453 {
    // code beginning
    class Solution {
        public int minMoves(int[] nums) {
            int minimum = Integer.MAX_VALUE;
            for (int num : nums) {
                minimum = Math.min(minimum, num);
            }
            int moves = 0;
            for (int num : nums) {
                moves += (num - minimum);
            }
            return moves;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0453().new Solution();
        var ans = s.minMoves(new int[]{1, 2, 3});
        System.out.println(ans);
    }
}

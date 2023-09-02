package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-02-26 22:02
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description:
 */

public class P2413 {
    // code beginning
    class Solution {
        public int smallestEvenMultiple(int n) {
            return n % 2 == 0 ? n : n * 2;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2413().new Solution();
        Object ans = s.smallestEvenMultiple(5);
        System.out.println(ans);
    }
}

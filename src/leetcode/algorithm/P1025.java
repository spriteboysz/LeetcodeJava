package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-17 22:44
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 1025. 除数博弈
 */

public class P1025 {
    // code beginning
    class Solution {
        public boolean divisorGame(int n) {
            return n % 2 == 0;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1025().new Solution();
        Object ans = s.divisorGame(2);
        System.out.println(ans);
    }
}
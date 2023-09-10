package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-07 23:53
 * FileName: src/leetcode/algorithm
 * Description:2582. 递枕头
 */

public class P2582 {
    // code beginning
    class Solution {
        public int passThePillow(int n, int time) {
            int round = time / (n - 1), index = time % (n - 1);
            return round % 2 == 1 ? n - index : index + 1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2582().new Solution();
        Object ans = s.passThePillow(4, 5);
        System.out.println(ans);
    }
}

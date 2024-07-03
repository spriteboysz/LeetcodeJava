package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2024-06-28 22:31
 * FileName: src/main/java/leetcode/algorithm
 * Description:
 */

public class P3178 {
    // code beginning
    class Solution {
        public int numberOfChild(int n, int k) {
            int t = k % (n - 1);
            return k / (n - 1) % 2 > 0 ? n - t - 1 : t;
        }
    }

    public static void main(String[] args) {
        Solution s = new P3178().new Solution();
        var ans = s.numberOfChild(3, 5);
        System.out.println(ans);
    }
}

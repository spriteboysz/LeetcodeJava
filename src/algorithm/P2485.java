package algorithm;

/**
 * Author: Deean
 * Date: 2023-02-26 15:49
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 2485. 找出中枢整数
 */

public class P2485 {
    // code beginning
    class Solution {
        public int pivotInteger(int n) {
            int sum = n * (n + 1) / 2;
            int x = (int) Math.sqrt(sum);
            return x * x == sum ? x : -1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2485().new Solution();
        Object ans = s.pivotInteger(8);
        System.out.println(ans);
    }
}

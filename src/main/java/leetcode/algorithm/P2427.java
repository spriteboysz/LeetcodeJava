package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-02-26 17:41
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 2427. 公因子的数目
 */

public class P2427 {
    // code beginning
    class Solution {
        public int commonFactors(int a, int b) {
            int cnt = 0, minimum = Math.min(a, b);
            for (int i = 1; i <= minimum; i++) {
                if (a % i == 0 && b % i == 0) {
                    cnt += 1;
                }
            }
            return cnt;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2427().new Solution();
        Object ans = s.commonFactors(25, 30);
        System.out.println(ans);
    }
}

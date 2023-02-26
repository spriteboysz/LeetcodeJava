package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2023-02-26 15:55
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 2481. 分割圆的最少切割次数
 */

public class P2481 {
    // code beginning
    class Solution {
        public int numberOfCuts(int n) {
            if (n == 1) {
                return 0;
            }
            return n % 2 == 0 ? n / 2 : n;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2481().new Solution();
        Object ans = s.numberOfCuts(4);
        System.out.println(ans);
    }
}

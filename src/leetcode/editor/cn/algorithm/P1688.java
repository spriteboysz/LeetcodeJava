package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-02 21:21
 * LastEditTime: 2022-07-02 21:21
 * Description: 1688. 比赛中的配对次数
 */

public class P1688 {
    // code beginning
    class Solution {
        public int numberOfMatches(int n) {
            int count = 0;
            while (n > 1) {
                if (n % 2 == 0) {
                    n /= 2;
                    count += n;
                } else {
                    n /= 2;
                    count += n + 1;
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1688().new Solution();
        Object ans = s.numberOfMatches(14);
        System.out.println(ans);   // 13
    }
}
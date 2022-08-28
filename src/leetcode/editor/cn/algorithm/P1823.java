package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-27 23:59
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 1823. 找出游戏的获胜者
 */

public class P1823 {
    // code beginning
    class Solution {
        public int findTheWinner(int n, int k) {
            if (n == 1) return 1;
            int x = findTheWinner(n - 1, k);
            return (x + k - 1) % n + 1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1823().new Solution();
        Object ans = s.findTheWinner(6, 5);
        System.out.println(ans);
    }
}
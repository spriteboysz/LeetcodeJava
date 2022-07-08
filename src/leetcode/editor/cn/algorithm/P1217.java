package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-08 22:02
 * LastEditTime: 2022-07-08 22:02
 * Description: 1217. 玩筹码
 */

public class P1217 {
    // code beginning
    class Solution {
        public int minCostToMoveChips(int[] position) {
            int even = 0, odd = 0;
            for (int pos : position) {
                if (pos % 2 == 0) even++;
                if (pos % 2 != 0) odd++;
            }
            return Math.min(odd, even);
        }
    }

    public static void main(String[] args) {
        Solution s = new P1217().new Solution();
        Object ans = s.minCostToMoveChips(new int[]{2, 2, 2, 3, 3});
        System.out.println(ans);
    }
}
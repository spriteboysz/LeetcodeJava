package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-28 21:57
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 754. 到达终点数字
 */

public class P0754 {
    // code beginning
    class Solution {
        public int reachNumber(int target) {
            target = Math.abs(target);
            int k = 0;
            while (target > 0)
                target -= ++k;
            return target % 2 == 0 ? k : k + 1 + k % 2;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0754().new Solution();
        Object ans = s.reachNumber(10);
        System.out.println(ans);
    }
}
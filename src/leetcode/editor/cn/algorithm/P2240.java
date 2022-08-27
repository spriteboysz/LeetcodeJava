package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-27 23:04
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 2240. 买钢笔和铅笔的方案数
 */

public class P2240 {
    // code beginning
    class Solution {
        public long waysToBuyPensPencils(int total, int cost1, int cost2) {
            long count = 0L;
            if (cost1 < cost2) {
                int temp = cost1;
                cost1 = cost2;
                cost2 = temp;
            }
            for (long i = 0; i <= total / cost1; i++) {
                count += (total - i * cost1) / cost2 + 1;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2240().new Solution();
        Object ans = s.waysToBuyPensPencils(5, 10, 10);
        System.out.println(ans);
        ans = s.waysToBuyPensPencils(20, 10, 5);
        System.out.println(ans);
    }
}
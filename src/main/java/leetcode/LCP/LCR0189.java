package leetcode.LCP;

/**
 * Author: Deean
 * Date: 2023-10-01 20:03
 * FileName: src/main/java/leetcode/LCP
 * Description:LCR 189. 设计机械累加器
 */

public class LCR0189 {
    // code beginning
    class Solution {
        public int mechanicalAccumulator(int target) {
            if (target == 1) return 1;
            return mechanicalAccumulator(target - 1) + target;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0189().new Solution();
        var ans = s.mechanicalAccumulator(7);
        System.out.println(ans);
    }
}

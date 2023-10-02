package leetcode.LCP;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Deean
 * Date: 2023-10-01 19:46
 * FileName: src/main/java/leetcode/LCP
 * Description:LCR 178. 训练计划 VI
 */

public class LCR0178 {
    // code beginning
    class Solution {
        public int trainingPlan(int[] actions) {
            Map<Integer, Integer> hash = new HashMap<>();
            for (int action : actions) {
                hash.put(action, hash.getOrDefault(action, 0) + 1);
            }
            for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
                if (entry.getValue() == 1) {
                    return entry.getKey();
                }
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0178().new Solution();
        var ans = s.trainingPlan(new int[]{12, 1, 6, 12, 6, 12, 6});
        System.out.println(ans);
    }
}

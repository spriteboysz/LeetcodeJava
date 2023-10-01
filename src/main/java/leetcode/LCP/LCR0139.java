package leetcode.LCP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-09-30 16:45
 * FileName: src/main/java/leetcode/LCP
 * Description:LCR 139. 训练计划 I
 */

public class LCR0139 {
    // code beginning
    class Solution {
        public int[] trainingPlan(int[] actions) {
            if (actions.length <= 1) return actions;
            List<Integer> even = new ArrayList<>(), odd = new ArrayList<>();
            for (int action : actions) {
               if (action % 2 == 1) {
                   odd.add(action);
               } else {
                   even.add(action);
               }
            }
            odd.addAll(even);
            for (int i = 0; i < actions.length; i++) {
                actions[i] = odd.get(i);
            }
            return actions;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0139().new Solution();
        var ans = s.trainingPlan(new int[]{1,2,3,4,5});
        System.out.println(Arrays.toString(ans));
    }
}

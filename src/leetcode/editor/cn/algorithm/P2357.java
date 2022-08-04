package leetcode.editor.cn.algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2022-08-04 23:25
 * Description: 2357. 使数组中所有元素都等于零
 */

public class P2357 {
    // code beginning
    class Solution {
        public int minimumOperations(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for (int num : nums) {
                if (num != 0) {
                    set.add(num);
                }
            }
            return set.size();
        }
    }

    public static void main(String[] args) {
        Solution s = new P2357().new Solution();
        Object ans = s.minimumOperations(new int[]{1, 5, 0, 3, 5});
        System.out.println(ans);
    }
}

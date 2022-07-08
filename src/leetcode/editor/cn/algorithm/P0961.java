package leetcode.editor.cn.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Deean
 * Date: 2022-07-08 23:49
 * LastEditTime: 2022-07-08 23:49
 * Description: 961. 在长度 2N 的数组中找出重复 N 次的元素
 */

public class P0961 {
    // code beginning
    class Solution {
        public int repeatedNTimes(int[] nums) {
            HashMap<Integer, Integer> count = new HashMap<>();
            for (int num : nums) {
                count.put(num, count.getOrDefault(num, 0) + 1);
            }
            for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
                if (entry.getValue() == nums.length / 2) return entry.getKey();
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0961().new Solution();
        Object ans = s.repeatedNTimes(new int[]{5, 1, 5, 2, 5, 3, 5, 4});
        System.out.println(ans);
    }
}
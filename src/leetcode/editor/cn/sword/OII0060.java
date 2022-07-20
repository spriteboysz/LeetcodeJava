package leetcode.editor.cn.sword;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-20 22:46
 * LastEditTime: 2022-07-20 22:46
 * Description: 剑指 Offer II 060. 出现频率最高的 k 个数字
 */

public class OII0060 {
    // code beginning
    class Solution {
        public int[] topKFrequent(int[] nums, int k) {
            HashMap<Integer, Integer> count = new HashMap<>();
            for (int num : nums) {
                count.put(num, count.getOrDefault(num, 0) + 1);
            }
            List<Integer> keys = new ArrayList<>(count.keySet());
            keys.sort((o1, o2) -> count.get(o2) - count.get(o1));
            int[] top = new int[k];
            for (int i = 0; i < k; i++) {
                top[i] = keys.get(i);
            }
            return top;
        }
    }

    public static void main(String[] args) {
        Solution s = new OII0060().new Solution();
        int[] ans = s.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);
        System.out.println(Arrays.toString(ans));
    }
}
package leetcode.editor.cn.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author: Deean
 * Date: 2022-07-24 22:53
 * LastEditTime: 2022-07-24 22:53
 * Description: 2150. 找出数组中的所有孤独数字
 */

public class P2150 {
    // code beginning
    class Solution {
        public List<Integer> findLonely(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            List<Integer> lonely = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int key = entry.getKey(), value = entry.getValue();
                if (value == 1 && !map.containsKey(key + 1) && !map.containsKey(key - 1)) {
                    lonely.add(key);
                }
            }
            return lonely;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2150().new Solution();
        Object ans = s.findLonely(new int[]{1, 3, 5, 3});
        System.out.println(ans);
    }
}
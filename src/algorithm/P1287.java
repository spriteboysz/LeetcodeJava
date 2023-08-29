package algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Deean
 * Date: 2022-08-07 14:27
 * Description: 1287. 有序数组中出现次数超过25%的元素
 */

public class P1287 {
    // code beginning
    class Solution {
        public int findSpecialInteger(int[] arr) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : arr) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            for (int key : map.keySet()) {
                if (map.get(key) > arr.length / 4) return key;
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1287().new Solution();
        Object ans = s.findSpecialInteger(new int[]{1, 2, 2, 6, 6, 6, 6, 7, 10});
        System.out.println(ans);
    }
}
package algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Deean
 * Date: 2022-07-13 22:32
 * LastEditTime: 2022-07-13 22:32
 * Description: 1394. 找出数组中的幸运数
 */

public class P1394 {
    // code beginning
    class Solution {
        public int findLucky(int[] arr) {
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            for (int num : arr) {
                hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
            }

            int lucky = -1;
            for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
                int key = entry.getKey(), value = entry.getValue();
                if (key == value) {
                    lucky = Math.max(lucky, entry.getKey());
                }
            }
            return lucky;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1394().new Solution();
        Object ans = s.findLucky(new int[]{1, 2, 2, 3, 3, 3});
        System.out.println(ans);
        ans = s.findLucky(new int[]{1, 1, 1, 2});
        System.out.println(ans);
    }
}
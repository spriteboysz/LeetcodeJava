package algorithm;

import java.util.*;

/**
 * Author: Deean
 * Date: 2022-07-25 23:13
 * LastEditTime: 2022-07-25 23:13
 * Description: 1481. 不同整数的最少数目
 */

public class P1481 {
    // code beginning
    class Solution {
        public int findLeastNumOfUniqueInts(int[] arr, int k) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : arr) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            List<Integer> count = new ArrayList<>(map.values());
            count.sort(Comparator.comparingInt(o -> o));
            // System.out.println(count);
            int size = map.size();
            for (int c : count) {
                if (k >= c) {
                    k -= c;
                    size--;
                } else {
                    break;
                }
            }
            return size;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1481().new Solution();
        Object ans = s.findLeastNumOfUniqueInts(new int[]{4, 3, 1, 1, 3, 3, 2}, 2);
        System.out.println(ans);
    }
}
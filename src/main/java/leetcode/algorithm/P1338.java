package leetcode.algorithm;

import java.util.*;

/**
 * Author: Deean
 * Date: 2023-09-14 22:56
 * FileName: src/main/java/leetcode/algorithm
 * Description:1338. 数组大小减半
 */

public class P1338 {
    // code beginning
    class Solution {
        public int minSetSize(int[] arr) {
            Map<Integer, Integer> hash = new HashMap<>();
            for (int num : arr) {
                hash.put(num, hash.getOrDefault(num, 0) + 1);
            }
            List<Integer> cnt = new ArrayList<>();

            for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
                cnt.add(entry.getValue());
            }
            cnt.sort((a, b) -> b - a);
            int sum = 0;
            for (int i = 0, n = arr.length, m = hash.keySet().size(); i < m; i++) {
                if (sum >= n / 2) {
                    return i;
                }
                sum += cnt.get(i);
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1338().new Solution();
        var ans = s.minSetSize(new int[]{3, 3, 3, 3, 5, 5, 5, 2, 2, 7});
        System.out.println(ans);
    }
}

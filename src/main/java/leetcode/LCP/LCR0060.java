package leetcode.LCP;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Author: Deean
 * Date: 2023-09-30 15:22
 * FileName: src/main/java/leetcode/algorithm
 * Description:LCR 060. 前 K 个高频元素
 */

public class LCR0060 {
    // code beginning
    class Solution {
        public int[] topKFrequent(int[] nums, int k) {
            Map<Integer, Integer> hash = new HashMap<>();
            for (int num : nums) {
                hash.put(num, hash.getOrDefault(num, 0) + 1);
            }
            int[][] count = new int[hash.size()][2];
            int pos = 0;
            for (Map.Entry<Integer, Integer> entry: hash.entrySet()) {
                count[pos][0] = entry.getKey();
                count[pos][1] = entry.getValue();
                pos++;
            }
            Arrays.sort(count, (c1, c2)->c2[1]-c1[1]);
            int[] frequent = new int[k];
            for (int i = 0; i < k; i++) {
                frequent[i] = count[i][0];
            }
            return frequent;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0060().new Solution();
        var ans = s.topKFrequent(new int[]{1,1,1,2,2,3}, 2);
        System.out.println(Arrays.toString(ans));
    }
}

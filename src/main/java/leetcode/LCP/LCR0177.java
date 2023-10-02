package leetcode.LCP;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Author: Deean
 * Date: 2023-10-01 19:41
 * FileName: src/main/java/leetcode/LCP
 * Description:LCR 177. 撞色搭配
 */

public class LCR0177 {
    // code beginning
    class Solution {
        public int[] sockCollocation(int[] sockets) {
            Map<Integer, Integer> hash = new HashMap<>();
            for (int socket : sockets) {
                hash.put(socket, hash.getOrDefault(socket, 0) + 1);
            }
            int[] single = new int[2];
            int pos = 0;
            for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
                if (entry.getValue() == 1) {
                    single[pos] = entry.getKey();
                    pos += 1;
                }
            }
            return single;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0177().new Solution();
        var ans = s.sockCollocation(new int[]{1, 2, 4, 1, 4, 3, 12, 3});
        System.out.println(Arrays.toString(ans));
    }
}

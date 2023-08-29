package algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Deean
 * Date: 2022-08-27 23:39
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 2048. 下一个更大的数值平衡数
 */

public class P2048 {
    // code beginning
    class Solution {
        public int nextBeautifulNumber(int n) {
            for (int i = n + 1; i <= 10e6; i++) {
                if (isBeautiful(i)) return i;
            }
            return -1;
        }

        private boolean isBeautiful(int num) {
            Map<Integer, Integer> map = new HashMap<>();
            while (num > 0) {
                map.put(num % 10, map.getOrDefault(num % 10, 0) + 1);
                num /= 10;
            }
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (!entry.getKey().equals(entry.getValue())) return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2048().new Solution();
        Object ans = s.nextBeautifulNumber(3000);
        System.out.println(ans);
    }
}
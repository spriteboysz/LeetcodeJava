package leetcode.LCP;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Deean
 * Date: 2023-09-30 21:51
 * FileName: src/main/java/leetcode/LCP
 * Description:LCR 158. 库存管理 II
 */

public class LCR0158 {
    // code beginning
    class Solution {
        public int inventoryManagement(int[] stock) {
            Map<Integer, Integer> hash = new HashMap<>();
            for (int num : stock) {
                hash.put(num, hash.getOrDefault(num, 0) + 1);
                if (hash.get(num) > stock.length / 2) {
                    return num;
                }
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0158().new Solution();
        var ans = s.inventoryManagement(new int[]{6, 1, 3, 1, 1, 1});
        System.out.println(ans);
    }
}

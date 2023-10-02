package leetcode.LCP;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2023-09-30 21:58
 * FileName: src/main/java/leetcode/LCP
 * Description:LCR 159. 库存管理 III
 */

public class LCR0159 {
    // code beginning
    class Solution {
        public int[] inventoryManagement(int[] stock, int cnt) {
            Arrays.sort(stock);
            return Arrays.copyOf(stock, cnt);
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0159().new Solution();
        var ans = s.inventoryManagement(new int[]{0, 2, 3, 6}, 2);
        System.out.println(Arrays.toString(ans));
    }
}

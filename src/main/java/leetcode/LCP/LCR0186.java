package leetcode.LCP;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2023-09-30 21:45
 * FileName: src/main/java/leetcode/LCP
 * Description:LCR 186. 文物朝代判断
 */

public class LCR0186 {
    // code beginning
    class Solution {
        public boolean checkDynasty(int[] places) {
            Arrays.sort(places);
            int unknown = 0;
            for (int i = 0, n = places.length; i < n - 1; i++) {
                if (places[i] == 0) {
                    unknown += 1;
                } else if (places[i] == places[i + 1]) {
                    return false;
                }
            }
            return places[4] - places[unknown] < 5;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0186().new Solution();
        var ans = s.checkDynasty(new int[]{0, 6, 9, 0, 7});
        System.out.println(ans);
    }
}

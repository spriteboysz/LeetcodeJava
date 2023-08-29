package algorithm;

/**
 * Author: Deean
 * Date: 2023-02-26 11:07
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 2549. 统计桌面上的不同数字
 */

public class P2549 {
    // code beginning
    class Solution {
        public int distinctIntegers(int n) {
            return n > 1 ? n - 1 : 1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2549().new Solution();
        Object ans = s.distinctIntegers(5);
        System.out.println(ans);
    }
}

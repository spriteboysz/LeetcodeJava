package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-15 22:52
 * FileName: src/main/java/leetcode/algorithm
 * Description:868. 二进制间距
 */

public class P0868 {
    // code beginning
    class Solution {
        public int binaryGap(int n) {
            int last = -1, maximum = 0;
            for (int i = 0; n != 0; i++) {
                if ((n & 1) == 1) {
                    if (last != -1) {
                        maximum = Math.max(maximum, i - last);
                    }
                    last = i;
                }
                n >>= 1;
            }
            return maximum;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0868().new Solution();
        var ans = s.binaryGap(22);
        System.out.println(ans);
    }
}

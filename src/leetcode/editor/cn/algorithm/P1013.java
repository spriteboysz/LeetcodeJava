package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-25 23:06
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 1013. 将数组分成和相等的三个部分
 */

public class P1013 {
    // code beginning
    class Solution {
        public boolean canThreePartsEqualSum(int[] arr) {
            int total = 0;
            for (int num : arr) total += num;
            if (total % 3 != 0) return false;
            int count = 0, cur = 0;
            for (int num : arr) {
                cur += num;
                if (cur == total / 3) {
                    count++;
                    cur = 0;
                }
            }
            return count >= 3;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1013().new Solution();
        Object ans = s.canThreePartsEqualSum(new int[]{3, 3, 6, 5, -2, 2, 5, 1, -9, 4});
        System.out.println(ans);
        ans = s.canThreePartsEqualSum(new int[]{0, 2, 1, -6, 6, 7, 9, -1, 2, 0, 1});
        System.out.println(ans);
    }
}
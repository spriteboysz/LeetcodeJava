package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-27 22:42
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 1566. 重复至少 K 次且长度为 M 的模式
 */

public class P1566 {
    // code beginning
    class Solution {
        public boolean containsPattern(int[] arr, int m, int k) {
            for (int i = 0; i <= arr.length - m * k; i++) {
                int offset;
                for (offset = 0; offset < m * k; offset++) {
                    if (arr[i + offset] != arr[i + offset % m]) break;
                }
                if (offset == m * k) return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1566().new Solution();
        Object ans = s.containsPattern(new int[]{1, 2, 1, 2, 1, 1, 1, 3}, 2, 2);
        System.out.println(ans);
    }
}
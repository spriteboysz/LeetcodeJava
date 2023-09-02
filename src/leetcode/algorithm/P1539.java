package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-11 23:54
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 1539. 第 k 个缺失的正整数
 */

public class P1539 {
    // code beginning
    class Solution {
        public int findKthPositive(int[] arr, int k) {
            int[] exist = new int[2001];
            for (int num : arr) {
                exist[num]++;
            }
            for (int i = 1; i < exist.length; i++) {
                if (exist[i] == 0) k--;
                if (k == 0) return i;
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1539().new Solution();
        Object ans = s.findKthPositive(new int[]{1, 2, 3, 4}, 2);
        System.out.println(ans);
    }
}
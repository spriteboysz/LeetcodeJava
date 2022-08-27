package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-27 23:13
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 2310. 个位数字为 K 的整数之和
 */

public class P2310 {
    // code beginning
    class Solution {
        public int minimumNumbers(int num, int k) {
            if (num == 0) return 0;
            for (int i = 1; i <= 10 && (num - k * i) >= 0; i++) {
                if ((num - k * i) % 10 == 0) return i;
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2310().new Solution();
        Object ans = s.minimumNumbers(58, 9);
        System.out.println(ans);
    }
}
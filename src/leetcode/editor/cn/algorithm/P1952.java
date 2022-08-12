package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-12 23:41
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 1952. 三除数
 */

public class P1952 {
    // code beginning
    class Solution {
        public boolean isThree(int n) {
            if (n == 1) return false;
            int num = (int) Math.sqrt(n);
            if (num * num != n) return false;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1952().new Solution();
        Object ans = s.isThree(36);
        System.out.println(ans);
    }
}
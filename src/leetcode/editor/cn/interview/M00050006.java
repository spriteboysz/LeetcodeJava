package leetcode.editor.cn.interview;

/**
 * Author: Deean
 * Date: 2022-07-12 23:46
 * LastEditTime: 2022-07-12 23:46
 * Description: 面试题 05.06. 整数转换
 */

public class M00050006 {
    // code beginning
    class Solution {
        public int convertInteger(int A, int B) {
            int count = 0;
            for (int i = 0; i < 32; i++) {
                count += (A >> i & 1) ^ (B >> i & 1);
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new M00050006().new Solution();
        Object ans = s.convertInteger(1, 2);
        System.out.println(ans);
    }
}
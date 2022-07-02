package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-02 22:20
 * LastEditTime: 2022-07-02 22:20
 * Description: 1837. K 进制表示下的各位数字总和
 */

public class P1837 {
    // code beginning
    class Solution {
        public int sumBase(int n, int k) {
            String s = Integer.toString(n, k);
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                sum += s.charAt(i) - '0';
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1837().new Solution();
        Object ans = s.sumBase(34, 6);
        System.out.println(ans);    // 9
    }
}
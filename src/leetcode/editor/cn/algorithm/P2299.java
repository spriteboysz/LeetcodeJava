package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-11 23:00
 * LastEditTime: 2022-07-11 23:00
 * Description: 2299. 强密码检验器 II
 */

public class P2299 {
    // code beginning
    class Solution {
        public boolean strongPasswordCheckerII(String password) {
            int n = password.length();
            if (n < 8) return false;
            boolean flag2 = false, flag3 = false, flag4 = false, flag5 = false;
            String special = "!@#$%^&*()-+";
            for (int i = 0; i < n; i++) {
                char c = password.charAt(i);
                if (Character.isLowerCase(c)) flag2 = true;
                if (Character.isUpperCase(c)) flag3 = true;
                if (Character.isDigit(c)) flag4 = true;
                if (special.contains(String.valueOf(c))) flag5 = true;
                if (i < n - 1 && c == password.charAt(i + 1)) return false;
            }
            return flag2 && flag3 && flag4 && flag5;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2299().new Solution();
        Object ans = s.strongPasswordCheckerII("Me+You--IsMyDream");
        System.out.println(ans);
        ans = s.strongPasswordCheckerII("1aB!");
        System.out.println(ans);
    }
}
package algorithm;

import java.util.TreeSet;

/**
 * Author: Deean
 * Date: 2022-07-16 22:43
 * LastEditTime: 2022-07-16 22:43
 * Description: 1796. 字符串中第二大的数字
 */

public class P1796 {
    // code beginning
    class Solution {
        public int secondHighest(String s) {
            TreeSet<Integer> set = new TreeSet<>();
            for (char c : s.toCharArray()) {
                if (Character.isDigit(c)) {
                    set.add(c - '0');
                }
                if (set.size() == 10) {
                    return 8;
                }
            }
            if (set.size() <= 1) return -1;
            set.pollLast();
            return set.pollLast();
        }
    }

    public static void main(String[] args) {
        Solution s = new P1796().new Solution();
        Object ans = s.secondHighest("abc1111");
        System.out.println(ans);
        ans = s.secondHighest("1234abc975134");
        System.out.println(ans);
    }
}
package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-08-07 20:11
 * Description: 899. 有序队列
 */

public class P0899 {
    // code beginning
    class Solution {
        public String orderlyQueue(String s, int k) {
            if (k > 1) {
                char[] chars = s.toCharArray();
                Arrays.sort(chars);
                return new String(chars);
            } else {
                String orderly = s;
                StringBuilder builder = new StringBuilder(s);
                for (int i = 0; i < s.length(); i++) {
                    builder.deleteCharAt(0).append(s.charAt(i));
                    if (builder.toString().compareTo(orderly) < 0) {
                        orderly = builder.toString();
                    }
                }
                return orderly;
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new P0899().new Solution();
        Object ans = s.orderlyQueue("cba", 1);
        System.out.println(ans);
        ans = s.orderlyQueue("baaca", 3);
        System.out.println(ans);
    }
}
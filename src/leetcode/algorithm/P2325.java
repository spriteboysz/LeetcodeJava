package leetcode.algorithm;

import java.util.HashMap;

/**
 * Author: Deean
 * Date: 2022-07-09 22:00
 * LastEditTime: 2022-07-09 22:00
 * Description: 2325. 解密消息
 */

public class P2325 {
    // code beginning
    class Solution {
        public String decodeMessage(String key, String message) {
            HashMap<Character, Character> transformation = new HashMap<>();
            char index = 'a';
            for (char c : key.toCharArray()) {
                if (Character.isLetterOrDigit(c) && !transformation.containsKey(c)) {
                    transformation.put(c, index++);
                }
            }

            StringBuilder builder = new StringBuilder();
            for (char c : message.toCharArray()) {
                if (Character.isLetterOrDigit(c)) {
                    builder.append(transformation.get(c));
                } else {
                    builder.append(c);
                }
            }
            return builder.toString();
        }
    }

    public static void main(String[] args) {
        Solution s = new P2325().new Solution();
        Object ans = s.decodeMessage("eljuxhpwnyrdgtqkviszcfmabo", "zwx hnfx lqantp mnoeius ycgk vcnjrdb");
        System.out.println(ans);
    }
}
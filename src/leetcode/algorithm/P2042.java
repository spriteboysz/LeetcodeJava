package leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-16 23:59
 * LastEditTime: 2022-07-16 23:59
 * Description: 2042. 检查句子中的数字是否递增
 */

public class P2042 {
    // code beginning
    class Solution {
        public boolean areNumbersAscending(String s) {
            List<Integer> nums = new ArrayList<>();
            String[] words = s.split(" ");
            for (String word : words) {
                if (Character.isDigit(word.charAt(0))) {
                    nums.add(Integer.parseInt(word));
                }
            }
            for (int i = 1; i < nums.size(); i++) {
                if (nums.get(i) <= nums.get(i - 1)) return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2042().new Solution();
        Object ans = s.areNumbersAscending("hello world 5 x 5");
        System.out.println(ans);
        ans = s.areNumbersAscending("sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s");
        System.out.println(ans);
    }
}
package leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-08 23:41
 * LastEditTime: 2022-07-08 23:41
 * Description: 412. Fizz Buzz
 */

public class P0412 {
    // code beginning
    class Solution {
        public List<String> fizzBuzz(int n) {
            List<String> list = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    list.add("FizzBuzz");
                } else if (i % 3 == 0) {
                    list.add("Fizz");
                } else if (i % 5 == 0) {
                    list.add("Buzz");
                } else {
                    list.add(String.valueOf(i));
                }
            }
            return list;
        }

    }

    public static void main(String[] args) {
        Solution s = new P0412().new Solution();
        Object ans = s.fizzBuzz(15);
        System.out.println(ans);
    }
}
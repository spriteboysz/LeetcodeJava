package leetcode.editor.cn.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-27 22:32
 * LastEditTime: 2022-07-27 22:32
 * Description: 2094. 找出 3 位偶数
 */

public class P2094 {
    // code beginning
    class Solution {
        public int[] findEvenNumbers(int[] digits) {
            int[] target = new int[10];
            for (int digit : digits) {
                target[digit]++;
            }
            List<Integer> even = new ArrayList<>();
            for (int i = 100; i < 999; i += 2) {
                boolean flag = true;
                int[] temp = new int[10];
                temp[i / 100]++;
                temp[i % 100 / 10]++;
                temp[i % 10]++;
                for (int j = 0; j < 10; j++) {
                    if (temp[j] > target[j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) even.add(i);
            }
            int[] evens = new int[even.size()];
            for (int i = 0; i < even.size(); i++) {
                evens[i] = even.get(i);
            }
            return evens;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2094().new Solution();
        int[] ans = s.findEvenNumbers(new int[]{2, 2, 8, 8, 2});
        System.out.println(Arrays.toString(ans));
    }
}
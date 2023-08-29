package algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-06-28 23:58
 * LastEditTime: 2022-06-28 23:58
 * Description: 728. 自除数
 */

public class P0728 {
    // code beginning
    class Solution {
        private boolean process(int num) {
            int tmp = num;
            while (tmp > 0) {
                int cur = tmp % 10;
                if (cur == 0 || num % cur != 0) return false;
                tmp /= 10;
            }
            return true;
        }

        public List<Integer> selfDividingNumbers(int left, int right) {
            List<Integer> nums = new ArrayList<>();
            for (int i = left; i <= right; i++) {
                if (process(i)) {
                    nums.add(i);
                }
            }
            return nums;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0728().new Solution();
        Object ans = s.selfDividingNumbers(47, 85);
        System.out.println(ans);
    }
}
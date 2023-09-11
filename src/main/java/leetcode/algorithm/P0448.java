package leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-15 23:22
 * LastEditTime: 2022-07-15 23:22
 * Description: 448. 找到所有数组中消失的数字
 */

public class P0448 {
    // code beginning
    class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            int[] numbers = new int[nums.length + 1];
            for (int num : nums) {
                numbers[num]++;
            }

            List<Integer> disappeared = new ArrayList<>();
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] == 0) disappeared.add(i);
            }
            return disappeared;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0448().new Solution();
        Object ans = s.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
        System.out.println(ans);
        ans = s.findDisappearedNumbers(new int[]{1, 1});
        System.out.println(ans);
    }
}
package algorithm;

import java.util.*;

/**
 * Author: @Deean
 * Date: 2022-06-24 23:10
 * LastEditTime: 2022-06-24 23:10
 * Description: 414. 第三大的数
 */

public class P0414 {
    // code beginning
    class Solution {
        public int thirdMax(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for (int num : nums) set.add(num);
            List<Integer> list = new ArrayList<>(set);
            Collections.sort(list);
            return list.size() < 3 ? list.get(list.size() - 1) : list.get(list.size() - 3);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0414().new Solution();
        Object ans = s.thirdMax(new int[]{2, 2, 3, 1});
        System.out.println(ans);
    }
}
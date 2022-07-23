package leetcode.editor.cn.algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2022-07-23 23:29
 * LastEditTime: 2022-07-23 23:29
 * Description: 287. 寻找重复数
 */

public class P0287 {
    // code beginning
    class Solution {
        public int findDuplicate(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for (int num : nums) {
                if (set.contains(num)) return num;
                set.add(num);
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0287().new Solution();
        Object ans = s.findDuplicate(new int[]{3, 1, 3, 4, 2});
        System.out.println(ans);
    }
}
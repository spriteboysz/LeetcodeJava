package leetcode.algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2022-08-05 22:18
 * Description: 1385. 两个数组间的距离值
 */

public class P1385 {
    // code beginning
    class Solution {
        public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
            Set<Integer> set = new HashSet<>();
            for (int num : arr2) {
                for (int i = -d; i <= d; i++) {
                    set.add(num + i);
                }
            }
            int count = 0;
            for (int num : arr1) {
                if (!set.contains(num)) count++;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1385().new Solution();
        Object ans = s.findTheDistanceValue(new int[]{1, 4, 2, 3}, new int[]{-4, -3, 6, 10, 20, 30}, 3);
        System.out.println(ans);
    }
}
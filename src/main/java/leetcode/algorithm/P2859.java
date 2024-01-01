package leetcode.algorithm;

import leetcode.common.Utils;

import java.util.List;

/**
 * Author: Deean
 * Date: 2023-12-31 20:23
 * FileName: src/main/java/leetcode/algorithm
 * Description: 2859. 计算 K 置位下标对应元素的和
 */

public class P2859 {
    // code beginning
    class Solution {
        public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
            int sum = 0;
            for (int i = 0; i < nums.size(); i++) {
                if (process(i) == k) {
                    sum += nums.get(i);
                }
            }
            return sum;
        }

        public int process(int n) {
            int count = 0;
            while (n != 0) {
                if ((n & 1) == 1) {
                    count++;
                }
                n = n >> 1;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2859().new Solution();
        var ans = s.sumIndicesWithKSetBits(Utils.toList("[5,10,1,5,2]"), 1);
        System.out.println(ans);
    }
}

package leetcode.algorithm;

import leetcode.common.Utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-09-16 13:54
 * FileName: src/main/java/leetcode/algorithm
 * Description:378. 有序矩阵中第 K 小的元素
 */

public class P0378 {
    // code beginning
    class Solution {
        public int kthSmallest(int[][] matrix, int k) {
            List<Integer> nums = new ArrayList<>();
            for (int[] row : matrix) {
                for (int num : row) {
                    nums.add(num);
                }
            }
            Collections.sort(nums);
            return nums.get(k - 1);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0378().new Solution();
        var ans = s.kthSmallest(Utils.to2DArray("[[1,5,9],[10,11,13],[12,13,15]]"), 8);
        System.out.println(ans);
    }
}

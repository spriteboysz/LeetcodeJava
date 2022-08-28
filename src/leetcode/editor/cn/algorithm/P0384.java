package leetcode.editor.cn.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Author: Deean
 * Date: 2022-08-28 20:45
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 384. 打乱数组
 */

public class P0384 {
    // code beginning
    class Solution {
        int[] nums;

        public Solution(int[] nums) {
            this.nums = nums;
        }

        public int[] reset() {
            return nums;
        }

        public int[] shuffle() {
            int[] shuffled = new int[nums.length];
            List<Integer> list = new ArrayList<>();
            for (int num : nums) list.add(num);
            Random random = new Random();
            for (int i = 0; i < nums.length; ++i) {
                int j = random.nextInt(list.size());
                shuffled[i] = list.remove(j);
            }
            return shuffled;
        }
    }

    public static void main(String[] args) {
        Solution solution = new P0384().new Solution(new int[]{1, 2, 3});
        System.out.println(Arrays.toString(solution.shuffle()));    // 打乱数组 [1,2,3] 并返回结果。
        System.out.println(Arrays.toString(solution.reset()));      // 重设数组到它的初始状态 [1, 2, 3] 。
        System.out.println(Arrays.toString(solution.shuffle()));    // 随机返回数组 [1, 2, 3] 打乱后的结果。
    }
}
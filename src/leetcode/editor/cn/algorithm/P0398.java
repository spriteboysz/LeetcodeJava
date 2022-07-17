package leetcode.editor.cn.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * Author: Deean
 * Date: 2022-07-17 23:00
 * LastEditTime: 2022-07-17 23:00
 * Description: 398. 随机数索引
 */

public class P0398 {
    // code beginning
    class Solution {
        HashMap<Integer, List<Integer>> count;
        Random random = new Random();

        public Solution(int[] nums) {
            count = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                List<Integer> index = count.getOrDefault(nums[i], new ArrayList<>());
                index.add(i);
                count.put(nums[i], index);
            }
        }

        public int pick(int target) {
            List<Integer> index = count.getOrDefault(target, new ArrayList<>());
            return index.get(random.nextInt(index.size()));
        }
    }

    public static void main(String[] args) {
        Solution solution = new P0398().new Solution(new int[]{1, 2, 3, 3, 3, 2, 1, 3, 2, 1, 3, 1});
        System.out.println(solution.pick(3)); // 随机返回索引 2, 3 或者 4 之一。每个索引的返回概率应该相等。
        System.out.println(solution.pick(1)); // 返回 0 。因为只有 nums[0] 等于 1 。
        System.out.println(solution.pick(3)); // 随机返回索引 2, 3 或者 4 之一。每个索引的返回概率应该相等。
    }
}
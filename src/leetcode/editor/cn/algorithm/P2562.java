package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2023-02-25 22:56
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 2562. 找出数组的串联值
 */

public class P2562 {
    // code beginning
    class Solution {
        public long findTheArrayConcVal(int[] nums) {
            long concval = 0L;
            for (int i = 0; i < nums.length / 2; i++) {
                String s = String.valueOf(nums[i]) + nums[nums.length - i - 1];
                concval += Integer.parseInt(s);
            }

            return concval + (nums.length % 2 == 1 ? nums[nums.length / 2] : 0);
        }
    }

    public static void main(String[] args) {
        Solution s = new P2562().new Solution();
        Object ans = s.findTheArrayConcVal(new int[]{7, 52, 2, 4});
        System.out.println(ans);
        ans = s.findTheArrayConcVal(new int[]{5, 14, 13, 8, 12});
        System.out.println(ans);
    }
}

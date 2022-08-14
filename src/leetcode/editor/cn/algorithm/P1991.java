package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-14 23:04
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 1991. 找到数组的中间位置
 */

public class P1991 {
    // code beginning
    class Solution {
        public int findMiddleIndex(int[] nums) {
            int sum = 0, pre = 0;
            for (int num : nums) sum += num;
            for (int i = 0; i < nums.length; i++) {
                if (2 * pre + nums[i] == sum) {
                    return i;
                }
                pre += nums[i];
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1991().new Solution();
        Object ans = s.findMiddleIndex(new int[]{1, -1, 4});
        System.out.println(ans);
    }
}
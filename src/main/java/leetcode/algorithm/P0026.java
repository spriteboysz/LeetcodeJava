package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-16 17:13
 * FileName: src/main/java/leetcode/algorithm
 * Description:26. 删除有序数组中的重复项
 */

public class P0026 {
    // code beginning
    class Solution {
        public int removeDuplicates(int[] nums) {
            int n = nums.length;
            if (n == 0) {
                return 0;
            }
            int fast = 1, slow = 1;
            while (fast < n) {
                if (nums[fast] != nums[fast - 1]) {
                    nums[slow] = nums[fast];
                    ++slow;
                }
                ++fast;
            }
            return slow;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0026().new Solution();
        var ans = s.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4});
        System.out.println(ans);
    }
}

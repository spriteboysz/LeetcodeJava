package algorithm;

/**
 * Author: Deean
 * Date: 2022-07-16 00:02
 * LastEditTime: 2022-07-16 00:02
 * Description: 2148. 元素计数
 */

public class P2148 {
    // code beginning
    class Solution {
        public int countElements(int[] nums) {
            if (nums.length < 3) return 0;
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            for (int num : nums) {
                min = Math.min(min, num);
                max = Math.max(max, num);
            }
            int count = 0;
            for (int num : nums) {
                if (num != min && num != max) count++;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2148().new Solution();
        Object ans = s.countElements(new int[]{-3, 3, 3, 90});
        System.out.println(ans);
    }
}
package algorithm;

/**
 * Author: Deean
 * Date: 2022-07-27 23:32
 * LastEditTime: 2022-07-27 23:32
 * Description: 2317. 操作后的最大异或和
 */

public class P2317 {
    // code beginning
    class Solution {
        public int maximumXOR(int[] nums) {
            int max = 0;
            for (int num : nums) {
                max |= num;
            }
            return max;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2317().new Solution();
        Object ans = s.maximumXOR(new int[]{1, 2, 3, 9, 2});
        System.out.println(ans);
    }
}
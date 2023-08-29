package algorithm;

/**
 * Author: Deean
 * Date: 2022-08-18 23:37
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 941. 有效的山脉数组
 */

public class P0941 {
    // code beginning
    class Solution {
        public boolean validMountainArray(int[] arr) {
            StringBuilder builder = new StringBuilder();
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > arr[i - 1]) {
                    builder.append(0);
                } else if (arr[i] < arr[i - 1]) {
                    builder.append(1);
                } else {
                    return false;
                }
            }
            return !builder.toString().contains("10") && builder.toString().contains("01");
        }
    }

    public static void main(String[] args) {
        Solution s = new P0941().new Solution();
        Object ans = s.validMountainArray(new int[]{3, 5, 5});
        System.out.println(ans);
        ans = s.validMountainArray(new int[]{0, 3, 2, 1});
        System.out.println(ans);
    }
}
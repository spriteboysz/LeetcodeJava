package leetcode.sword;

/**
 * Author: Deean
 * Date: 2022-07-10 16:52
 * LastEditTime: 2022-07-10 16:52
 * Description: 剑指 Offer II 069. 山峰数组的顶部
 */

public class OII0069 {
    // code beginning
    class Solution {
        public int peakIndexInMountainArray(int[] arr) {
            int n = arr.length, left = 0, right = n - 2;
            while (left < right) {
                int mid = (left + right) / 2;
                if (arr[mid] > arr[mid + 1]) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            return right;
        }
    }

    public static void main(String[] args) {
        Solution s = new OII0069().new Solution();
        Object ans = s.peakIndexInMountainArray(new int[]{1, 3, 5, 4, 2});
        System.out.println(ans);
        ans = s.peakIndexInMountainArray(new int[]{3, 4, 5, 1});
        System.out.println(ans);
        ans = s.peakIndexInMountainArray(new int[]{24, 69, 100, 99, 79, 78, 67, 36, 26, 19});
        System.out.println(ans);
    }
}
package algorithm;

/**
 * Author: Deean
 * Date: 2022-07-20 22:57
 * LastEditTime: 2022-07-20 22:57
 * Description: 852. 山脉数组的峰顶索引
 */

public class P0852 {
    // code beginning
    class Solution {
        public int peakIndexInMountainArray(int[] arr) {
            int left = 1, right = arr.length - 2, peak = 0;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (arr[mid] > arr[mid + 1]) {
                    peak = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            return peak;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0852().new Solution();
        Object ans = s.peakIndexInMountainArray(new int[]{24, 69, 100, 99, 79, 78, 67, 36, 26, 19});
        System.out.println(ans);
    }
}
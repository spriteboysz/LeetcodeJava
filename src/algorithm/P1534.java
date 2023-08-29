package algorithm;

/**
 * Author: Deean
 * Date: 2022-07-03 16:57
 * LastEditTime: 2022-07-03 16:57
 * Description: 1534. 统计好三元组
 */

public class P1534 {
    // code beginning
    class Solution {
        public int countGoodTriplets(int[] arr, int a, int b, int c) {
            int count = 0;
            for (int i = 0; i < arr.length - 2; i++) {
                for (int j = i + 1; j < arr.length - 1; j++) {
                    if (Math.abs(arr[i] - arr[j]) <= a) {
                        for (int k = j + 1; k < arr.length; k++) {
                            if (Math.abs(arr[j] - arr[k]) <= b && (Math.abs(arr[i] - arr[k]) <= c)) {
                                count++;
                            }
                        }
                    }
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1534().new Solution();
        Object ans = s.countGoodTriplets(new int[]{1, 1, 2, 2, 3}, 0, 0, 1);
        System.out.println(ans);
    }
}
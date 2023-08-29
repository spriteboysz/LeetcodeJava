package algorithm;

/**
 * Author: Deean
 * Date: 2022-07-10 21:13
 * LastEditTime: 2022-07-10 21:13
 * Description: 1550. 存在连续三个奇数的数组
 */

public class P1550 {
    // code beginning
    class Solution {
        public boolean threeConsecutiveOdds(int[] arr) {
            for (int i = 0; i < arr.length - 2; i++) {
                if (arr[i] % 2 == 1 && arr[i + 1] % 2 == 1 && arr[i + 2] % 2 == 1) {
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1550().new Solution();
        Object ans = s.threeConsecutiveOdds(new int[]{1, 2, 34, 3, 4, 5, 7, 23});
        System.out.println(ans);
    }
}
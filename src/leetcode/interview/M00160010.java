package leetcode.interview;

/**
 * Author: Deean
 * Date: 2022-07-24 18:14
 * LastEditTime: 2022-07-24 18:14
 * Description: 面试题 16.10. 生存人数
 */

public class M00160010 {
    // code beginning
    class Solution {
        public int maxAliveYear(int[] birth, int[] death) {
            int[] count = new int[2001];
            for (int i = 0; i < birth.length; i++) {
                for (int j = birth[i]; j <= death[i]; j++) {
                    count[j]++;
                }
            }
            int min = 1900;
            for (int i = 1901; i <= 2000; i++) {
                if (count[min] < count[i]) min = i;
            }
            return min;
        }
    }

    public static void main(String[] args) {
        Solution s = new M00160010().new Solution();
        Object ans = s.maxAliveYear(new int[]{1900, 1901, 1950}, new int[]{1948, 1951, 2000});
        System.out.println(ans);
    }
}
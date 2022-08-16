package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-16 23:16
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 605. 种花问题
 */

public class P0605 {
    // code beginning
    class Solution {
        public boolean canPlaceFlowers(int[] flowerbed, int n) {
            for (int i = 0; i < flowerbed.length; i++) {
                if (flowerbed[i] == 0 && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) && (i == 0 || flowerbed[i - 1] == 0)) {
                    n--;
                    flowerbed[i] = 1;
                }
                if (n <= 0) return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0605().new Solution();
        Object ans = s.canPlaceFlowers(new int[]{1, 0, 0}, 1);
        System.out.println(ans);
    }
}
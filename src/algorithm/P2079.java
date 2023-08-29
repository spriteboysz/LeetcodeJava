package algorithm;

/**
 * Author: Deean
 * Date: 2022-08-10 21:51
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 2079. 给植物浇水
 */

public class P2079 {
    // code beginning
    class Solution {
        public int wateringPlants(int[] plants, int capacity) {
            int count = 0, max = capacity;
            for (int i = 0; i < plants.length; i++) {
                if (capacity >= plants[i]) {
                    count++;
                } else {
                    count += i * 2 + 1;
                    capacity = max;
                }
                capacity -= plants[i];
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2079().new Solution();
        Object ans = s.wateringPlants(new int[]{1, 1, 1, 4, 2, 3}, 4);
        System.out.println(ans);
    }
}
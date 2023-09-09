package leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-09-06 22:18
 * FileName: src/leetcode/algorithm
 * Description:2600. K 件物品的最大和
 */

public class P2600 {
    // code beginning
    class Solution {
        public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
            List<Integer> items = new ArrayList<>();
            for (int i = 0; i < numOnes; i++) {
                items.add(1);
            }
            for (int i = 0; i < numZeros; i++) {
                items.add(0);
            }
            for (int i = 0; i < numNegOnes; i++) {
                items.add(-1);
            }
            int sum = 0;
            for (int i = 0; i < k; i++) {
                sum += items.get(i);
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2600().new Solution();
        Object ans = s.kItemsWithMaximumSum(3, 2, 0, 2);
        System.out.println(ans);
    }
}

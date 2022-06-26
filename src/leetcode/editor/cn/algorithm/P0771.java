package leetcode.editor.cn.algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2022-06-26 23:13
 * LastEditTime: 2022-06-26 23:13
 * Description: 771. 宝石与石头
 */

public class P0771 {
    // code beginning
    class Solution {
        public int numJewelsInStones(String jewels, String stones) {
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < jewels.length(); i++) {
                set.add(jewels.charAt(i));
            }
            int count = 0;
            for (int i = 0; i < stones.length(); i++) {
                if (set.contains(stones.charAt(i))) count++;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0771().new Solution();
        Object ans = s.numJewelsInStones("aA", "aAAbbbb");
        System.out.println(ans);
    }
}
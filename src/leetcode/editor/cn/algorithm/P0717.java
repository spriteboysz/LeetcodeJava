package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-14 22:47
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 717. 1 比特与 2 比特字符
 */

public class P0717 {
    // code beginning
    class Solution {
        public boolean isOneBitCharacter(int[] bits) {
            int index = 0;
            while (index < bits.length - 1) {
                index += bits[index] + 1;
            }
            return index == bits.length - 1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0717().new Solution();
        Object ans = s.isOneBitCharacter(new int[]{1, 1, 1, 0});
        System.out.println(ans);
    }
}
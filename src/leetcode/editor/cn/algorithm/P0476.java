package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-09 23:57
 * LastEditTime: 2022-07-09 23:57
 * Description: 476. 数字的补数
 */

public class P0476 {
    // code beginning
    class Solution {
        public int findComplement(int num) {
            String str = Integer.toBinaryString(num);
            int complement = 0;
            for (char c : str.toCharArray()) {
                if (c == '1') {
                    complement *= 2;
                } else {
                    complement = complement * 2 + 1;
                }
            }
            return complement;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0476().new Solution();
        Object ans = s.findComplement(5);
        System.out.println(ans);
    }
}
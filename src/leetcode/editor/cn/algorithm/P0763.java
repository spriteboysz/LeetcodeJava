package leetcode.editor.cn.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-08-25 23:18
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 763. 划分字母区间
 */

public class P0763 {
    // code beginning
    class Solution {
        public List<Integer> partitionLabels(String s) {
            int[] last = new int[26];
            for (int i = 0; i < s.length(); i++) {
                last[s.charAt(i) - 'a'] = i;
            }
            List<Integer> index = new ArrayList<>();
            int start = 0, end = 0;
            for (int i = 0; i < s.length(); i++) {
                end = Math.max(end, last[s.charAt(i) - 'a']);
                if (i == end) {
                    index.add(end - start + 1);
                    start = end + 1;
                }
            }
            return index;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0763().new Solution();
        Object ans = s.partitionLabels("ababcbacadefegdehijhklij");
        System.out.println(ans);
    }
}
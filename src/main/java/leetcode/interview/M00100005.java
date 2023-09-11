package leetcode.interview;

/**
 * Author: Deean
 * Date: 2022-08-15 22:52
 * FileName: src/leetcode/editor/cn/leetcode.interview
 * Description: 面试题 10.05. 稀疏数组搜索
 */

public class M00100005 {
    // code beginning
    class Solution {
        public int findString(String[] words, String s) {
            int left = 0, right = words.length - 1;
            while (left <= right) {
                while (left <= right && words[left].equals("")) left++;
                while (left <= right && words[right].equals("")) right--;
                int mid = left + (right - left) / 2;
                while (mid <= right && words[mid].equals("")) mid++;
                if (words[mid].compareTo(s) > 0) {
                    right = mid - 1;
                } else if (words[mid].compareTo(s) < 0) {
                    left = mid + 1;
                } else {
                    return mid;
                }
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution s = new M00100005().new Solution();
        Object ans = s.findString(new String[]{"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""}, "ball");
        System.out.println(ans);
    }
}
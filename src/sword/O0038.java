package sword;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2022-08-07 23:00
 * Description: 剑指 Offer 38. 字符串的排列
 */

public class O0038 {
    // code beginning
    class Solution {
        public String[] permutation(String s) {
            Set<String> paths = new HashSet<>();
            backtrace(s.toCharArray(), "", new boolean[s.length()], paths);
            return paths.toArray(new String[0]);
        }

        private void backtrace(char[] chars, String path, boolean[] visited, Set<String> paths) {
            if (path.length() == chars.length) {
                paths.add(path);
                return;
            }
            for (int i = 0; i < chars.length; i++) {
                if (visited[i]) continue;
                visited[i] = true;
                backtrace(chars, path + chars[i], visited, paths);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new O0038().new Solution();
        String[] ans = s.permutation("abc");
        System.out.println(Arrays.toString(ans));
    }
}
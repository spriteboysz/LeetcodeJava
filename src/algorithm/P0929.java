package algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2022-08-18 00:04
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 929. 独特的电子邮件地址
 */

public class P0929 {
    // code beginning
    class Solution {
        public int numUniqueEmails(String[] emails) {
            Set<String> set = new HashSet<>();
            for (String email : emails) {
                String[] names = email.split("@");
                StringBuilder builder = new StringBuilder();
                for (char c : names[0].toCharArray()) {
                    if (c == '.') continue;
                    if (c == '+') break;
                    builder.append(c);
                }
                builder.append("@").append(names[1]);
                set.add(builder.toString());
            }
            return set.size();
        }
    }

    public static void main(String[] args) {
        Solution s = new P0929().new Solution();
        Object ans = s.numUniqueEmails(new String[]{
                "test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com"});
        System.out.println(ans);
    }
}
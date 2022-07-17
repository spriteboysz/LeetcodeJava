package leetcode.editor.cn.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Deean
 * Date: 2022-07-17 10:57
 * LastEditTime: 2022-07-17 10:57
 * Description: 535. TinyURL 的加密与解密
 */

public class P0535 {
    // code beginning
    public class Codec {
        private Map<Integer, String> database = new HashMap<>();
        private int tiny;

        // Encodes a URL to a shortened URL.
        public String encode(String longUrl) {
            tiny++;
            database.put(tiny, longUrl);
            return "http://tinyurl.com/" + tiny;
        }

        // Decodes a shortened URL to its original URL.
        public String decode(String shortUrl) {
            int key = Integer.parseInt(shortUrl.substring(shortUrl.lastIndexOf("/") + 1));
            return database.get(key);
        }
    }

    public static void main(String[] args) {
        Codec obj = new P0535().new Codec();
        String tiny = obj.encode("https://leetcode.com/problems/design-tinyurl");// 返回加密后得到的 TinyURL 。
        System.out.println(obj.decode(tiny)); // 返回解密后得到的原本的 URL 。
    }
}
package 代码随想录.字符串;

/**
 * @author pumpkin
 * @date 2022/1/20 0020 下午 14:53
 */
public class lc459_重复的子字符串 {
    class Solution {
        public boolean repeatedSubstringPattern(String s) {
            return (s + s).indexOf(s, 1) != s.length();
        }
    }
}

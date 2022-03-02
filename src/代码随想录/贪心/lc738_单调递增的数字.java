package 代码随想录.贪心;

/**
 * @author pumpkin
 * @date 2022/3/2
 */
public class lc738_单调递增的数字 {
    class Solution {
        public int monotoneIncreasingDigits(int N) {
            String[] strings = (N + "").split("");
            int start = strings.length;
            for (int i = strings.length - 1; i > 0; i--) {
                if (Integer.parseInt(strings[i]) < Integer.parseInt(strings[i - 1])) {
                    strings[i - 1] = (Integer.parseInt(strings[i - 1]) - 1) + "";
                    start = i;
                }
            }
            for (int i = start; i < strings.length; i++) {
                strings[i] = "9";
            }
            return Integer.parseInt(String.join("",strings));
        }
    }
}

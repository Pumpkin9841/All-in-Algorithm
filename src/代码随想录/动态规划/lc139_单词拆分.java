package 代码随想录.动态规划;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author pumpkin
 * @date 2022/3/12
 */
public class lc139_单词拆分 {
    class Solution {
        public boolean wordBreak(String s, List<String> wordDict) {
            boolean[] valid = new boolean[s.length() + 1];
            valid[0] = true;
            for (int i = 1; i <= s.length(); i++) {
                for (int j = 0; j < i; j++) {
                    if (wordDict.contains(s.substring(j,i)) && valid[j]) {
                        valid[i] = true;
                    }
                }
            }

            return valid[s.length()];
        }
    }
    
}

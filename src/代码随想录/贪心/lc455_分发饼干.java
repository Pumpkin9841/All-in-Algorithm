package 代码随想录.贪心;

import java.util.Arrays;

/**
 * @author pumpkin
 * @date 2022/2/24
 */
public class lc455_分发饼干 {
    class Solution {
        public int findContentChildren(int[] g, int[] s) {
            Arrays.sort(g) ;
            Arrays.sort(s) ;
            int sum = 0 ;
            int pointG = 0 ;
            int pointS = 0 ;
            while( pointG < g.length && pointS < s.length ){
                if( s[pointS] >= g[pointG] ){
                    sum++ ;
                    pointS++;
                    pointG++;
                }
                else if( s[pointS] < g[pointG] ){
                    pointS++ ;
                }
            }
            return sum ;
        }
    }
}

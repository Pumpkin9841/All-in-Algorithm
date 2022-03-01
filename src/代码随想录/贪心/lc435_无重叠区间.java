package 代码随想录.贪心;

import java.util.Arrays;

/**
 * @author pumpkin
 * @date 2022/3/1
 */
public class lc435_无重叠区间 {
    class Solution {
        public int eraseOverlapIntervals(int[][] intervals) {
            Arrays.sort(intervals , (o1, o2)-> Integer.compare(o1[0] , o2[0]));
            int count = 0 ;
            for( int i = 1 ; i < intervals.length ; i++){
                if( intervals[i][0] >= intervals[i-1][1] ){
                    continue ;
                }
                else{
                    count++ ;
                    //如果当前区间与前一个区间重叠，哪一个区间的结束位置更大，就异常哪一个。
                    intervals[i][1] = Math.min(intervals[i-1][1] , intervals[i][1]);
                }
            }
            return count ;
        }
    }
}

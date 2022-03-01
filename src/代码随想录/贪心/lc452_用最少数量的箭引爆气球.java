package 代码随想录.贪心;

import java.util.Arrays;

/**
 * @author pumpkin
 * @date 2022/3/1
 */
public class lc452_用最少数量的箭引爆气球 {
    class Solution {
        public int findMinArrowShots(int[][] points) {
            if( points.length == 0 ){
                return 0 ;
            }
            //按气球起始坐标排序
            Arrays.sort(points,(o1, o2)-> {
                return Integer.compare(o1[0] , o2[0]) ;
            });
            int count = 1 ;
            for( int i = 1 ; i < points.length ; i++ ){
                if( points[i][0] > points[i-1][1] ){  //当前气球的起始位置大于前一个气球的结束位置，则气球不重叠
                    count++ ;
                }
                else{
                    points[i][1] = Math.min(points[i][1] , points[i-1][1]) ;  // 更新重叠气球最小右边界
                }
            }
            return count ;
        }
    }
}

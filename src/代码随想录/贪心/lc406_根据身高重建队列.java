package 代码随想录.贪心;

import java.util.*;

/**
 * @author pumpkin
 * @date 2022/2/27
 */
public class lc406_根据身高重建队列 {
    class Solution {
        public int[][] reconstructQueue(int[][] people) {
            Arrays.sort( people, (o1, o2)->{
                if( o1[0] == o2[0]){
                    return o1[1] - o2[1] ;
                }
                else{
                    return o2[0] - o1[0] ;
                }
            });

            List<int[]> list = new ArrayList() ;
            for( int[] p : people ){
                list.add(p[1] , p) ;
            }
            return list.toArray(new int[people.length][]) ;
        }
    }
}

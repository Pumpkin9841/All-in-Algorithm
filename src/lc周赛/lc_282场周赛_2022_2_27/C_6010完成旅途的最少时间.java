package lc周赛.lc_282场周赛_2022_2_27;

/**
 * @author pumpkin
 * @date 2022/2/27
 */
public class C_6010完成旅途的最少时间 {
    class Solution {
        public long minimumTime(int[] time, int totalTrips) {
            long left = 1l ; //最少花费时间
            long right = 100000000000000l ; //最多可能花费的时间
            while( left<= right ){
                long mid = (left + right ) / 2 ;
                long count = 0l ;
                for( int one : time ){
                    count += mid / one ;
                }
                if( count >= totalTrips ){
                    right = mid-1 ;
                }
                else{
                    left = mid+1 ;
                }
            }
            return left ;
        }
    }
}

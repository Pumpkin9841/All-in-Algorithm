package 代码随想录.贪心;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author pumpkin
 * @date 2022/2/26
 */
public class lc135_分发糖果 {
    class Solution {
        public int candy(int[] ratings) {
            int[] candev = new int[ratings.length] ;
            //计算右边评分比左边高的孩子
            candev[0] = 1 ;
            for( int i = 1 ; i < ratings.length ; i++ ){
                if( ratings[i] > ratings[i-1] ){
                    candev[i] = candev[i-1] + 1 ;
                }
                else{
                    candev[i] = 1 ;
                }
            }
            //计算左边评分比右边评分高的孩子
            for( int i = ratings.length-2 ; i >= 0 ; i-- ){
                if( ratings[i] > ratings[i+1] ){
                    candev[i] = Math.max(candev[i] , candev[i+1]+1) ; //如果左边的已经比右边的糖果多了，就不多给糖果了
                }
            }
            return Arrays.stream(candev).sum() ;
        }
    }
}

package test;

import java.util.Arrays;

/**
 * @author pumpkin
 * @date 2022/3/7
 */
public class 背包测试01 {
    public static void main(String[] args) {
        int[] weight = {1,3,4} ;
        int[] value = {15,20,30} ;
        int bagSize = 4 ;
        testBag(weight , value ,bagSize) ;
    }

    public static void testBag( int[] weight , int[] value , int bagSize ){
        int value0 = 0 ;
        int wlen = weight.length ;
        int[][] dp = new int[wlen+1][bagSize+1] ;
        for( int i = 0 ; i <= wlen ; i++){
            dp[i][0] = value0 ;
        }

        for( int i = 1 ; i <= wlen ; i++ ){
            for( int j = 1 ; j <= bagSize ; j++ ){
                if( j < weight[i-1] ){
                    dp[i][j] = dp[i-1][j] ;
                }
                else{
                    dp[i][j] = Math.max( dp[i-1][j] , dp[i-1][j-weight[i-1]]+value[i-1] ) ;
                }
            }
        }
        for( int[] temp : dp ){
            System.out.println(Arrays.toString(temp));
        }
    }

}

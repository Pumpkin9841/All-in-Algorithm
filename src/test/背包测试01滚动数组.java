package test;

/**
 * @author pumpkin
 * @date 2022/3/7
 */
public class 背包测试01滚动数组 {
    public static void main(String[] args) {
        int[] weight = {1,3,4} ;
        int[] value = {15,20,30} ;
        int bagSize = 4 ;
        testBag(weight , value ,bagSize) ;
    }

    public static void testBag(int[] weight , int[] value , int bagSize){
        int wlen = weight.length ;
        int[] dp = new int[bagSize+1] ;

        for( int i = 0 ; i < wlen ; i++ ){
            for( int j = bagSize ; j >= weight[i] ; j--){
                dp[j] = Math.max(dp[j] , dp[j-weight[i]]+value[i]) ;
            }
        }
        for( int curr : dp ){
            System.out.println(curr);
        }
    }
}

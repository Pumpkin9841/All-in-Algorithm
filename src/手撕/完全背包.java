package 手撕;

/**
 * @author pumpkin
 * @date 2022/3/9
 */
public class 完全背包 {
    public static void main(String[] args) {
        int[] weight = {1, 3, 4};
        int[] value = {15, 20, 30};
        int bagsize = 4;
        testweightbagproblem(weight, value, bagsize);
    }

    public static void testweightbagproblem( int[] weight , int[] value , int bagsize ){
        int wlen = weight.length ;
        int[] dp = new int[bagsize+1] ;
        for( int i = 0 ; i < wlen ; i++ ){
            for( int j = weight[i] ; j <= bagsize ; j++ ){
                dp[j] = Math.max(dp[j] , dp[j-weight[i]]+value[i]) ;
            }
        }
        for( int i : dp ){
            System.out.println(i);
        }
    }
}

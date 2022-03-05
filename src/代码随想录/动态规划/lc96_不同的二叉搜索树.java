package 代码随想录.动态规划;

/**
 * @author pumpkin
 * @date 2022/3/5
 */
public class lc96_不同的二叉搜索树 {
    class Solution {
        public int numTrees(int n) {
            int[] dp = new int[n+1] ;
            //空树也是树
            dp[0] = 1 ;
            dp[1] = 1 ;
            for( int i = 2 ; i <= n ; i++ ){
                for( int j = 1 ; j <= i ;j++ ){
                    //dp[j-1]为j为根节点时，左子树的数量，dp[i-j]为j为根节点时，右子树的数量
                    dp[i] += dp[j-1] * dp[i-j] ;
                }
            }
            return dp[n] ;
        }
    }
}

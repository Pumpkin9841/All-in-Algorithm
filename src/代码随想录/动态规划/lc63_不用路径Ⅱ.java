package 代码随想录.动态规划;

/**
 * @author pumpkin
 * @date 2022/3/5
 */
public class lc63_不用路径Ⅱ {
    class Solution {
        public int uniquePathsWithObstacles(int[][] obstacleGrid) {
            //起始点有障碍物，无法行走，直接返回0
            if( obstacleGrid[0][0] == 1  ){
                return 0 ;
            }
            int m = obstacleGrid.length ; //行
            int n = obstacleGrid[0].length ; //列
            int[][] dp = new int[m][n] ;
            for( int i = 0 ; i < m ; i++ ){
                //遇到障碍物，后面的路就走不通了，所以直接break
                if( obstacleGrid[i][0] == 1 ){
                    break ;
                }
                dp[i][0] = 1 ;
            }
            for( int j = 0 ; j < n ; j++ ){
                if( obstacleGrid[0][j] == 1 ){
                    break  ;
                }
                dp[0][j] = 1 ;
            }
            for( int i = 1 ; i < m ; i++ ){
                for( int j = 1 ; j < n ; j++ ){
                    if( obstacleGrid[i][j] == 1 ){
                        continue ;
                    }
                    dp[i][j] = dp[i-1][j] + dp[i][j-1] ;
                }
            }

            // for( int[] a : dp ){
            //     for( int b : a ){
            //         System.out.println(b) ;
            //     }
            // }

            return dp[m-1][n-1] ;
        }
    }
}

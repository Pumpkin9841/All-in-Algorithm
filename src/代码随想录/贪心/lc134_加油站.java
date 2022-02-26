package 代码随想录.贪心;

/**
 * @author pumpkin
 * @date 2022/2/26
 */
public class lc134_加油站 {
    class Solution {
        public int canCompleteCircuit(int[] gas, int[] cost) {
            int currGas = 0 ;
            int totalGas = 0 ; //汽油总量-耗费总量  如果totalGas大于0，说明肯定能在某个起点跑完一圈
            int start = 0 ; //其实位置
            for( int i = 0 ; i < gas.length ; i++ ){
                currGas += gas[i]- cost[i] ;
                totalGas += gas[i] - cost[i] ;
                if( currGas < 0 ){
                    start = i+1 ;
                    currGas = 0 ;
                }
            }
            if( totalGas < 0 ){
                return -1 ;
            }
            return start ;
        }
    }
}

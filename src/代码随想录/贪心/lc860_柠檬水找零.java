package 代码随想录.贪心;

/**
 * @author pumpkin
 * @date 2022/2/27
 */
public class lc860_柠檬水找零 {
    class Solution {
        public boolean lemonadeChange(int[] bills) {
            int left5 = 0 ;
            int left10 = 0 ;
            for( int i = 0 ; i < bills.length ; i++ ){
                if( bills[i] == 5 ){
                    left5++ ;
                }
                else if( bills[i] == 10 ){
                    left5-- ;
                    left10++ ;
                }
                else if( bills[i] == 20 ){
                    if( left10 > 0 ){
                        left10-- ;
                        left5-- ;
                    }
                    else{
                        left5 -= 3 ;
                    }
                }
                if( left5 < 0 || left10 < 0 ){
                    return false ;
                }
            }

            return true ;
        }
    }
}

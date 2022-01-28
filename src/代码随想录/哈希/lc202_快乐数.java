package 代码随想录.哈希;

import java.util.HashSet;
import java.util.Set;

/**
 * @author pumpkin
 * @date 2022/1/15 0015 下午 17:21
 */
public class lc202_快乐数 {
    class Solution {
        public boolean isHappy(int n) {
            Set<Integer> set = new HashSet() ;
            while( n != 1 && !set.contains(n) ){
                set.add(n) ;
                n = getSum(n) ;

            }
            return n == 1 ;
        }

        public int getSum( int n ){
            int sum = 0 ;
            while( n > 0){
                int temp = n % 10 ;
                sum += temp * temp ;
                n /= 10 ;
            }
            return sum ;
        }
    }
}

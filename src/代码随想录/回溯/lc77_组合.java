package 代码随想录.回溯;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pumpkin
 * @date 2022/2/15 0015 下午 15:54
 */
public class lc77_组合 {
    class Solution {
        List<List<Integer>> ans = new ArrayList() ;
        List<Integer> path = new ArrayList() ;
        public List<List<Integer>> combine(int n, int k) {
            bakctrack(n , k , 1) ;
            return ans ;
        }

        public void bakctrack( int n , int k , int startIndex ){
            if( path.size() == k ){
                ans.add(new ArrayList<>(path)) ;
                return ;
            }
            for( int i = startIndex ; i <= n ; i++ ){
                path.add(i) ;
                bakctrack(n , k , i+1) ;
                path.remove(path.size()-1) ; //回溯
            }
        }
    }
}

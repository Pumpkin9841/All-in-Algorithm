package 代码随想录.回溯;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pumpkin
 * @date 2022/2/15 0015 下午 16:03
 */
public class lc216_组合总和Ⅲ {
    class Solution {
        List<List<Integer>> ans = new ArrayList() ;
        List<Integer> path = new ArrayList() ;
        public List<List<Integer>> combinationSum3(int k, int n) {
            backtrack(k , n ,1) ;
            return ans ;
        }

        public void backtrack(int k , int targetSum , int startIndex){
            //剪纸，如果已选的元素已经大于targetSum,直接返回
            if( targetSum < 0 ){
                return ;
            }
            if( path.size() == k && targetSum == 0){
                ans.add(new ArrayList<>(path)) ;
                return ;
            }
            for( int i = startIndex ; i <= 9 ; i++ ){
                path.add(i) ;
                backtrack(k , targetSum-i , i+1) ;
                path.remove(path.size()-1) ; //回溯
            }
        }
    }
}

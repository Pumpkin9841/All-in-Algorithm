package 代码随想录.回溯;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pumpkin
 * @date 2022/2/16 0016 下午 13:54
 */
public class lc39_组合总和 {
    class Solution {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> ret = new ArrayList() ;
            List<Integer> path = new ArrayList() ;
            backstrack(candidates , target , path , ret , 0) ;
            return ret ;
        }
        public void backstrack( int[] candidates , int target , List<Integer> path , List<List<Integer>> ret , int startIndex ){
            if( target < 0 ){
                return ;
            }
            if( target == 0 ){
                ret.add(new ArrayList<Integer>(path)) ;
                return ;
            }
            for( int i = startIndex ; i < candidates.length ; i++ ){
                path.add(candidates[i]) ;
                backstrack(candidates , target-candidates[i] , path , ret , i) ; //不用i+1 代表下一层元素可以复用
                path.remove(path.size()-1); //回溯
            }
        }
    }
}

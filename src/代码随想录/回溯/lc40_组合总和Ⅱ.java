package 代码随想录.回溯;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author pumpkin
 * @date 2022/2/16 0016 下午 15:09
 */
public class lc40_组合总和Ⅱ {
    class Solution {
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            List<List<Integer>> ret = new ArrayList() ;
            Arrays.sort(candidates) ;
            boolean[] flag = new boolean[candidates.length] ;
            backstrack(candidates , target , new ArrayList<Integer>() , ret , 0 , flag) ;
            return ret ;
        }

        public void backstrack(int[] candidates , int target , List<Integer> path , List<List<Integer>> ret
                , int startIndex , boolean[] flag){
            if( target < 0 ){
                return ;
            }
            if( target == 0 ){
                ret.add(new ArrayList<>(path)) ;
            }
            for( int i = startIndex ; i < candidates.length ; i++){
                if( i > 0 && candidates[i] == candidates[i-1] && !flag[i-1]){
                    continue ;
                }
                flag[i] = true ;
                path.add(candidates[i]) ;
                backstrack(candidates , target-candidates[i] , path , ret , i+1 ,flag) ;
                path.remove(path.size()-1) ; //回溯
                flag[i] =false ;
            }
        }
    }
}

package 代码随想录.回溯;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pumpkin
 * @date 2022/2/19 0019 下午 14:23
 */
public class lc78_子集 {
    class Solution {
        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> ans = new ArrayList() ;
            List<Integer> path = new ArrayList() ;
            backtrack(nums, path, 0 , ans) ;
            return ans ;
        }
        public void backtrack( int[] nums , List<Integer> path , int startIndex , List<List<Integer>> ans ){
            ans.add(new ArrayList(path)) ;
            if( startIndex >= nums.length ){
                return ;
            }
            for( int i = startIndex ; i < nums.length ; i++ ){
                path.add(nums[i]) ;
                backtrack(nums, path , i+1 , ans) ;
                path.remove(path.size()-1) ;
            }
        }
    }
}

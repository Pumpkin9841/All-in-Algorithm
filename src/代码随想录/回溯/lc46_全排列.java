package 代码随想录.回溯;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pumpkin
 * @date 2022/2/23
 */
public class lc46_全排列 {
    //全排列问题不用startIndex
    class Solution {
        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> ans = new ArrayList() ;
            List<Integer> path = new ArrayList() ;
            boolean[] used = new boolean[nums.length] ;
            backtrack(nums,used,path,ans) ;
            return ans ;
        }

        public void backtrack( int nums[], boolean[] used, List<Integer> path, List<List<Integer>> ans ){
            if( path.size() == nums.length ){
                ans.add(new ArrayList(path)) ;
                return ;
            }

            for( int i = 0; i < nums.length; i++ ){
                if( used[i] ){
                    continue ;
                }
                used[i] = true ;
                path.add(nums[i]) ;
                backtrack(nums, used, path, ans) ;
                used[i] = false ;
                path.remove(path.size()-1) ;
            }
        }

    }
}

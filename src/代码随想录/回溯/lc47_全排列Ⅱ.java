package 代码随想录.回溯;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author pumpkin
 * @date 2022/2/23
 */
public class lc47_全排列Ⅱ {
    class Solution {
        public List<List<Integer>> permuteUnique(int[] nums) {
            Arrays.sort(nums) ;
            List<List<Integer>> ans = new ArrayList() ;
            List<Integer> path = new ArrayList() ;
            boolean[] used = new boolean[nums.length] ;  //记录path用过的元素
            boolean[] flag = new boolean[nums.length] ; //flag == true 表示树枝用过  flag==false表示树层用过
            backtrack(nums, used, flag, path, ans) ;
            return ans ;
        }

        public void backtrack( int nums[], boolean[] used, boolean[] flag, List<Integer> path, List<List<Integer>> ans ){
            if( path.size() == nums.length ){
                ans.add(new ArrayList(path)) ;
                return ;
            }

            for( int i = 0 ; i < nums.length ; i++ ){
                if( used[i] ){
                    continue ;
                }

                if( i > 0 && nums[i] == nums[i-1] && !flag[i-1] ){ //重复元素 跳过
                    continue ;
                }

                used[i] = true ;
                flag[i] = true ;
                path.add(nums[i]) ;
                backtrack(nums, used, flag, path, ans) ;
                used[i] = false ;
                flag[i] = false ;
                path.remove(path.size()-1) ;
            }
        }
    }
}

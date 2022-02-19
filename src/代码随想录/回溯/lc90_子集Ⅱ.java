package 代码随想录.回溯;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author pumpkin
 * @date 2022/2/19 0019 下午 14:41
 */
public class lc90_子集Ⅱ {
    class Solution {
        public List<List<Integer>> subsetsWithDup(int[] nums) {
            Arrays.sort(nums) ;
            List<List<Integer>> ans = new ArrayList() ;
            List<Integer> path = new ArrayList() ;
            boolean[] used = new boolean[nums.length] ; //used[i] = true 表示该树枝已经使用过nums[i]  used[i]=false 表示该数层使用过nums[i]
            backtrack(nums, 0, used, path, ans) ;
            return ans ;
        }

        public void backtrack( int[] nums, int startIndex, boolean[] used, List<Integer> path , List<List<Integer>> ans ){
            ans.add(new ArrayList(path)) ;
            if( startIndex >= nums.length ){
                return ;
            }
            for( int i = startIndex ; i < nums.length ; i++ ){
                if( i > 0 && nums[i] == nums[i-1] && !used[i-1] ){
                    continue ;
                }
                used[i] = true ; //树枝上使用过
                path.add(nums[i]) ;
                backtrack(nums, i+1, used, path, ans) ;
                used[i] = false ;
                path.remove(path.size()-1) ;
            }
        }
    }
}

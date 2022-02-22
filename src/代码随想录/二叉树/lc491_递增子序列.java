package 代码随想录.二叉树;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class lc491_递增子序列 {
    class Solution {
        public List<List<Integer>> findSubsequences(int[] nums) {
            List<List<Integer>> ans = new ArrayList() ;
            List<Integer> path = new ArrayList() ;
            backtrack(nums, 0, path, ans) ;
            return ans ;
        }

        public void backtrack( int[] nums, int startIndex, List<Integer> path, List<List<Integer>> ans ){
            if( path.size() >= 2 ){
                ans.add(new ArrayList(path)) ;
            }
            if( startIndex >= nums.length ){
                return ;
            }
            Set<Integer> set = new HashSet() ;
            for( int i = startIndex ; i < nums.length; i++ ){
                //如果当前元素比path最后一个元素小，或者本层已经使用过  则跳过该元素
                if( path.size() != 0 && nums[i] < path.get(path.size()-1) || set.contains(nums[i]) ){
                    continue ;
                }
                set.add(nums[i]) ; //使用set对本层元素进行去重
                path.add(nums[i]) ;
                backtrack(nums, i+1, path, ans) ;
                path.remove(path.size()-1) ;
            }
        }
    }
}

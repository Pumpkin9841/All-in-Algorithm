package 代码随想录.二叉树;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pumpkin
 * @date 2022/2/10 0010 下午 13:16
 */
public class lc113_路径总和Ⅱ {
    class Solution {
        public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
            List<List<Integer>> ans = new ArrayList() ;
            if( root == null ){
                return ans ;
            }
            List<Integer> path = new ArrayList() ;
            traversal( root , path , ans ,targetSum ) ;
            return ans ;
        }

        public void traversal( TreeNode root , List<Integer> path , List<List<Integer>> ans , int targetSum ){
            path.add(root.val) ;
            if( root.left == null && root.right == null ){
                int sum = 0 ;
                for( int i : path ){
                    sum += i ;
                }
                if( sum == targetSum ){
                    // System.out.println(path) ;
                    /**
                     *   res.add(new ArrayList(path))：开辟一个独立地址，地址中存放的内容为path链表，后续path的变化不会影响到res
                     *   res.add(path)：将res尾部指向了path地址，后续path内容的变化会导致res的变化。
                     */
                    ans.add(new ArrayList<>(path)) ;
                }
            }
            if( root.left != null ){
                traversal(root.left , path , ans , targetSum) ;
                path.remove(path.size()-1) ; //回溯
            }
            if( root.right != null ){
                traversal(root.right , path ,ans ,targetSum) ;
                path.remove(path.size()-1) ; //回溯
            }
        }
    }
}

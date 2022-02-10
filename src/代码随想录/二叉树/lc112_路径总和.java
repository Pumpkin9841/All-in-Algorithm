package 代码随想录.二叉树;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pumpkin
 * @date 2022/2/10 0010 下午 13:15
 */
public class lc112_路径总和 {
    class Solution {
        private boolean flag = false ;
        public void traversal(TreeNode root , List<Integer> path , int targetSum ){
            path.add(root.val) ;
            if( root.left == null && root.right == null ){
                int sum = 0 ;
                for( int i : path ){
                    sum += i ;
                }
                if( sum == targetSum ){
                    flag = true ;
                }
            }
            if( root.left != null ){
                traversal(root.left , path , targetSum) ;
                path.remove(path.size()-1) ; //回溯
            }
            if( root.right != null ){
                traversal(root.right , path , targetSum) ;
                path.remove(path.size()-1) ;
            }
        }

        public boolean hasPathSum(TreeNode root, int targetSum) {
            if( root == null ){
                return false ;
            }
            List<Integer> path = new ArrayList() ;
            traversal(root , path , targetSum) ;
            return flag ;
        }
    }
}

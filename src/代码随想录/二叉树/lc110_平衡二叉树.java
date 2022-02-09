package 代码随想录.二叉树;

/**
 * @author pumpkin
 * @date 2022/2/9 0009 下午 12:10
 */
public class lc110_平衡二叉树 {
    class Solution {
        public boolean isBalanced(TreeNode root) {
            if( root == null ){
                return true ;
            }
            return Math.abs( maxDeepth(root.left) - maxDeepth(root.right) ) <= 1 && isBalanced(root.left) && isBalanced(root.right) ;
        }

        private int maxDeepth(TreeNode root){
            if( root == null ){
                return 0 ;
            }
            int leftHeight = maxDeepth(root.left) ;
            int rightHeight = maxDeepth(root.right) ;
            return Math.max(leftHeight , rightHeight) + 1;
        }
    }
}

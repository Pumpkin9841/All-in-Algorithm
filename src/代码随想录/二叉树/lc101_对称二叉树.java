package 代码随想录.二叉树;

/**
 * @author pumpkin
 * @date 2022/2/8 0008 下午 18:21
 */
public class lc101_对称二叉树 {
    class Solution {
        public boolean isSymmetric(TreeNode root) {
            return isSymmetricHelper(root , root) ;
        }

        public boolean isSymmetricHelper( TreeNode left , TreeNode right ){
            if( left == null && right == null ){
                return true ;
            }
            if( left == null || right == null ){
                return false ;
            }
            return (left.val == right.val) && isSymmetricHelper(left.right , right.left) && isSymmetricHelper(left.left , right.right) ;
        }
    }
}

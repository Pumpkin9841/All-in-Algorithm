package 代码随想录.二叉树;

/**
 * @author pumpkin
 * @date 2022/2/12 0012 下午 15:29
 */
public class lc236_二叉树的最近公共祖先 {
    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if( root == null || root == p || root == q ){
                return root ;
            }
            TreeNode left = lowestCommonAncestor(root.left , p , q) ;
            TreeNode right = lowestCommonAncestor(root.right , p , q) ;
            if( left == null && right == null ){
                return null ;
            }
            else if( left == null && right != null ){
                return right ;
            }
            else if( left != null && right == null ){
                return left ;
            }
            else{
                return root ;
            }
        }
    }
}

package 代码随想录.二叉树;

/**
 * @author pumpkin
 * @date 2022/2/13 0013 下午 12:35
 */
public class lc235_二叉搜索树的最近公共祖先 {
    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if( root == null ){
                return root ;
            }
            if( root.val > p.val && root.val > q.val ){
                TreeNode left = lowestCommonAncestor(root.left , p , q) ;
                if( left != null ){
                    return left ;
                }
            }
            if( root.val < p.val && root.val < q.val ){
                TreeNode right = lowestCommonAncestor(root.right , p , q) ;
                if( right != null ){
                    return right ;
                }
            }
            return root ;
        }
    }
}

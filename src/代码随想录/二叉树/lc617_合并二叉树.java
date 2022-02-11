package 代码随想录.二叉树;

/**
 * @author pumpkin
 * @date 2022/2/11 0011 下午 14:27
 */
public class lc617_合并二叉树 {
    class Solution {
        public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
            if( root1 == null ){
                return root2 ;
            }
            if( root2 == null ){
                return root1 ;
            }
            TreeNode root = new TreeNode(root1.val + root2.val) ;
            root.left = mergeTrees(root1.left , root2.left) ;
            root.right = mergeTrees(root1.right , root2.right) ;
            return root ;
        }
    }
}

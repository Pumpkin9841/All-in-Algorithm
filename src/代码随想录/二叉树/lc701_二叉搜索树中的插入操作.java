package 代码随想录.二叉树;

/**
 * @author pumpkin
 * @date 2022/2/13 0013 下午 13:42
 */
public class lc701_二叉搜索树中的插入操作 {
    class Solution {
        public TreeNode insertIntoBST(TreeNode root, int val) {
            if( root == null ){
                root = new TreeNode(val) ;
                return root ;
            }
            //下一层会将插入的节点返回，本层用root->left或者root->right将其接住
            if( root.val > val ){
                root.left = insertIntoBST(root.left , val) ;
            }
            else if( root.val < val ){
                root.right = insertIntoBST(root.right , val) ;
            }
            return root ;
        }
    }
}

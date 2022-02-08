package 代码随想录.二叉树;

/**
 * @author pumpkin
 * @date 2022/2/8 0008 下午 18:00
 */
public class lc226_翻转二叉树 {
    class Solution {
        public TreeNode invertTree(TreeNode root) {
            if( root == null ){
                return root ;
            }
            invertTree(root.left) ;
            invertTree(root.right) ;
            TreeNode temp = root.left ;
            root.left = root.right ;
            root.right = temp ;
            return root ;
        }
    }
}

package 代码随想录.二叉树;

/**
 * @author pumpkin
 * @date 2022/2/7 0007 下午 15:34
 */
public class lc104_二叉树的最大深度 {
    class Solution {
        public int maxDepth(TreeNode root) {
            if( root == null ){
                return 0 ;
            }
            int left = maxDepth(root.left) ;
            int right = maxDepth(root.right) ;
            return Math.max(left , right) + 1 ;
        }
    }
}

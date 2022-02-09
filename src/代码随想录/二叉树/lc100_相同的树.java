package 代码随想录.二叉树;

/**
 * @author pumpkin
 * @date 2022/2/9 0009 下午 14:04
 */
public class lc100_相同的树 {
    class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if( p == null && q == null ){
                return true ;
            }
            if( p == null || q == null ){
                return false ;
            }
            return q.val == p.val && isSameTree(p.left , q.left) && isSameTree(p.right , q.right) ;
        }

    }
}

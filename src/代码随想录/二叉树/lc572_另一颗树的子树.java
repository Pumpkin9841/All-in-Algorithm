package 代码随想录.二叉树;

/**
 * @author pumpkin
 * @date 2022/2/9 0009 下午 14:19
 */
public class lc572_另一颗树的子树 {
    class Solution {
        boolean flag = false ;
        public boolean isSubtree(TreeNode root, TreeNode subRoot) {
            if( root == null ){
                return flag ;
            }
            if( isSameTree(root , subRoot) ){
                flag = true ;
            }
            isSubtree(root.left , subRoot) ;
            isSubtree(root.right , subRoot) ;

            return flag ;
        }

        public boolean isSameTree( TreeNode p , TreeNode q ){
            if( p == null && q == null ){
                return true ;
            }

            if( p == null || q == null ){
                return false ;
            }
            return p.val == q.val && isSameTree(p.left , q.left) && isSameTree(p.right , q.right) ;
        }
    }
}

package 代码随想录.二叉树;

/**
 * @author pumpkin
 * @date 2022/2/9 0009 下午 14:26
 */
public class lc404_左叶子之和 {
    class Solution {
        int ans ;

        public boolean isLeftLeaves(TreeNode root){
            if( root == null ){
                return false ;
            }

            if( root.left == null && root.right == null ){
                return true ;
            }

            return false ;
        }

        public void getLeftLeaves(TreeNode root){

            if( isLeftLeaves(root.left) ){
                ans += root.left.val ;
            }
        }

        public int sumOfLeftLeaves(TreeNode root) {
            if(root == null){
                return 0 ;
            }
            sumOfLeftLeaves(root.left) ;
            sumOfLeftLeaves(root.right) ;
            getLeftLeaves(root) ;
            return ans ;
        }
    }
}

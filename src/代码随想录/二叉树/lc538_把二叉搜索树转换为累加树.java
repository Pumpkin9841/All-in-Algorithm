package 代码随想录.二叉树;

/**
 * @author pumpkin
 * @date 2022/2/14 0014 下午 13:57
 */
public class lc538_把二叉搜索树转换为累加树 {
    class Solution {
        int sum = 0 ;
        public TreeNode convertBST(TreeNode root) {
            deInorder(root) ;
            return root ;
        }
        //反中序遍历
        public void deInorder(TreeNode root){
            if( root == null ){
                return ;
            }
            deInorder(root.right) ;
            sum += root.val ;
            root.val = sum ;
            deInorder(root.left) ;
        }
    }
}

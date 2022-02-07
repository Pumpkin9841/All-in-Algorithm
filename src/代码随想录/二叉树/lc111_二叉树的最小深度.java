package 代码随想录.二叉树;

/**
 * @author pumpkin
 * @date 2022/2/7 0007 下午 15:34
 */
public class lc111_二叉树的最小深度 {
    class Solution {
        public int minDepth(TreeNode root) {
            if(root == null){
                return 0 ;
            }else{
                int left = minDepth(root.left) ;
                int right = minDepth(root.right) ;
                if(left == 0){                      //如果没有左子树，则树的最小深度为右子树的深度
                    return right + 1 ;
                }
                if(right == 0){                     //如果没有右子树，则最小深度为左子树的深度
                    return left + 1 ;
                }
                return Math.min(left , right) + 1 ;  //既有左子树又有右子树，则最小深度为两者较小者
            }
        }
    }
}

package 代码随想录.二叉树;

/**
 * @author pumpkin
 * @date 2022/2/11 0011 下午 14:40
 */
public class lc700_二叉搜索树中的搜索 {
    //递归
    class Solution {
        public TreeNode searchBST(TreeNode root, int val) {
            if( root == null || root.val == val ){
                return root ;
            }
            if( root.val > val ){
                return searchBST(root.left ,val) ;
            }
            if( root.val < val ){
                return searchBST(root.right ,val) ;
            }
            return null ;
        }
    }

    //迭代
    class Solution1 {
        public TreeNode searchBST(TreeNode root, int val) {
            if( root == null  ){
                return root ;
            }
            while( root != null ){
                if( root.val == val ){
                    return root ;
                }
                else if( root.val > val ){
                    root = root.left ;
                }
                else if( root.val < val ){
                    root = root.right ;
                }
            }
            return null ;
        }
    }
}

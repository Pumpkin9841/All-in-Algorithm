package 代码随想录.二叉树;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pumpkin
 * @date 2022/2/11 0011 下午 15:03
 */
public class lc98_验证二叉搜索树 {
    class Solution {
        List<Long> list = new ArrayList() ;
        public boolean isValidBST(TreeNode root) {
            inorder(root) ;
            for( int i = 1 ; i < list.size() ; i++ ){
                if( list.get(i) - list.get(i-1) <= 0 ){
                    return false ;
                }
            }
            return true ;
        }
        public void inorder(TreeNode root){
            if( root == null ){
                return ;
            }
            inorder(root.left) ;
            list.add((long)root.val) ;
            inorder(root.right) ;
        }
    }
}

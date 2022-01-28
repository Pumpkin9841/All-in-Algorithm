package 代码随想录.二叉树;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * @author pumpkin
 * @date 2022/1/28 0028 下午 15:05
 */
public class lc145_二叉树的后序遍历 {
    class TreeNode{
        int val ;
        TreeNode left ;
        TreeNode right ;
        public TreeNode(){

        }
        public TreeNode(int val , TreeNode left , TreeNode right){
            this.val = val ;
            this.left = left ;
            this.right = right ;
        }
    }
    //递归解法
    class Solution {
        public List<Integer> postorderTraversal(TreeNode root) {
            List<Integer> ans = new ArrayList() ;
            postorderTraversalHelper(root , ans) ;
            return ans ;
        }
        public void postorderTraversalHelper( TreeNode root , List<Integer> ans ){
            if( root == null ){
                return ;
            }
            postorderTraversalHelper(root.left , ans) ;
            postorderTraversalHelper(root.right , ans) ;
            ans.add(root.val) ;
        }
    }
    //迭代解法
    //后序遍历为左右中，前序遍历为中左右，所以只需要改变前序遍历的顺序为中右左，然后逆序输出即为左右中
    class Solution1 {
        public List<Integer> postorderTraversal(TreeNode root) {
            List<Integer> ans = new ArrayList() ;
            Stack<TreeNode> st = new Stack() ;
            if(root != null) st.push(root) ;
            while( !st.empty() ){
                TreeNode node = st.pop() ;
                ans.add(node.val) ;
                if( node.left != null ){
                    st.push(node.left) ;
                }
                if( node.right != null ){
                    st.push(node.right) ;
                }
            }
            Collections.reverse(ans) ;
            return ans ;
        }
    }
}

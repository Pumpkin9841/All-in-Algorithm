package 代码随想录.二叉树;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * @author pumpkin
 * @date 2022/1/28 0028 下午 14:58
 */
public class lc144_二叉树的前序遍历 {
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
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> ans = new ArrayList() ;
            preorderTraversalHelper(root , ans) ;
            return ans ;
        }
        public void preorderTraversalHelper( TreeNode root , List<Integer> list ){
            if( root == null ){
                return ;
            }
            list.add(root.val) ;
            preorderTraversalHelper(root.left , list) ;
            preorderTraversalHelper(root.right, list) ;
        }
    }
    //迭代解法
    class Solution1 {
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> ans = new ArrayList() ;
            Stack<TreeNode> st = new Stack() ;
            if( root != null ){
                st.push(root) ;
            }
            while( !st.empty() ){
                TreeNode node = st.pop() ;
                ans.add(node.val) ;
                if( node.right != null ){
                    st.push(node.right) ;
                }
                if( node.left != null ){
                    st.push(node.left) ;
                }
            }
            return ans ;
        }
    }


}

package 代码随想录.二叉树;

import java.util.*;

/**
 * @author pumpkin
 * @date 2022/1/28 0028 下午 15:09
 */
public class lc94_二叉树的中序遍历 {
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

        public void inorderTraversalHelper( TreeNode root , List<Integer> ans ){
            if( root == null ){
                return ;
            }
            inorderTraversalHelper(root.left , ans) ;
            ans.add(root.val) ;
            inorderTraversalHelper(root.right , ans );
        }
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> ans = new ArrayList() ;
            inorderTraversalHelper(root , ans);
            return ans ;
        }
    }

    //迭代解法
    class Solution1 {

        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> ans = new ArrayList() ;
            Stack<TreeNode> st = new Stack() ;
            TreeNode curr = root ;
            while( curr != null || !st.empty() ){
                if( curr != null ){
                    st.push(curr) ;
                    curr = curr.left ;
                }
                else{
                    curr = st.pop() ;
                    ans.add(curr.val) ;
                    curr = curr.right ;
                }
            }
            return ans ;
        }
    }

}

package 代码随想录.二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author pumpkin
 * @date 2022/1/28 0028 下午 16:02
 */
public class lc102_二叉树的层序遍历 {
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
    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> ans = new ArrayList() ;
            Queue<TreeNode> q = new LinkedList() ;
            if( root != null ) q.offer(root) ;
            while( q.size() != 0 ){
                int size = q.size() ;
                List<Integer> list = new ArrayList() ;
                for( int i = 0 ; i < size ; i++ ){
                    TreeNode node = q.poll() ;
                    list.add(node.val) ;
                    if( node.left != null ) q.offer(node.left) ;
                    if( node.right != null ) q.offer(node.right) ;
                }
                ans.add(list) ;
            }
            return ans ;
        }
    }
}

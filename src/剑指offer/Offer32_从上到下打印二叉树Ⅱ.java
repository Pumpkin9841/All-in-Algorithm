package 剑指offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author pumpkin
 * @date 2022/3/14
 */
public class Offer32_从上到下打印二叉树Ⅱ {
    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> ans = new ArrayList() ;
            Queue<TreeNode> q = new LinkedList() ;
            if( root != null ){
                q.offer(root) ;
            }
            while( q.size() != 0 ){
                int size = q.size() ;
                List<Integer> level = new ArrayList() ;
                for( int i = 0 ; i < size ; i++ ){
                    TreeNode node = q.poll() ;
                    level.add(node.val) ;
                    if( node.left != null ){
                        q.offer(node.left) ;
                    }
                    if( node.right != null ){
                        q.offer(node.right) ;
                    }
                }
                ans.add(level) ;
            }
            return ans ;
        }
    }
}

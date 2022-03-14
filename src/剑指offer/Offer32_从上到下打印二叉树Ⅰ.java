package 剑指offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author pumpkin
 * @date 2022/3/14
 */
public class Offer32_从上到下打印二叉树Ⅰ {
    class Solution {
        List<Integer> list = new ArrayList() ;
        public int[] levelOrder(TreeNode root) {
            Queue<TreeNode> q = new LinkedList() ;
            if( root != null ){
                q.offer(root) ;
            }
            while( q.size() != 0 ){
                TreeNode node = q.poll() ;
                list.add(node.val) ;
                if( node.left != null ){
                    q.offer(node.left) ;
                }
                if( node.right != null ){
                    q.offer(node.right) ;
                }
            }
            int[] ans = list.stream().mapToInt(Integer::valueOf).toArray() ;
            return ans ;
        }
    }
}

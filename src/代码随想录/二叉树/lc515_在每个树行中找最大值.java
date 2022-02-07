package 代码随想录.二叉树;

import java.util.*;

/**
 * @author pumpkin
 * @date 2022/2/7 0007 下午 14:57
 */
public class lc515_在每个树行中找最大值 {
    class Solution {
        public List<Integer> largestValues(TreeNode root) {
            List<Integer> ans = new ArrayList() ;
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
                ans.add( Collections.max(level) ) ;
            }
            return ans ;
        }
    }
}

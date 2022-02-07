package 代码随想录.二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author pumpkin
 * @date 2022/2/7 0007 下午 14:46
 */
public class lc637_二叉树的层平均值 {
    class Solution {
        public List<Double> averageOfLevels(TreeNode root) {
            List<Double> ans = new ArrayList() ;
            Queue<TreeNode> q = new LinkedList() ;
            if( root != null ){
                q.offer(root) ;
            }
            while( q.size() != 0 ){
                int size = q.size() ;
                Double sum = 0.0 ;
                for( int i = 0 ; i < size ; i++ ){
                    TreeNode node = q.poll() ;
                    sum += node.val ;
                    if( node.left != null ){
                        q.offer(node.left) ;
                    }
                    if( node.right != null ){
                        q.offer(node.right) ;
                    }
                }
                ans.add( (sum/size)*1.0 ) ;
            }
            return ans ;
        }
    }
}
